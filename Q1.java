package homework2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		boolean c;
		System.out.println(" ������ �Է��Ͻÿ�");
		a = input.nextInt();
		System.out.println(" ������ �Է��Ͻÿ�");
		b = input.nextInt();
		
		c = (a>b);
		System.out.println(a +">"+b +"---" +c);
		c = (a<b);
		System.out.println(a +"<"+b +"---" +c);
		c = (a>=b);
		System.out.println(a +">="+b +"---" +c);
		c = (a<=b);
		System.out.println(a +"<="+b +"---" +c);
		input.close();
	}

}
