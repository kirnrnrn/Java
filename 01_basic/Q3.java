package homework1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int sum;
		
		System.out.println("정수를 입력하시오:");
		a = input.nextInt();
	
		System.out.println("정수를 입력하시오:");
		b = input.nextInt();
		
		sum = a + b;
		System.out.println("10+20=" + sum);
		
		input.close();
		
	

	}

}
