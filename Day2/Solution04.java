// 최대 팰린드롬 길이
import java.util.*;
class Solution04 {
	public int solution(String s){
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        boolean flag = true;
        for(char key : map.keySet()){
            if(map.get(key)%2 == 0){
                answer += map.get(key);
            }
            else{
                answer += map.get(key)-1;
                flag = false;
            }
        }
		return flag?answer:answer+1;
	}

	public static void main(String[] args){
		Solution04 T = new Solution04();
		System.out.println(T.solution("abcbbbccaaeee"));
		System.out.println(T.solution("aabbccddee"));
		System.out.println(T.solution("fgfgabtetaaaetytceefcecekefefkccckbsgaafffg"));
		System.out.println(T.solution("aabcefagcefbcabbcc"));
		System.out.println(T.solution("abcbbbccaa"));
	}
}