package StackAndQueuesDSA450plus;
import java.util.Stack;
public class SpecialStack {
	public void push(int a,Stack<Integer>s) {
		s.push(a);
	}
	public static int pop(Stack<Integer>s) {
		int x = s.pop();
		return x;
	}
	public static int min(Stack<Integer> s) {
		int min = s.pop();
		while(!s.isEmpty()) {
			int temp = s.pop();
			if(temp<min) min = temp;
		}
		return min;
	}
	public boolean isSafe(Stack<Integer> s,int n) {
		return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s) {
		return s.isEmpty();
	}
}
