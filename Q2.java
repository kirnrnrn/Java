package homework2;
import java.util.Scanner;
//�� ���������� system.out.printf();�� ������ ���µ� �����Բ��� println���� �϶�� �ϼż� �׳� println���� �ϰڽ��ϴ�~

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		
		System.out.println("������ �Է��Ͻÿ�");
		a = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		b = input.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
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
