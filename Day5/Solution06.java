import java.util.*;
class Solution06 {
	Stack<Integer> combi = new Stack<>();
	public void DFS(int L, int s, int n, int m){
		if(L == m){
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else{
			for(int i=s; i<=n; i++){
				combi.push(i);
				DFS(L+1, i+1, n, m);
				combi.pop();
			}
		}
	}
	public void solution(int n, int m){
		DFS(0, 1, n, m);
	}
	public static void main(String[] args){
		Solution06 T = new Solution06();
		T.solution(4, 2);
	}
}