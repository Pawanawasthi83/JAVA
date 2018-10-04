package example.corejava.arrays;

class Student {
	int rollnumber;
	String name;
}

public class PassingAndReturningArrayOfDerivedType {

	public static void main(String[] args) {
		Student[] std = new Student[5];
		
		Student[] std1=returningDerivedTypeArray();
		System.out.println(std1[0].name);
		System.out.println(std1[0].rollnumber);

		std[0] = new Student();
		std[1] = new Student();

		std[0].name = "pawan";
		std[0].rollnumber = 20;
		DerivedTypeAsAParameter(std);
		
		System.out.println(std[0].name + "  " + std[0].rollnumber);
	}

	public static void DerivedTypeAsAParameter(Student[] std) {
		
		std[0].name="Durga";
		std[0].rollnumber=100;

	}
	
	public static Student[] returningDerivedTypeArray() {
		
		Student[] student = new Student[5];
		student[0]=new Student();
		student[0].name="Kalpana";
		student[0].rollnumber=100;
		
		return student;
		
	}
}
