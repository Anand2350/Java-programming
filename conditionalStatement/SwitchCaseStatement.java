package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		int dayOfweek = 2;
//		if(dayOfweek == 1 ) {
//		}
//		if(dayOfweek == 2 ) {
//		}
//		if(dayOfweek == 3 ) {
//		}
//		if(dayOfweek == 4 ) {
//		}
//		if(dayOfweek == 5 ) {
//		}
//		if(dayOfweek == 6 ) {
//		}
//		if(dayOfweek == 7 ) {
//		}
		switch(dayOfweek) {
		case 1:
			System.out.println("I am on leave");
			break;
		case 2:
			System.out.println("I am a officer");
			break;
		case 3:
			System.out.println(" i am playing footboll");
			break;
			
			default:
				System.out.println("I don't konow what day is");
		}
	}
}

		


