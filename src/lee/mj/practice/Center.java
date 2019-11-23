package lee.mj.practice;

public class Center {
	public String solution(String s) {
		String result = "";
		
		if(s.length()%2 == 0) {
			result = s.substring(s.length()/2-1,s.length()/2+1);
		}else {
			result = s.substring(s.length()/2,s.length()/2+1);
		}
		
		return result;
	}
	

}
