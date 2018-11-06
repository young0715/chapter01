package chapter01;

public class Swap {

	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 30;
		
		// Q1: n1 값이 항상 큰값이 되도록 만드는 예제 
		// 만약 n1 값이 크면 두 값을 교체하는 문제
		if( n1 < n2 ) {
			//swap : temp는 임시 저장소로 사용하기 때문에 지역변수로 선언한다.
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

	}

}
