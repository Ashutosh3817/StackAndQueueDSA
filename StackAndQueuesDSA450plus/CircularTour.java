package StackAndQueuesDSA450plus;

public class CircularTour {
	public static int tour(int[] petrol,int[] distance) {
		int n = petrol.length;
		int start = 0 ; 
		int end = 1 ; 
		int count = petrol[start] - distance[start];
		System.out.println(count);
		while(count<0 || start!=end) {
			while(count<0 && start!=end) {
				count -= petrol[start] - distance[start];
				System.out.println(count);
				start = (start+1)%n;
				if(start==0) return -1;
				
			}
			count += petrol[end]-distance[end];
			end = (end+1)%n;
		}
		return start;
	}
	public static void main(String[] args) {
		int[] petrol = {4,6,7,4};
		int distance[] = {6,5,3,5};
	    System.out.println(tour(petrol,distance));	
	}
}
