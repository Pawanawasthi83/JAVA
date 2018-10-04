package example.corejava.exceptionhandling;

public class CEDemoUnreachableStatement {

	public static void main(String[] args) {
		
		throw new ArithmeticException();
		System.out.println("Pawan");

	}

}
//CEDemoUnreachableStatement.java:8: error: unreachable statement
//System.out.println("Pawan");