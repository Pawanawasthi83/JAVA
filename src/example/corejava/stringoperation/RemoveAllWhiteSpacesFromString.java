package example.corejava.stringoperation;

public class RemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		
		String noWhiteSpaces = str.replaceAll("\\s","");
		System.out.println(noWhiteSpaces);
		
		char[] arr = str.toCharArray();
		String newstr = "";
		for(int i=0;i<str.length();i++){
			
			if(arr[i]!=' ' && arr[i]!='\t'){
				
				newstr=newstr+arr[i];
			}
		}
		System.out.println(newstr);
	}

}
