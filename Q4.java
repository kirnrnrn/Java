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
		
		
		System.out.println("������ �Է��Ͻÿ�");
		a = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		b = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		c = input.nextInt();
		
		sum = a + b + c;
		avg = sum/3;
		
		System.out.println("�� ���� ������ ��:" + sum);
		System.out.println("�� ���� ������ ���:" + avg);
		
		input.close();
	}

}
