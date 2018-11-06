package chapter01;

public class Cond1 {

	//block 안에 변수 선언 : 지역변수 (block 안에서만 사용할 수 있다.)
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c;
		
		if( a > b ) {
			c = a - b;
		}
		else {	// a <= b
			c = b - a;
		}
		System.out.println(c);
	}

}
