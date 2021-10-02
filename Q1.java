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
		System.out.println("국어 점수를 입력하시오:");
		kor = input.nextInt();
		System.out.println("수학 점수를 입력하시오:");
		mat = input.nextInt();
		System.out.println("영어 점수를 입력하시오");
		eng = input.nextInt();
		sum = kor + mat + eng;
		avg = sum/3;
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		input.close();
		
	}

}
