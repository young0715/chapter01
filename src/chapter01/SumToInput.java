package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");		//prompt
		int number = scanner.nextInt();
		int i = 1;
		int result = 0;
		//반복문
		while(i <= number) {
			result = i + result;
			i++;
		}
		
		System.out.println("1 에서 " + number + "까지 합은 " + result + "입니다.");
		//결과 예 number <- 10
		//1에서 10까지 합은 55입니다.
		scanner.close();
	}

}
