package example.corejava.exceptionhandling;

public class CEDemoNeverThrownInTryStatement {

	public static void main(String[] args) {
		
		try{
			System.out.println("Hello");
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}

//CEDemoNeverThrownInTryStatement.java:9: error: 
//exception InterruptedException is never thrown in body of corresponding try statement
//}catch(InterruptedException e){