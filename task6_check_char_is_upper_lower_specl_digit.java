package Demo;
import java.util.Scanner;
import java.util.regex.*;
public class task6_check_char_is_upper_lower_specl_digit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		String s = Character.toString(ch);
		
		if(s.matches("[a-z]")) {
			System.out.println("lower_case");
		}else if(s.matches("[A-Z]")) {
			System.out.println("Upper_case");
		}else if(s.matches("[0-9]")) {
			System.out.println("digit");
			
		}else {
			System.out.println("special_case");
		}
	}
}