import java.util.*;
class Info implements Comparable<Info>{
    	public String name;
	    public int time;
    	Info(String name, int time){
		    this.name = name;
        	this.time = time;
    	}
    	@Override
    	public int compareTo(Info ob){
		return this.time - ob.time;
   	 }
}
class Solution05 {
	public int getTime(String time){
		int H = Integer.parseInt(time.split(":")[0]);
		int M = Integer.parseInt(time.split(":")[1]);
		return H*60+M;
	}
	public String[] solution(String[] reports, String times){
        ArrayList<Info> tmp = new ArrayList<>();
        for(String x : reports){
            String[] str = x.split(" ");
            tmp.add(new Info(str[0], getTime(str[1])));
        }
        Collections.sort(tmp);
        int start = getTime(times.split(" ")[0]);
        int end = getTime(times.split(" ")[1]);
		ArrayList<String> res = new ArrayList<>();
        for(Info ob : tmp){
            if(ob.time >= start && ob.time <= end){
                res.add(ob.name);
            }
            if(ob.time > end) break;
        }
        String[] answer = new String[res.size()];
        for(int i=0; i<answer.length; i++) answer[i] = res.get(i);
		return answer;
	}

	public static void main(String[] args){
		Solution05 T = new Solution05();
		System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
		System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
		System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
	}
}