package lee.mj.practice;

public class Solution {
	public String solution(String s) {
		String answer = "";
		String sArray[]=s.split(" ");
		int iArray[]=new int[sArray.length];
		for(int i = 0; i<sArray.length;i++) {
			iArray[i] = Integer.parseInt(sArray[i]);
			}
		int min = 800000;
	    int max = 0;
		for(int i=0;i<iArray.length;i++) {
			if(min>iArray[i]) {
				min = iArray[i];
			}
			if(max < iArray[i]) {
				max = iArray[i];
			}
		}
		System.out.println(max+"  "+min);
		return answer;
	}

}
