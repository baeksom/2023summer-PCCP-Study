import java.util.*;
class Solution03 {
    public int[] solution(int n, String moves){
        int[] answer = new int[2];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('U', 0);
        map.put('R', 1);
        map.put('D', 2);
        map.put('L', 3);
        int r = 0, c = 0;
        for(char x : moves.toCharArray()){
            int nr = r + dr[map.get(x)];
            int nc = c + dc[map.get(x)];
            if(nr >= 0 && nr < n && nc >= 0 && nc < n){
                r = nr;
                c = nc;
            }
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(Arrays.toString(T.solution(5, "RRRDDDUUUUUUL")));
        System.out.println(Arrays.toString(T.solution(7, "DDDRRRDDLL")));
        System.out.println(Arrays.toString(T.solution(5, "RRRRRDDDDDU")));
        System.out.println(Arrays.toString(T.solution(6, "RRRRDDDRRDDLLUU")));
    }
}
