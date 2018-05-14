package example.corejava.stringoperation;

public class FindDuplicateCharFromString {

	public static void main(String[] args) {

		String str = "pacsfcfefceffwekokpfjhchscwannp";
		for(int i=0;i<str.length();i++){
			String str1="";
			for(int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						if(str1.length()<1){
							str1 =Character.toString(str.charAt(i));
						}
						str1=str1+str.charAt(j);
											}				
						
			}
			if(str1.length()>1){
				System.out.println("Duplicate Charcter: "+str1);
			}
		}
		
		
	}

}
