package week10;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame {
	private String[] names = {"Backspace","","","CE","C","7","8","9","/","sqrt","4","5","6","x","%","1","2","3"
	         ,"-","1/x","0","+/-",".","+","="};
   public Calculator() {
      setSize(500,250);
      setTitle("°è»ê±â");
      JPanel panel = new JPanel();
      JPanel A = new JPanel();
      
      JTextField Field = new JTextField(48);
      A.add(Field);
      panel.add(A);
      
      JPanel B = new JPanel(new GridLayout(5,5,3,3));
      JButton K[] = new JButton[names.length];
      for(int count = 0; count<names.length; count++) {
         K[count] = new JButton(names[count]);
         K[count].setBackground(Color.YELLOW);
         if(count%5 == 3 || count%5 == 4) {
            K[count].setForeground(Color.red);
         }
         else {
        	 K[count].setForeground(Color.blue);
         }
         B.add(K[count]);
      }
      panel.add(B);
      add(panel);
      setVisible(true);
   }

   public static void main(String[] args) {
      Calculator f = new Calculator();

   }

}