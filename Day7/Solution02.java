import java.util.*;
class Solution02 {
	public int solution(int[][] board){
		int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int cnt = 0;
        int dD = 0, dH = 0;
        int rD=0, cD=0, rH=0, cH=0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(board[i][j] == 2){
                    rH = i;
                    cH = j;
                }
                else if(board[i][j] == 3){
                    rD = i;
                    cD = j;
                }
            }
        }
        while(cnt <= 10000){
            if(rD == rH && cD == cH){
                break;
            }
            int nrD = rD + dr[dD];
            int ncD = cD + dc[dD];
            int nrH = rH + dr[dH];
            int ncH = cH + dc[dH];
            if(nrD >= 0 && nrD < 10 && ncD >= 0 && ncD < 10 && board[nrD][ncD] != 1){
                rD = nrD;
                cD = ncD;
            } 
            else dD = (dD+1) %4;
            if(nrH >= 0 && nrH < 10 && ncH >= 0 && ncH < 10 && board[nrH][ncH] != 1){
                rH = nrH;
                cH = ncH;
            }
            else dH = (dH+1) %4;
            cnt++;
        }
        return cnt>10000 ? -1 : cnt;
	}

	public static void main(String[] args){
		Solution02 T = new Solution02();
		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
		System.out.println(T.solution(arr1));
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
		System.out.println(T.solution(arr2));
	}
}