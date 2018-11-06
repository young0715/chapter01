package chapter01;

public class Gugudan {

	//중첩 while문
	public static void main(String[] args) {
		int i = 1;
		
		while( i <= 9 ) {
			int j = 1;
			while( j <= 9 ) {
				System.out.println(i + "*" + j + "=" + (i * j) );
				j++;
			}
			i++;
		}
		
	}

}
