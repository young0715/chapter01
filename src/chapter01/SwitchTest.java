package chapter01;

public class SwitchTest {

	//월별로 몇일까지 있다라고 보여줄 경우에 switch문 사용한다.
	public static void main(String[] args) {
		int month = 6 ;
		int days = 0;
		
		//switch 
		switch(month) {
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 
			case 10 : 
			case 12 : {
				days = 31; break;
			}
			case 2 : {
				days = 28; break;
			}
			case 4 : 
			case 6 : 
			case 9 :
			case 11 : {
				days = 30; break;
			}
			default : {
				days = 0; break;
			}
		}
		
		//switch case 1 부터 12까지 쓸 경우, 
//		switch(month) {
//			case 1 : {
//				days = 31; break;
//			}
//			case 2 : {
//				days = 28; break;
//			}
//			case 3 : {
//				days = 31; break;
//			}
//			case 4 : {
//				days = 30; break;
//			}
//			case 5 : {
//				days = 31; break;
//			}
//			case 6 : {
//				days = 30; break;
//			}
//			case 7 : {
//				days = 31; break;
//			}
//			case 8 : {
//				days = 31; break;
//			}
//			case 9 : {
//				days = 30; break;
//			}
//			case 10 : {
//				days = 31; break;
//			}
//			case 11 : {
//				days = 30; break;
//			}
//			case 12 : {
//				days = 31; break;
//			}
//			default : {
//				days = 0; break;
//			}
//		}
		
		// 논리 연산자 사용 
//		if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
//			days = 31;
//		} 
//		else if ( month == 2 ) {
//			days = 28;
//		}
//		else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
//			days = 30;
//		}
		
		//if / else if 사용 
//		if( month == 1 ) {
//			days = 31;
//		} 
//		else if ( month == 2 ) {
//			days = 28;
//		}
//		else if ( month == 3 ) {
//			days = 31;
//		}
//		else if ( month == 4 ) {
//			days = 30;
//		}
//		else if ( month == 5 ) {
//			days = 31;
//		}
//		else if ( month == 6 ) {
//			days = 30;
//		}
//		else if ( month == 7 ) {
//			days = 31;
//		}
//		else if ( month == 8 ) {
//			days = 31;
//		}
//		else if ( month == 9 ) {
//			days = 30;
//		}
//		else if ( month == 10 ) {
//			days = 31;
//		}
//		else if ( month == 11 ) {
//			days = 30;
//		}
//		else if ( month == 12 ) {
//			days = 31;
//		}
		
		System.out.println(month + " 월은 " + days + " 일 까지 있습니다.");
	}

}
