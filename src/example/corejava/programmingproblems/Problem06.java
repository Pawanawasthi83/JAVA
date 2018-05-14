package example.corejava.programmingproblems;

public class Problem06 {

	public static void main(String[] args) {
		
		int multi=1;
		int sum =0;
		for(int i=1;i<=20;i+=2){
				multi=multi*i;
		}
		
		System.out.println(multi);
		
		for(int i=2;i<=100;i+=2){
				sum=sum+i;
		}
		
		System.out.println(sum);
		
	}

}
