package StackAndQueuesDSA450plus;

public class TwoStack {
	int size;
	int top1 , top2;
	int[] arr = new int[100];
	TwoStack() {
		size = 100;
		top1 = -1;
		top2 = size;
	}
	void push1(int x , TwoStack sq) {
		sq.top1++;
		sq.arr[sq.top1] = x;
	}
	void push2(int x,TwoStack sq) {
		sq.top2--;
		sq.arr[sq.top2] = x ; 
	}
	int pop1(TwoStack sq) {
		if(sq.top1>=0) return sq.arr[sq.top1--];
		return -1;
	}
	int pop2(TwoStack sq) {
		if(sq.top2<sq.size) return sq.arr[sq.top2++];
		return -1;
	}
	public static void main(String[] args) {
		TwoStack ts = new TwoStack();
		TwoStack ts1 = new TwoStack();

		ts.push1(10, ts);
		ts.push1(20, ts);
		ts.push1(30, ts);
		ts.push1(40, ts);
		ts.push1(50, ts);
		
		ts1.push2(60, ts1);
		ts1.push2(70, ts1);
		ts1.push2(80, ts1);
		ts1.push2(90, ts1);
		ts1.push2(100, ts1);

		System.out.println(ts.pop1(ts) + " pop1");
		System.out.println(ts.pop2(ts1) + " pop2");
	}
}
