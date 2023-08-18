import java.util.*;
class Solution06 {
    // 인접 행렬 사용
    int[] ch;
    int[][] relation;
    int answer;
    public void DFS(int v, int n){
        answer++;
        ch[v] = 1;
        for(int i=1; i<=n; i++){
            if(relation[v][i] == 1 && ch[i] == 0){ // i번째 노드에 방문을 안했다면
                DFS(i, n);  // i로 이동
            }
        }
    }
	public int solution(int n, int[][] edge){
		ch = new int[n+1];
        relation = new int[n+1][n+1];
        answer = 0;
        for(int[] arr : edge){
            relation[arr[0]][arr[1]] = 1;
            relation[arr[1]][arr[0]] = 1;
        }
        DFS(1, n);
        return n - answer;
	}
		
	public static void main(String[] args){
		Solution06 T = new Solution06();
		System.out.println(T.solution(11, new int[][]{{1, 2}, {1, 4}, {2, 3}, {4, 5}, {5, 6}, {7, 8}, {7, 10}, {8, 9}, {10, 11}}));
		System.out.println(T.solution(12, new int[][]{{1, 2}, {1, 7}, {1, 8}, {1, 6}, {8, 11}, {11, 12}}));
		System.out.println(T.solution(14, new int[][]{{1, 6}, {1, 5}, {6, 7}, {7, 8}, {9, 8}, {3, 4}, {4, 14}}));
		System.out.println(T.solution(15, new int[][]{{1, 4}, {1, 5}, {9, 5}, {9, 6}, {7, 9}, {7, 14}}));
	}
}