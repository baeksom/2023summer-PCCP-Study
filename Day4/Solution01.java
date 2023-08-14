import java.util.*;
class Solution01 {
	public String solution(String s){
		String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && !stack.isEmpty()){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        answer = sb.reverse().toString();
		return answer;
	}

	public static void main(String[] args){
		Solution01 T = new Solution01();
		System.out.println(T.solution("abc##ec#ab"));	
		System.out.println(T.solution("kefd#ef##s##"));	
		System.out.println(T.solution("teac#cher##er"));	
		System.out.println(T.solution("englitk##shabcde##ff##ef##ashe####"));	
		System.out.println(T.solution("itistime####gold"));	
	}
}