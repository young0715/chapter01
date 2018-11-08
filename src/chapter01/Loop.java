package chapter01;

public class Loop {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			return;
		}
		
		//Integer 는 포장 클래스(wrapper class)는 특정 기본형 타입을 나타낸다.
		//* Java 클래스 라이브러리의 wrapper class
		// 기본형 타입    ||  wrapper class 
		//   byte 	 ||		Byte 
		//	 short   || 	Short 
		// 	 int 	 || 	Integer 
		//   long 	 || 	Long 
		//   float 	 || 	Float 
		//   double  || 	Double 
		//   char    || 	Charater 
		//   boolean || 	Boolean 
		//   void    || 	Void 

		//자바는 함수(ex. parseInt)만 따로 존재할수 없다.(C는 가능하다.)
		int input = Integer.parseInt(args[0]);
		
		int output = 0;
		while(true) {
			output += input;
			input--;
			if(input == 0) {
				break;
			}
		}
		System.out.println(output);
	}

}
