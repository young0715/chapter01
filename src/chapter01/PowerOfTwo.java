package chapter01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		//Scanner 생성자 (System.in은 키보드와 연결되어 입력해라.)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("승수 : ");		//prompt
		int power = scanner.nextInt();
		
		int result = 1;
		int temp = 0;
		//반복문
		while( temp < power) {
			result = 2 * result;
			temp ++ ;
		}
		
		System.out.println("2의 " +  power + "승은" + result + " 입니다");
		
		scanner.close();
	}

}
