import java.util.*;
class Solution05 {
	Stack<Integer> pm = new Stack<>();
	public void DFS(int L, int n, int m, int[] ch){
		if(L == m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=1; i<=n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm.push(i);
                    DFS(L+1, n, m, ch);
                    ch[i] = 0;
                    pm.pop();
                }
            }
        }
	}
	public void solution(int n, int m){
		int[] ch = new int[n+1];
		DFS(0, n, m, ch);
	}
	public static void main(String[] args){
		Solution05 T = new Solution05();
		T.solution(3, 2);
	}
}