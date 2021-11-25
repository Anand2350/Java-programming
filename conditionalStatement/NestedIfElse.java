package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 180;
		int c = 100;
		int result = 0;
		 result = a>b ? a>c ? a:c:b>c ? b:c;
         System.out.println("largest of three number is " + result);
	}

}

