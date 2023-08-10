import java.util.*;
class Solution01 {
	public char solution(String s){
		char answer=' ';
        int max = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x, 0)+1);
        }
        for(char key : sH.keySet()){
            if(max < sH.get(key)){
                max = sH.get(key);
                answer = key;
            }
        }
		return answer;
	}

	public static void main(String[] args){
		Solution01 T = new Solution01();
		System.out.println(T.solution("BACBACCACCBDEDE"));
		System.out.println(T.solution("AAAAABBCCDDDD"));
		System.out.println(T.solution("AABBCCDDEEABCB"));
	}
}