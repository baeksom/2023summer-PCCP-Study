import java.util.*;
class Solution02 {
	public String solution(String s){
		String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        for(char c : stack){
            sb.append(c);
        }
        answer = sb.toString();
		return answer;
	}

	public static void main(String[] args){
		Solution02 T = new Solution02();
		System.out.println(T.solution("acbbcaa"));	
		System.out.println(T.solution("bacccaba"));	
		System.out.println(T.solution("aabaababbaa"));	
		System.out.println(T.solution("bcaacccbaabccabbaa"));	
		System.out.println(T.solution("cacaabbc"));	
	}
}