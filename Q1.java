package homework1;

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		int kor;
		int mat;
		int eng;
		int sum;
		int avg;
		System.out.println("���� ������ �Է��Ͻÿ�:");
		kor = input.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�:");
		mat = input.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		eng = input.nextInt();
		sum = kor + mat + eng;
		avg = sum/3;
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		input.close();
		
	}

}
