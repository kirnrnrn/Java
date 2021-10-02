package homework1;

import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double yard ;
		double cm;
		
		
		System.out.println("yard?");
		yard = input.nextDouble();
		cm = 91.44*yard;
		System.out.println(Math.round(cm*10)/10.0);
	
		input.close();
	}

}
