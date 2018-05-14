package example.corejava.stringoperation;

public class FindOneStringRotationOfAnother {

	public static void main(String[] args) {
		
		
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "J2eeStrutsHibernateJava";
		
		
		
		if(s1.length()!=s2.length()){
			System.out.println(s1+" is not a rotation of :"+s2);
		}else{
			String s3 = s1+s1;
			if(s3.contains(s2)){
				System.out.println(s1+" is  a rotation of :"+s2);
			}else{
				System.out.println(s1+" is not a rotation of :"+s2);
			}
		}
		
	}

}
