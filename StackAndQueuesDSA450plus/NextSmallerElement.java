package StackAndQueuesDSA450plus;

import java.util.HashMap;
import java.util.Stack;

public class NextSmallerElement {
	public static void printNSE(int[] arr,int n) {
		
		Stack<Integer> s = new Stack<Integer>();
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		s.push(arr[0]);
		for(int i=1;i<n;i++) {
			if(s.empty()) {
				s.push(arr[i]);
				continue;
			}
			while(s.empty()==false && s.peek()>arr[i]) {
				mp.put(s.peek(), arr[i]);
				s.pop();
			}
			s.push(arr[i]);
		}
		/* After iterating over the loop, the remaining
        elements in stack do not have the next smaller
        element, so print -1 for them */
		while(s.empty()==false) {
			mp.put(s.peek(), -1);
			s.pop();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + "-->" + mp.get(arr[i]) );
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,8,5,2,25};
		int n =arr.length;
		printNSE(arr,n);
	}
}
