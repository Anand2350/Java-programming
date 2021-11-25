package operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int b = 45;
//		int c = a * a + b * b + 2 * a * b;
//		
//		int d = (a + b) * (a + b);
		int c= b++;
		c = --b; 
		System.out.println(c+" " +b);
		

	}

}
