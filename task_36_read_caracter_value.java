package Demo;
import java.util.*;
public class task_36_read_caracter_value {
	
	static char FirstInitials(String FirstInitial) {
		return FirstInitial.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String F = sc.nextLine();
		System.out.println(FirstInitials(F));
	}

}
