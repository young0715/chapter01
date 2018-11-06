package chapter01;

import java.util.Scanner;

public class SumToInput2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int count = scanner.nextInt();
		
		int sum = 0;
		for(int i=1; i<=count; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("1에서 " + count + "까지의 합은 " + sum + "입니다.");
		
		scanner.close();
	}

}
