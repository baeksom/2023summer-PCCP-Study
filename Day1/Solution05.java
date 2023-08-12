import java.util.*;
class Solution05 {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int d = 1;
        int n = board.length;
        int r = 0, c = 0;
        
        for(int i=0; i<k; i++){
            int nr = r + dr[d];
            int nc = c + dc[d];
            if(nr < 0 || nr >= n || nc < 0 || nc >= n || board[nr][nc] == 1){
                d = (d+1)%4;
                continue;
            }
            r = nr;
            c = nc;
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    }

    public static void main(String[] args){
        Solution05 T = new Solution05();
        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1},
                        {0, 0, 0, 0, 0}}, 10)));

        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 0, 1, 0, 1},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1},
                        {1, 1, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}}, 20)));

        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0}}, 25)));
    }
}
