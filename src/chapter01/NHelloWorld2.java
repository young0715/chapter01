package chapter01;

import java.util.Scanner;

public class NHelloWorld2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("횟 수 : ");
		int count = scanner.nextInt();
		
		//for-loop
		for(int i=0; i<count; i++ ) {
			System.out.println("Hello World");
		}
		
		scanner.close();
	}

}
