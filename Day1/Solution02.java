import java.util.*;
class Solution02 {
    public int[] solution(String moves){
        int[] answer = new int[2];
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('U',0);
        map.put('R',1);
        map.put('D',2);
        map.put('L',3);
        int r = 0, c = 0;
        for(char x : moves.toCharArray()){
            r += dr[map.get(x)];
            c += dc[map.get(x)];
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    } 
    public static void main(String[] args){
        Solution02 T = new Solution02();                  
        System.out.println(Arrays.toString(T.solution("RRRDDDLU")));
        System.out.println(Arrays.toString(T.solution("DDDRRRDDLL")));
        System.out.println(Arrays.toString(T.solution("RRRRRRDDDDDDUULLL")));
        System.out.println(Arrays.toString(T.solution("RRRRDDDRRDDLLUU")));
    }
}