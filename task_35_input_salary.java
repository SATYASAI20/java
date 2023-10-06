package Demo;
import java.util.*;
public class task_35_input_salary {
	int salary;
	task_35_input_salary(int salary){
		this.salary = salary;
	}
	int salary() { 
		return salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		task_35_input_salary obj = new task_35_input_salary(salary);
		System.out.println(obj.salary);
	}

}
