import java.util.*;
class Solution03 {
	public int solution(int[][] board){
		int[] dr = {-1,0,1,0};
		int[] dc = {0,1,0,-1};
		int L = 0;
		int n = board.length;
		Queue<int[]> Q = new LinkedList<>();
		Q.offer(new int[]{0,0});
		board[0][0] = 1;
		while(!Q.isEmpty()){
			int len = Q.size();
			for(int i=0; i<len; i++){
				int[] v = Q.poll();
				for(int k=0; k<4; k++){
					int nr = v[0] + dr[k];
					int nc = v[1] + dc[k];
					if(nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == 0){
						if(Arrays.equals(new int[]{nr, nc}, new int[]{6,6})) return ++L;
						Q.offer(new int[]{nr, nc});
						board[nr][nc] = 1;
					}
				}
			}
			L++;
		}
		return -1;
	}
		
	public static void main(String[] args){
		Solution03 T = new Solution03();
		int[][] arr={{0, 0, 0, 0, 0, 0, 0}, 
			{0, 1, 1, 1, 1, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0}, 
			{1, 1, 0, 1, 0, 1, 1}, 
			{1, 1, 0, 1, 0, 0, 0}, 
			{1, 0, 0, 0, 1, 0, 0}, 
			{1, 0, 1, 0, 0, 0, 0}};
		int[][] arr1={{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{1, 1, 0, 1, 1, 1, 1},
			{1, 1, 0, 1, 0, 0, 0},
			{1, 0, 0, 0, 1, 0, 0},
			{1, 0, 1, 0, 1, 0, 0}};
		int[][] arr2={{0, 0, 0, 0, 0, 0, 0},
			{1, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{1, 1, 0, 1, 0, 1, 1},
			{1, 1, 0, 0, 0, 1, 0},
			{1, 0, 0, 0, 1, 0, 0},
			{1, 0, 1, 0, 0, 0, 0}};
		System.out.println(T.solution(arr));
		System.out.println(T.solution(arr1));
		System.out.println(T.solution(arr2));
	}
}