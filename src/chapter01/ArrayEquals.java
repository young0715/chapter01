package chapter01;

public class ArrayEquals {
	
	public static void main(String[] args) {
		int[] a1 = {10, 20, 30};
		int[] a2 = {10, 20, 30};
		
		boolean result = equals(a1, a2);
		System.out.println(result);
	}

	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		int size = a.length;
		
		for(int i=0; i<size; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
}
