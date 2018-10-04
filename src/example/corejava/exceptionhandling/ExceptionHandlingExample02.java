package example.corejava.exceptionhandling;

public class ExceptionHandlingExample02 {

	public static void main(String[] args) {
		
		String[] str = {"abc","12",null,"32"};
		
		for(String s:str){
			try{
			int a = s.length()+Integer.parseInt(s);
			
			System.out.println(a);
			}catch(NumberFormatException e){
				e.printStackTrace();
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
		}

	}

}
