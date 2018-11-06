package chapter01;

import java.util.Scanner;

public class NHelloWorld {

	public static void main(String[] args) {
		
		//Scanner 생성자 (System.in은 키보드와 연결되어 입력해라.)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("횟수입력 : ");		//prompt
		int count = scanner.nextInt();
		
		System.out.println(" --> " + count);
		
		int i = 0;
		while( i < count ) {
			System.out.println("Hello World");
			i = i + 1;
		}
		
		//경고 /Resource leak : 'scanner' is never close 
		scanner.close();
		
	}

}
