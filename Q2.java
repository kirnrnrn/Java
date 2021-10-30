package homework2;
import java.util.Scanner;
//저 지난번부터 system.out.printf();가 오류가 떴는데 교수님께서 println으로 하라고 하셔서 그냥 println오로 하겠습니다~

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		
		System.out.println("정수를 입력하시오");
		a = input.nextInt();
		System.out.println("정수를 입력하시오");
		b = input.nextInt();
		System.out.println("정수를 입력하시오");
		c = input.nextInt();
		
		if (a>b) {
			if(a>c) {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
		
		if (a == b) {
			if (a == c)
			{			System.out.println("1");
		}
		}
		else {
			System.out.println("0");
		}
		input.close();
	}

}
