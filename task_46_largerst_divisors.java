package Demo;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task_46_largerst_divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map =new HashMap<>();
		
		int n=10000;
		int max_count=0,min_count=0;//1  //1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					min_count+=1;
					
				}
			}
			if(min_count>max_count) {
				max_count=min_count;
				map.put(i, max_count);
			}
		}
		int max = Collections.max(map.values());
//		int count=0;
		String s="";
		for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(max==entry.getValue()) {
//				count+=1;
				
				s=entry.getKey()+" "+entry.getValue();
				
			}
		}
		System.out.println(s+"count: "+count);
		
	}

}
