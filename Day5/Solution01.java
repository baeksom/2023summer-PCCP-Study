import java.util.*;
class Solution01 {
	public void BFS(){
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(1);
		int L = 0;
		while(!Q.isEmpty()){
			int n = Q.size();
			System.out.print(L+" : ");
			for(int i=0; i<n; i++){
				int v = Q.poll();
				System.out.print(v+" ");
				for(int nv : new int[]{v*2, v*2+1}){
					if(nv > 7) continue;
					Q.offer(nv);
				}
			}
			L++;
			System.out.println();
		}
	}
		
	public static void main(String[] args){
		Solution01 T = new Solution01();
		T.BFS();
	}
}