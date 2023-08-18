import java.util.*;
class Solution03 {
	public int solution(int[][] board){
		int answer=0;
		int[] front = new int[board.length];
        int[] side = new int[board.length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                front[i] = Math.max(board[j][i], front[i]);
                side[i] = Math.max(board[i][j], side[i]);
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                int tmp = Math.min(front[j], side[i]);
                if(board[i][j] < tmp){
                    answer += tmp - board[i][j];
                }
            }
        }
		return answer;
	}

	public static void main(String[] args){
		Solution03 T = new Solution03();
		System.out.println(T.solution(new int[][]{{2, 5, 7, 3}, 
                                                    {6, 8, 9, 7}, 
                                                    {3, 2, 4, 5}, 
                                                    {7, 2, 5, 8}}));
		System.out.println(T.solution(new int[][]{{3, 7, 6, 2}, {5, 3, 8, 7}, {3, 2, 5, 7}, {7, 7, 5, 3}}));
		System.out.println(T.solution(new int[][]{{2, 5, 7, 3, 5}, {6, 8, 9, 7, 3}, {3, 2, 4, 5, 7}, {7, 2, 5, 8, 6}, {1, 2, 3, 4 ,5}}));
        System.out.println(T.solution(new int[][]{{10, 11, 12, 11, 15}, {15, 12, 13, 23, 11}, {11, 13, 23, 25,
            1}, {11, 2, 3, 11, 13}, {5, 7, 9, 10, 12}}));
	}
}