package chapter01;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] scores = new int[5];
		
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		//error : java.lang.ArrayIndexOutofBoundsException
		//scores[5] = 60;
		
		int sum = 0;
		int size = scores.length;
		System.out.println("size: " + size);
		
		for(int i=0; i<size; i++) {
			sum += scores[i];
		}
		System.out.println("sum : "+sum);
		System.out.println("average : " + sum/size);
	}

}
