package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		
		/* 1에서부터 10까지 숫자를 출력 */ 
		//초기화
		int x = 0;
		
		//진입조건
		while( x < 10 ) {
			System.out.println( x + 1 );
			//증가
			x = x + 1;
		}
		System.out.println("끝");
	}

}
