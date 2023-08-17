import java.util.*;
class Solution02 {
	public int solution(int home){
		Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        int L = 0;
        
        // while(!Q.isEmpty()){
        //     boolean flag = false;
        //     int n = Q.size();
        //     for(int i=0; i<n; i++){
        //         int v = Q.peek();
        //         for(int nv : new int[]{v-1, v+1, v+5}){
        //             if(nv == home) flag = true;
        //             if(Q.contains(nv)) continue;
        //             Q.offer(nv);
        //         }
        //     }
        //     L++;
        //     if(flag){
        //         break;
        //     }
        // }

        int[] check = new int[10001];
        check[0] = 1;
        while(!Q.isEmpty()){
            int n = Q.size();
            for(int i=0; i<n; i++){
                int v = Q.poll();
                for(int nv : new int[]{v-1, v+1, v+5}){
                    if(nv > 0 && nv < check.length && check[nv] == 0){
                        if(nv == home) return ++L;
                        check[nv] = 1;
                        Q.offer(nv);
                    }
                }
            }
            L++;
        }
        return L;
	}
		
	public static void main(String[] args){
		Solution02 T = new Solution02();
		System.out.println(T.solution(10));
		System.out.println(T.solution(14));
		System.out.println(T.solution(25));
		System.out.println(T.solution(24));
		System.out.println(T.solution(345));
	}
}