public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
			return a/b;
	}
	
	public int power(int a, int b) {
		int result = (int) Math.pow(a, b);
		return result;
	}
	
	public int addThree(int a, int b, int c) {
		return a+b+c;
	}
	


}


