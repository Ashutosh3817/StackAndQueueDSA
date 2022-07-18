package StackAndQueuesDSA450plus;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
	public static long[] nextGreater(long[] arr,int n ) {
		long[] la = new long[n]; // la => long array
		Stack<Long> s = new Stack<>();
		Map<Long,Long> map = new HashMap<>();
		s.push(arr[0]);
		for(int i=1;i<n;i++) {
			if(s.isEmpty()) {
				s.push(arr[i]);
				continue;
			}
			if(s.isEmpty()==false && s.peek()<arr[i]) {
				map.put(s.peek(), arr[i]);
				s.pop();
			}
			s.push(arr[i]);
		}
		while(s.isEmpty()==false) {
			map.put(s.peek(),(long)-1);
			s.pop();
		}
		for(int i=0;i<n;i++) {
			la[i] = map.get(arr[i]);
		}
		return la;
	}
	public static void main(String[] args) {
		long[] arr = {6,8,0,1,3};
		int n =arr.length;
		System.out.println(nextGreater(arr,n));
		
	}
}
