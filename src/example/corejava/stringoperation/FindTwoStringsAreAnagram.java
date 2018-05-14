package example.corejava.stringoperation;

import java.util.Arrays;

public class FindTwoStringsAreAnagram {

	public static void main(String[] args) {
		// Two strings are called anagrams if they contain same set of characters but in different order. 
		// For example, “Dormitory – Dirty Room”

		//isAnagramByIterativeMethod("Dormitory","Dirty Room");
		//isAnagramBySort("Mother In Law", "Hitler Woman");
		isAnagramByStringBuilder("keEp", "peeK");
		//isAnagramBySort("SiLeNt CAT", "LisTen AcT");
		//isAnagramBySort("Debit Card", "Bad Credit");
		//isAnagramBySort("School MASTER", "The ClassROOM");
		//isAnagramBySort("DORMITORY", "Dirty Room");
		//isAnagramBySort("ASTRONOMERS", "NO MORE STARS");
	}
	
	public static void isAnagramBySort(String s1, String s2) {
		
		boolean status = true;
		
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		
		if(copyOfs1.length()!=copyOfs2.length()){
			
			status=false;
			
			}else{
			
			char [] array1 = copyOfs1.toLowerCase().toCharArray();
			char [] array2 = copyOfs2.toLowerCase().toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			status=Arrays.equals(array1, array2);
		}
		
		if(status){
			System.out.println(s1+" "+"&"+" "+s2+" "+"are Anagrams");
		}else{
			System.out.println(s1+" "+"&"+" "+s2+" "+"are not Anagrams");
		}

		
	}
		
	public static void isAnagramByIterativeMethod(String s1, String s2) {
		
		boolean status = true;
		
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(copyOfs1.length()!=copyOfs2.length()){
			
			status=false;
			
			}
		else{
			
			char [] array1 = copyOfs1.toCharArray();
			
			for(char c : array1){
				
				int index = copyOfs2.indexOf(c);
				if(index!=-1){
					copyOfs2=copyOfs2.substring(0, index)+copyOfs2.substring(index+1,copyOfs2.length());
				}else{
					
					status = false;
				}
				
			}
			
			
		}
		
		if(status){
			System.out.println(s1+" "+"&"+" "+s2+" "+"are Anagrams");
		}else{
			System.out.println(s1+" "+"&"+" "+s2+" "+"are not Anagrams");
		}

		
	}
	
	public static void isAnagramByStringBuilder(String s1, String s2) {
		
		boolean status = true;
		
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(copyOfs1.length()!=copyOfs2.length()){
			
			status=false;
			
			}
		else{
			
			char [] array1 = copyOfs1.toCharArray();
			
			StringBuilder sb = new StringBuilder(copyOfs2);
			
			for(char c : array1){
				
				int index = sb.indexOf(""+c);
				
				if(index!=-1){
					
					sb=sb.deleteCharAt(index);
					System.out.println(sb);
					
				}else{
					
					status = false;
				}
				
			}
			
			
		}
		
		if(status){
			System.out.println(s1+" "+"&"+" "+s2+" "+"are Anagrams");
		}else{
			System.out.println(s1+" "+"&"+" "+s2+" "+"are not Anagrams");
		}

		
	}
	
	

}


