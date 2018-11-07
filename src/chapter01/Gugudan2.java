package chapter01;

public class Gugudan2 {

	//중첩 while문
	public static void main(String[] args) {
		
		for(int i=1; i <= 9; i++ ) {
			for(int j=1; j <= 9; j++ ) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println("");
		}
		
	}

}
