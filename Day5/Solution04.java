import java.util.*;
class Solution04{
	Stack<Integer> pm = new Stack<>();
	public void DFS(int L, int n, int m){
		if(L == m){
			for(int x : pm){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){
				pm.push(i);
				DFS(L+1, n, m);
				pm.pop();
			}
		}
	}
	public void solution(int n, int m){
		DFS(0, n, m);
	}
	public static void main(String[] args){
		Solution04 T = new Solution04();
		T.solution(3, 2);
	}
}
