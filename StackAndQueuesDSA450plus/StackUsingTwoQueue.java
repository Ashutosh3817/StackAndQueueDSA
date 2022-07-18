package StackAndQueuesDSA450plus;

import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueue {

	 Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	 void push(int a) {
		while(!q1.isEmpty()) q2.add(q1.poll());
		q1.add(a);
		
		while(!q2.isEmpty()) q1.add(q2.poll());
	}
	 int pop() {
		return (q1.isEmpty()) ? -1 : q1.poll();
	}
}
class Solution{
	public static void main(String[] args) {
		StackUsingTwoQueue s = new StackUsingTwoQueue();
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
	    s.push(4);;
	    System.out.println(s.pop());
	}
}
