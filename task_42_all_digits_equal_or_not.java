package Demo;

public class task_42_all_digits_equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=111;
		boolean flag=true;
		String s = Integer.toString(n);
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				continue;
			}else {
				flag=false;
			}
		}
		
		if(flag == true) {
			System.out.println("All digits are equal");
		}else {
			System.out.println("All digits are NOT_Equal");
		}
		
	}

}
