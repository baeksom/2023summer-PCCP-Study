import java.util.HashMap;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int row = 0, col = 0;
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        HashMap<Character, Integer> direction = new HashMap<>();
        direction.put('N', 0);
        direction.put('E', 1);
        direction.put('S', 2);
        direction.put('W', 3);
        
        int n = park.length;
        int m = park[0].length();
        int r = 0, c = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if (park[i].charAt(j) == 'S'){
                    r = i;
                    c = j;
                }
            }
        }
        for(String tmp : routes){
            String[] route = tmp.split(" ");
            char cmd = route[0].charAt(0);
            int dis = Integer.parseInt(route[1]);
            boolean flag = true;
            int nr = r, nc = c;
            for(int i=0; i<dis; i++){
                nr += dr[direction.get(cmd)];
                nc += dc[direction.get(cmd)];
                if(nr < 0 || nr >= n || nc < 0 || nc >= m || park[nr].charAt(nc) == 'X'){
                    flag = false;
                    break;
                }
            }
            if (flag){
                r = nr;
                c = nc;
            }
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    }
}