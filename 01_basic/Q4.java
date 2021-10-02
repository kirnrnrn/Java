package homework1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int sum;
		int avg;
		
		
		System.out.println("정수를 입력하시오");
		a = input.nextInt();
		System.out.println("정수를 입력하시오");
		b = input.nextInt();
		System.out.println("정수를 입력하시오");
		c = input.nextInt();
		
		sum = a + b + c;
		avg = sum/3;
		
		System.out.println("세 개의 정수의 합:" + sum);
		System.out.println("세 개의 정수의 평균:" + avg);
		
		input.close();
	}

}
