import java.util.*;
class Solution03 {
	public int[] solution(String s){
		int[] answer = new int[5];
		String str = "abcde";
        HashMap<Character, Integer> sH = new HashMap<>();

        for(char x : str.toCharArray()){
            sH.put(x, 0);
        }
        for(char x : s.toCharArray()){
            sH.put(x, sH.get(x) + 1);
        }

        int max = Collections.max(sH.values());
        for(int i=0; i<str.length(); i++){
            answer[i] = max - sH.get(str.charAt(i));
        }
        
		return answer;
	}

	public static void main(String[] args){
		Solution03 T = new Solution03();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
