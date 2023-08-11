import java.util.*;
class Solution {
	public int solution(String s){
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int cnt = 0;
        for(char key : map.keySet()){
            if(map.get(key)%2 != 0){
                cnt++;
            }
        }
		return cnt>0?s.length()-cnt+1:s.length();
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution("abcbbbccaaeee"));
		System.out.println(T.solution("aabbccddee"));
		System.out.println(T.solution("fgfgabtetaaaetytceefcecekefefkccckbsgaafffg"));
		System.out.println(T.solution("aabcefagcefbcabbcc"));
		System.out.println(T.solution("abcbbbccaa"));
	}
}