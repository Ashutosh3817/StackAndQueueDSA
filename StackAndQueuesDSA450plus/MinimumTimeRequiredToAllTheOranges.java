package StackAndQueuesDSA450plus;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumTimeRequiredToAllTheOranges {
	public static int orangesRotting(int[][] grid) {
		if(grid.length==0 || grid==null) return 0 ;
		
		int rows = grid.length;
		int cols = grid[0].length;
		
		Queue<int[]> queue = new LinkedList<>();
		int count_fresh = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(grid[i][j] ==2) {
					queue.offer(new int[] {i,j});
				}
				if(grid[i][j]!=0) { //means it is 1 that is fresh orange
					count_fresh++;
				}
			}
		}
		if(count_fresh==0) return 0 ; //if their is no fresh oranges then it returns zero
		int countMin=0 ;
		int cnt = 0 ; 
		
		int dx[] = {0,0,1,-1};//1 & -1 is for left and right
		int dy[] = {1,-1,0,0}; // 1 & -1 is for top & bottom
		
		//bfs starting from initially rotten oranges
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			cnt += size;
			for(int i=0;i<size;i++) {
				int[] point = queue.poll();
				for(int j=0;j<3;j++) {
					int x = point[0] + dx[j];//aap x co-ordinate left or right hi move kr skta hai
					int y = point[1] + dy[j];//aap x co-ordinate top or bottom hi move kr skta hai
					if(x<0 || y<0 || x>=rows || y>=cols || grid[x][y]==0 || grid[x][y]==2) continue;
					
					grid[x][y]=2;
					queue.offer(new int[] {x,y});
				}
			}
			if(queue.size()!=0) countMin++;
		}
				return count_fresh == cnt? countMin : -1;//ki hmare 1 minute lgega ki 2 ki 3 ki 4 etc
 	}
	public static void main(String[] args) {
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(grid));
	}
}
