import java.util.*;
class Solution04 {	
    public int Count(int k, int[] nums){
        int cnt = 0;
        for(int x : nums){
            cnt += (x/k);
        }
        return cnt;
    }
	public int solution(int[] nums, int n){
		int answer = 0;
        int left = 1;
        int right = 0;
        for(int x : nums){
            right = Math.max(right, x);
        }
        
        while(left <= right){
            int mid = (left + right) /2;
            if(Count(mid, nums) >= n){
                answer = mid;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
		return answer;
	}

	public static void main(String[] args){
		Solution04 T = new Solution04();
		System.out.println(T.solution(new int[]{802, 743, 457, 539}, 11));
		System.out.println(T.solution(new int[]{8593, 9617, 9313, 4513, 7505, 5457, 8257, 4689, 2657}, 100));
		System.out.println(T.solution(new int[]{93, 97, 93, 53, 75, 57, 85, 89, 67}, 30));
	}
}