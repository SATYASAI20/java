
package Demo;
import java.util.Scanner;
public class task_12_simple_menu_driven_caluculator {
	int a,b,op;
	task_12_simple_menu_driven_caluculator(int a, int b,int op){
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	void calculate(){
		
		
		switch(op) {
		case 1:
			System.out.println("Addition of two Numbers A and B is "+(a+b));
			break;
		case 2:
			System.out.println("Substraction of two Numbers A and B is "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication of two Numbers A and B is "+(a*b));
			break;
		case 4:
			System.out.println("Division of two Numbers A and B is "+(a/b));
			break;
		case 5:
			System.out.println("Modulus of two Numbers A and B is "+(a%b));
			break;
		default:
			System.out.println("Please Enter a valid input");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number1: ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter a number2: ");
		int b = sc.nextInt();
		System.out.println("Enter the operation 1.addition, 2.Substraction, 3.Multiplication, 4.division, 5.Modulus");
		int op = sc.nextInt();
		task_12_simple_menu_driven_caluculator obj = new task_12_simple_menu_driven_caluculator(a,b,op);
		obj.calculate();
	}

}
