import java.util.*;
class Solution07 {
	public int solution(int[] nums, int k){
		int answer = 0;
        int sumN = 0;
        int left = 0;
        int window = nums.length - k; // 윈도우 개수
        for(int i=0; i<window; i++){
            sumN += nums[i];
        }
        int minS = sumN;
        for(int right = window; right<nums.length; right++){
            sumN += (nums[right] - nums[left++]);
            minS = Math.min(minS, sumN);
        }
        for(int i : nums){
            answer += i;
        }
		return answer - minS;
	}

	public static void main(String[] args){
		Solution07 T = new Solution07();
		System.out.println(T.solution(new int[]{2, 3, 7, 1, 2, 1, 5}, 4));
		System.out.println(T.solution(new int[]{1, 2, 3, 5, 6, 7, 1, 3, 9}, 5));
        System.out.println(T.solution(new int[]{1, 30, 3, 5, 6, 7}, 3));
        System.out.println(T.solution(new int[]{1, 2, 15, 3, 6, 7, 8, 9}, 5));
        System.out.println(T.solution(new int[]{12, 5, 6, 12, 34, 35, 13, 3, 7, 8, 9}, 7));
	}
}