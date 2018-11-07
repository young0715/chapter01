package chapter01;

public class ArrayTest3 {

	public static void main(String[] args) {
		int arrayInt1[];			//추천하지 않음.
		int[] arrayInt2;			//추천.

		//C언어에서 사용 가능하지만, JAVA에서는 사용불가. JAVA 생성에서 위배되므로 오류.
		//int[5] arrayInt2;	
		
		arrayInt2 = new int[5];		//배열은 객체다. 객체 생성은 new 키워드로 해야한다.
		arrayInt2[0] = 1;
		arrayInt2[1] = 2;
		arrayInt2[2] = 3;
		arrayInt2[3] = 4;
		arrayInt2[4] = 5;
		
		//L.12 ~ L.17과 동일한 코드
		int[] arrayInt3 = {1,2,3,4,5};
		
		//비추천 코드
		int[] arrayInt4 = new int[] {1,2,3,4,5};
		
		//error : 자주하는 실수 코드 (두개로 분리 불가능)
//		int[] arrayInt5;
//		arrayInt5 = {1,2,3,4,5}; 
		
		//Book 객체 5개를 만든것이 아니고, Book 객체 참조(reference)값  5개를 저장할 공간을 만든 것이다.
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[0].title = "이것이 자바다";
		
	}

}
