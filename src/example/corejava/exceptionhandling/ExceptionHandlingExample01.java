package example.corejava.exceptionhandling;

public class ExceptionHandlingExample01 {

	public static void main(String[] args) {

		String[] str = {"abc","123","cd","45"};
		for(String s : str){
			try{
				int i = Integer.parseInt(s);
				System.out.println(i);
			}catch(NumberFormatException e){
				System.out.println("Exception Handled..");
				e.getMessage();
			}finally {
				System.out.println("Finally Block..");
			}
			
		}
	}

}