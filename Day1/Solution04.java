import java.util.*;
class Solution04 {
    public int[] solution(String moves){
        int[] answer = new int[2];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int r = 0, c = 0;
        int d = 1;
        for(char x : moves.toCharArray()){
            switch(x){
                case 'G':
                    r += dr[d];
                    c += dc[d];
                    break;
                case 'R':
                    d = (d+1)%4;
                    break;
                case 'L':
                    d = (d+3)%4;
                    break;
            }
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    }

    public static void main(String[] args){
        Solution04 T = new Solution04();
        System.out.println(Arrays.toString(T.solution("GGGRGGG")));
        System.out.println(Arrays.toString(T.solution("GGRGGG")));
        System.out.println(Arrays.toString(T.solution("GGGGGGGRGGGRGGRGGGLGGG")));
        System.out.println(Arrays.toString(T.solution("GGLLLGLGGG")));
    }
}
