package chapter01;

public class Cond2 {

	// 최대값 판별 
	public static void main(String[] args) {
		int a1 = 200;
		int a2 = 100;
		int a3 = 50;
		int temp;
		
		//Q2 : 최대값 판별하는 조건을 완성해 보세요.
		//output: 최대값은 50입니다.
		//Sol:
		if(a1 > a2) {
			//a1이 a2보다 큰 경우
			// -> ? a1 > a3
			if(a1 > a3) {
				temp = a1;
			} else {
				temp = a3;
			}
		} else {
			// a2가 a1보다 큰 경우
			// -> ? a2 <> a3
			if(a2 > a3) {
				temp = a2;
			} else {
				temp = a3;
			}
		}
		System.out.println("최대값은 " + temp + " 입니다.");
	}
}
