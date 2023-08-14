import java.util.*;
class Solution06 {
	public int solution(int[] nums){
		int answer=0;
		// PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->(b-a));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums){
            queue.offer(x);
        }
        while(queue.size() > 1){
            int a = queue.poll();
            int b = queue.poll();
            if(a != b){
                queue.offer(Math.abs(a-b));
            }
        }
        if(!queue.isEmpty()){
            answer = queue.poll();
        }
		return answer;
	}

	public static void main(String[] args){
		Solution06 T = new Solution06();
		System.out.println(T.solution(new int[]{5, 2, 4, 3, 1}));
		System.out.println(T.solution(new int[]{7, 6, 3, 2, 4, 5, 1}));
        System.out.println(T.solution(new int[]{5, 6, 7, 2, 3, 11, 15, 8, 9, 12, 23}));
	}
}