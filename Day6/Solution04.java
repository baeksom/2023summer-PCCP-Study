import java.util.*;
class Solution04 {
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    int cnt = 0;
    public void DFS(int r, int c, int[][] board){
        board[r][c] = 0;
        cnt++;
        for(int i=0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr>=0 && nr<5 && nc >=0 && nc<5 && board[nr][nc] == 1){
                DFS(nr, nc, board);
            }
        }
    }
	public int[] solution(int[][] board){
        int n = board.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    cnt = 0;
                    DFS(i, j, board);
                    al.add(cnt);
                }
            }
        }
        int[] answer = new int[al.size()];
        for(int i=0; i<al.size(); i++) answer[i] = al.get(i);
        return answer;
	}
    
		
	public static void main(String[] args){
		Solution04 T = new Solution04();
		System.out.println(Arrays.toString(T.solution(new int[][]{{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 1, 0}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{1, 1, 1, 0, 1}, {1, 1, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 0}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {1, 0, 0, 1, 0}, {0, 0, 1, 1, 0}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}})));
	}
}
