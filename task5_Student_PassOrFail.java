package Demo;
import java.util.Scanner;
public class task5_Student_PassOrFail {
	
	static void passOrfail(int a) {
		if(a>=45) {
			if(a>=90 && a<=100) {
				System.out.println("A");
			}else if(a>=80) {
				System.out.println("B");
			}else if(a>=70) {
				System.out.println("c");
			}else if(a>=60) {
				System.out.println("D");
			}else if(a>=50) {
				System.out.println("E");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("fail");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		task5_Student_PassOrFail obj = new task5_Student_PassOrFail();
//		obj.passOrfail(a);
		passOrfail(a);
	}
}
