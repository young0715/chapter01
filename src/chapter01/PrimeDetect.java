package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");		//prompt
		int number = scanner.nextInt();
		int i = 2;
		
		boolean isPrime = true;
		
		while( i <= number) {
			
			i++;
		}
		
		//출력 : 
		if( isPrime == true ) {
			System.out.println( number + "은 소수입니다.");
		}
		else {
			System.out.println( number + "은 소수가 아닙니다.");
		}
		
		scanner.close();
	}

}
