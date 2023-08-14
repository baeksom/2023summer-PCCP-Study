import java.util.*;
class Solution05 {
	public ArrayList<Integer> solution(int[] nums){
		ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums){
            if(x==0) {
                if(pQ.isEmpty()) answer.add(-1);
                else answer.add(pQ.poll());
            } else{
                pQ.offer(x);
            }
        }
        
		return answer;
	}

	public static void main(String[] args){
		Solution05 T = new Solution05();
		System.out.println(T.solution(new int[]{5, 3, 6, 0, 5, 0, 2, 4, 0}));
        System.out.println(T.solution(new int[]{2, 5, 7, 1, 0, 3, 0, 0}));
        System.out.println(T.solution(new int[]{3, 5, 0, 0, 0, 1, 0}));
	}
}