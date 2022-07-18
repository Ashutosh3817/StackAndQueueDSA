package StackAndQueuesDSA450plus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
	public static Queue<Integer> reverse(Queue<Integer> q,int k ){
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		while(k--!=0) st.push(q.poll());
		while(!st.isEmpty()) queue.add(st.pop());
		while(!q.isEmpty()) queue.add(q.poll());
		return queue;
	}
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(reverse(q,3));
	}
}
