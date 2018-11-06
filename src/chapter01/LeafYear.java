package chapter01;

public class LeafYear {

	public static void main(String[] args) {
		int year = 2000;
		
		if( year % 4 != 0) {
			System.out.println("윤년이 아닙니다.");
		}
		else if( year % 100 != 0 ) {	
			// 4로 나누어 떨어지는 년도 &&
			// 100으로 나누어 떨어지지 않는 년도
			System.out.println("윤년입니다.");
		}
		else if( year % 400 != 0 ) {
			// 4로 나누어 떨어지는 년도 &&
			// 100으로 나누어 떨어지는 년도 &&
			// 400으로 나누어 떨어지지 않는 년도
			System.out.println("윤년이 아닙니다.");
		}
		else {
			// 4로 나누어 떨어지는 년도 &&
			// 100으로 나누어 떨어지는 년도 &&
			// 400으로 나누어 떨어지는 년도
			System.out.println("윤년입니다.");
		}
		
		// cf: 2의 배수, 3의 배수, 5의 배수를 출력하는 로직
		int value = 10;
		
		if( value % 2 == 0) {
			System.out.println("2의 배수 입니다.");
		} 
		if ( value % 3 == 0 ) {
			System.out.println("3의 배수 입니다.");
		}
		else if ( value % 5 == 0 ) {
			System.out.println("5의 배수 입니다.");
		}
	}

}
