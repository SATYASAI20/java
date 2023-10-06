package Demo;
import java.util.Scanner;

//task 14

public class Average {
	
	int a,b,c;
	
	Average(int a, int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	float calculate() {
		float avg = (a+b+c)/3;
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Average obj = new Average(a,b,c);
		System.out.println(obj.calculate());
	}

}
