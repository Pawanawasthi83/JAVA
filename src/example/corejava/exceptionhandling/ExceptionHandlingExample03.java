package example.corejava.exceptionhandling;

public class ExceptionHandlingExample03 {

	public static void main(String[] args) {
		System.out.println(methodone());
	}
	
	public static int methodone(){
		int i=2;
		try{
			i=Integer.parseInt("abc");
			return i;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			i=4;
			return i;
		}
		
	}

}
