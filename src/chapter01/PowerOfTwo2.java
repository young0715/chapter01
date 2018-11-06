package chapter01;

import java.util.Scanner;

public class PowerOfTwo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		System.out.print("승수 : ");
		
		int pow = scanner.nextInt();
	
		//for문
		for(int i=1; i<=pow; i++) {
			result = 2*result;
		}
		
		System.out.println("2의 " + pow + " 제곱근은 " + result + "입니다." );
		
		scanner.close();
	}

}
