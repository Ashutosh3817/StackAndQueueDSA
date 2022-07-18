package StackAndQueuesDSA450plus;
import java.util.Stack;

public class EvaluationOfPostfixExpression {
	public static int evaluatePostfix(String s) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<s.length();i++) {
			int var1;
			int var2;
			char ch = s.charAt(i);
			if(ch=='+'||ch=='*'||ch=='/'||ch=='-') {
				var2 = st.pop();
				var1 = st.pop();
				switch(ch) {
				case '+':
					st.push(var1+var2);
					break;
					
				case '-':
					st.push(var1-var2);
					break;
				case '/':
					st.push(var1/var2);
					break;
				case '*':
					st.push(var1*var2);
					break;
				}
			}
			else st.push(ch-'0');
			
		}
		return st.pop();
	}
	public static void main(String[] args) {
		String s = "231*+9-";
	    System.out.println(evaluatePostfix(s));	
	}
}
