package chapter01;

public class Relation {

	//관계연산자 : 크거나 작거나 같거나
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		// 결과 값은 true or false
		System.out.println( a == b );	//false
		System.out.println( a != b );	//true
		
		System.out.println( a > b );	//true
		System.out.println( a < b );	//false
		
		System.out.println( a >= b );	//true
		System.out.println( a <= b );	//false
		
		// 결과 값이 true or false 기 때문에 변수타입은 boolean형으로 
		boolean bool = (a == b);
		System.out.println(bool);		//false
	}

}
