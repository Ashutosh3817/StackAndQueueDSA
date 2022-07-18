package StackAndQueuesDSA450plus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class GameWithString {
	static int minValue(String s,int k) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int a: map.values()) {
			pq.add(a);
		}
		//priority queue implements minimum heap property
		while(k>0){
			int a = pq.poll();
			a--;
			pq.add(a);
			k--;
		}
		int res = 0 ;
		while(!pq.isEmpty()) {
			res += pq.peek() * pq.poll();//kyu ki hme peek krte krte poll bhi krna hai
		}
		return res;
	}
	public static void main(String[] args) {
		String s = "abccc";
		int k=1;
		System.out.println(minValue(s,k));
	}
}
