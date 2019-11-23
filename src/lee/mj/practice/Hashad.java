package lee.mj.practice;

public class Hashad {
	public boolean solution(String input) {
		boolean result = false;
		
		int sum = 0;
		
		for(int i=0; i<input.length();i++) {
			sum += Integer.parseInt(input.substring(i,i+1));
		}
		int in = Integer.parseInt(input);
		if(in%sum == 0) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}

}
