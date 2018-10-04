package example.corejava.exceptionhandling;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {
		
		try{
			String str =new String("Pawan");
			str=null;
			//System.out.println(str.length());
			System.out.println(10/0);
			
		}catch(ArithmeticException|NullPointerException e){
			e.printStackTrace();
		}
		
		System.out.println("Exception Handling Successfully...");

	}

}
