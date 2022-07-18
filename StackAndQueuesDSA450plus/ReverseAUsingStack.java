package StackAndQueuesDSA450plus;
import java.util.Stack;
public class ReverseAUsingStack {
	public static String reverse(String S) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<S.length();i++) {
			st.push(S.charAt(i));
		}
		String a = "";
		while(!st.isEmpty()) {
			char b = st.pop();
			a = a + b ;
		}
		return a ; 
	}
	public static void main(String[] args) {
		String S = "GeeksForGeeks";
		System.out.println(reverse(S));
	}
}
