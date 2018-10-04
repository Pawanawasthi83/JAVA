package example.corejava.exceptionhandling;

class TooYoungException extends RuntimeException{
	
	TooYoungException(String s){
			super(s);	
	}
	
}
class TooOldException extends RuntimeException{
	
	TooOldException(String s){
		super(s);
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		int age = 11;
		if(age<18){
			throw new TooYoungException("Too Young To Get Merriage");
		}else if(age>60){
			throw new TooOldException("Too Old To Get Merriage");
		}else{
			System.out.println("Success");
		}
	}

}
