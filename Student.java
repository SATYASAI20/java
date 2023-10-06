package Demo;

public class Student {
	
	String name;
	int roll_no;
	
	Student(String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("john",2);
		System.out.println(obj.name+" "+obj.roll_no);
		

	}

}
