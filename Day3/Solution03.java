import java.util.*;
class Solution03 {
	public int solution(int[] nums, int target){
		int answer = 0;
		int left = 0;
        int right = nums.length-1;
        
        while(left <= right){ // left == right 까지 가야함
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                answer = mid;
                break;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
        }
		return answer;
	}

	public static void main(String[] args){
		Solution03 T = new Solution03();
		System.out.println(T.solution(new int[]{2, 5, 7, 8, 10, 15, 20, 24, 25, 30}, 8));
		System.out.println(T.solution(new int[]{-3, 0, 2, 5, 8, 9, 12, 15}, 0));
	}
}