package chapter01;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] intArray; 
		intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		
		//error : intArray.length = 5 가 되므로 intArray[5]는 값을 가질 수 없다.
		for ( int i =0; i <= intArray.length; i++ ){
		     result = result + intArray[i];
		}

		System.out.println("intArray의 4번째 값: " + intArray[3]);

	}

}
