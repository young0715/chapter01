package chapter01;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		int total = 0;
		int value = -1;
		Scanner scanner = new Scanner(System.in);
		
		while( value != 0 ) {
			System.out.print("숫자입력 [0 to quit]:");
			value = scanner.nextInt();
			
			if( value == 0 ) {
				break;
			}
			total += value;
				
		}
		
		System.out.println(total);
		
		scanner.close();
	}

}
