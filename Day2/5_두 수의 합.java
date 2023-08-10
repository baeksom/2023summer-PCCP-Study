import java.util.*;
class Solution {
	public int[] solution(int[] nums, int target){
		int[] answer = new int[2];

        /*
        // 1. O(n^2) - n^2 /2 + n/2
		for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answer[0] = nums[i];
                    answer[1] = nums[j];
                }
            }
        }
        Arrays.sort(answer);
        */
        
        /*
        // 2. O(n log n)
        Arrays.sort(nums);
        // two pointers algorithm
        int left = 0;
        int right = nums.length - 1; 

        while(left < right){
            int result = nums[left] + nums[right];
            if(result < target){
                left++;
            }
            else if(result > target){
                right--;
            }
            else{
                answer[0] = nums[left];
                answer[1] = nums[right];
                break;
                //return new int[]{nums[left], nums[right]};
            }
        }
        */

        
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new int[]{3, 7, 2, 12, 9, 15, 8}, 12)));
		System.out.println(Arrays.toString(T.solution(new int[]{21, 12, 30, 15, 6, 2, 9, 19, 14}, 24)));
		System.out.println(Arrays.toString(T.solution(new int[]{12, 18, 5, 8, 21, 27, 22, 25, 16, 2}, 28)));
		System.out.println(Arrays.toString(T.solution(new int[]{11, 17, 6, 8, 21, 9, 19, 12, 25, 16, 2}, 26)));
		System.out.println(Arrays.toString(T.solution(new int[]{7, 5, 12, -9, -12, 22, -30, -35, -21}, -14)));
		System.out.println(Arrays.toString(T.solution(new int[]{7, 5, 12, 20}, 15)));
	}
}