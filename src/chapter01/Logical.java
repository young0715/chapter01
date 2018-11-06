package chapter01;

public class Logical {

	//논리연산자 : x or o (맞는지 틀리는지 결과 값은  true or false)
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a == b || a > b);	// flase or true >> true 
		System.out.println( a == b && a > b);	// flase and true >> false

		System.out.println( a != b || a > b);	// true or true >> true 
		System.out.println( a != b && a > b);	// true and true >> true 

		System.out.println(!(a > b));			// not ture >> flase 
		System.out.println((a > b) == false);	// true == false >> flase
	}

}
