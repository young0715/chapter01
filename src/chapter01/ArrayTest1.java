package chapter01;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		char[] chars = new char[3];
		chars[0] = 'b';
		chars[1] = 'i';
		chars[2] = 't';
		
		//error : java.lang.ArrayIndexOutofBoundsException
		//chars[3] = ''!; 
		
		System.out.println(chars);
	}

}
