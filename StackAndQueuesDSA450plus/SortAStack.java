package StackAndQueuesDSA450plus;
import java.util.Stack;
public class SortAStack {
	static Stack<Integer> sort(Stack<Integer> s){
		if(s.isEmpty()) return s;
		int temp = s.pop();
		sort(s);
		return insertStack(s,temp);
		
	}
	static Stack<Integer> insertStack(Stack<Integer> s,int item){
		if(s.isEmpty()) {
			s.push(item);
			return s;
		}
		if(item<s.peek()) {
			int temp = s.pop();
			insertStack(s,item);
			s.push(temp);
		}
		else {
			s.push(item);
			return s;
		}
		return s;
		
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(45);
		s.push(2);
		s.push(11);
		s.push(3);
		s.push(4);
		System.out.println(sort(s));
	}
}
