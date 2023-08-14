import java.util.*;
class Solution03 {
	public int solution(int n, int k){
		int answer = 0; 
		Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        int cnt = k;
        while(queue.size() > 1){
            if(cnt > 1){
                queue.offer(queue.poll());
                cnt--;
            } else {
                queue.poll();
                cnt = k;
            }
        }
        answer = queue.poll();
		return answer;
	}

	public static void main(String[] args){
		Solution03 T = new Solution03();
		System.out.println(T.solution(8, 3));
		System.out.println(T.solution(20, 3));
		System.out.println(T.solution(100, 5));
	}
}