package example.corejava.exceptionhandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		System.out.println("Statment 1");
		try{
		System.out.println(10/0);
		System.out.println("Hello");
		}
		
		catch(ArithmeticException e){
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}		
		finally {
			System.out.println("In side Finally block");
		}
	}

}
