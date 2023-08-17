import java.util.*;
class Solution {
    // Stack<Integer> pm;
    // ArrayList<Integer> al;
    // int[] ch;
    // int answer;
    // public int solution(int[][] ability) {
    //     answer = 0;
    //     pm = new Stack<>();
    //     al = new ArrayList<>();
    //     int student = ability.length;
    //     int event = ability[0].length;
    //     int L = 0;
    //     ch = new int[student];
    //     DFS(0, student, event, ability);
    //     int max = Integer.MIN_VALUE;
    //     for(int x : al){
    //         max = Math.max(max, x);
    //     }
    //     return max;
    // }
    // public void DFS(int L, int student, int event, int[][] ability){
    //     if(pm.size() == event){
    //         int tmp = 0;
    //         for(int x : pm){
    //             tmp += x;
    //         }
    //         al.add(tmp);
    //     }
    //     else{
    //         for(int i=0; i<student; i++){
    //             if(ch[i] == 0){
    //                 ch[i] = 1;
    //                 pm.push(ability[i][L]);
    //                 DFS(L+1, student, event, ability);
    //                 ch[i] = 0;
    //                 pm.pop();
    //             }
    //         }
    //     }
    // }
    
//     int answer = 0;
//     public int solution(int[][] ability){
//         int student = ability.length;
//         int event = ability[0].length;
//         int[] ch = new int[student];
//         DFS(0, 0, student, event, ch, ability);
//         return answer;
//     }
    
//     public void DFS(int L, int sum, int student, int event, int[] ch, int[][] ability){
//         if(L == event){
//             answer = Math.max(sum, answer);
//         }
//         else{
//             for(int i=0; i<student; i++){
//                 if(ch[i] == 0){
//                     ch[i] = 1;
//                     DFS(L+1, sum + ability[i][L], student, event, ch, ability);
//                     ch[i] = 0;
//                 }
//             }
//         }
//     }
    
    int answer = 0;
    int[] pm;
    
    public int solution(int[][] ability){
        int student = ability.length;
        int event = ability[0].length;
        int[] ch = new int[student];
        pm = new int[event];
        DFS(0, student, event, ability, ch, pm);
        return answer;
    }
    public void DFS(int L, int student, int event, int[][] ability, int[] ch, int[] pm){
        if(L == event){
            int sum = 0;
            for(int i=0; i<event; i++){
                sum += ability[pm[i]][i];
            }
            answer = Math.max(sum, answer);
        }
        else{
            for(int i=0; i<student; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = i;
                    DFS(L+1, student, event, ability, ch, pm);
                    ch[i] = 0;
                    // pm[L] = 0;
                }
            }
        }
    }
    
}