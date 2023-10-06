package Demo;

public class three_numbers_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3,c=4,d=9;
//		int x = (a>b)?(a>c?a:b):(b>c?b:c);
		int x = (a>b&&a>c)?a>d?a:(b>c )?b>d?b:(c>d):d:c;
		
	}

}
