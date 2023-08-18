import java.util.*;
class Solution06_2 {
    int answer;
    int[] ch;
    ArrayList<ArrayList<Integer>> al;
    public void DFS(int v){
        answer++;
        ch[v] = 1;
        for(int nv : al.get(v)){
            if(ch[nv] == 0){
                DFS(nv);
            }
        }
    }
	public int solution(int n, int[][] edge){
		answer = 0;
        ch = new int[n+1];
        al = new ArrayList<>();
        for(int i=0; i<=n; i++){
            al.add(new ArrayList<>());
        }
        for(int[] arr : edge){
            al.get(arr[0]).add(arr[1]);
            al.get(arr[1]).add(arr[0]);
        }
        DFS(1);
        return n-answer;
	}
		
	public static void main(String[] args){
		Solution06_2 T = new Solution06_2();
		System.out.println(T.solution(11, new int[][]{{1, 2}, {1, 4}, {2, 3}, {4, 5}, {5, 6}, {7, 8}, {7, 10}, {8, 9}, {10, 11}}));
		System.out.println(T.solution(12, new int[][]{{1, 2}, {1, 7}, {1, 8}, {1, 6}, {8, 11}, {11, 12}}));
		System.out.println(T.solution(14, new int[][]{{1, 6}, {1, 5}, {6, 7}, {7, 8}, {9, 8}, {3, 4}, {4, 14}}));
		System.out.println(T.solution(15, new int[][]{{1, 4}, {1, 5}, {9, 5}, {9, 6}, {7, 9}, {7, 14}}));
	}
}