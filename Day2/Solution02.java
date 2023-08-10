import java.util.*;
class Solution02 {
	public int solution(String s){
        HashMap<Character, Integer> sH = new HashMap<>();
        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x, 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(sH.get(s.charAt(i)) == 1){
                return i+1;
            }
        }
		return -1;
	}

	public static void main(String[] args){
		Solution02 T = new Solution02();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
