import java.util.*;
class Solution02 {	
    int answer;
    int[] ch;
    int[][] relation;
    Stack<Integer> pm;

    public void DFS(int L){
        if(L == 7){
            answer++;
        }
        else{
            for(int i=1; i<= 7; i++){
                if(!pm.isEmpty() && relation[pm.peek()][i] == 1){
                    continue;
                }
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm.push(i);
                    DFS(L+1);
                    ch[i] = 0;
                    pm.pop();
                }
            }
        }
    }
    public int solution(int[][] fight){
        answer = 0;
        ch = new int[8];
        relation = new int[8][8];
        pm = new Stack<>();
        for(int[] arr : fight){
            relation[arr[0]][arr[1]] = 1;
            relation[arr[1]][arr[0]] = 1;
        }
        DFS(0);
        return answer;
    }
		
	public static void main(String[] args){
		Solution02 T = new Solution02();
		System.out.println(T.solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
		System.out.println(T.solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
		System.out.println(T.solution(new int[][]{{1, 7}}));
		System.out.println(T.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
	}
}
