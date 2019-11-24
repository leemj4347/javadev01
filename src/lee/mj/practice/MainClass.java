package lee.mj.practice;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String input = JOptionPane.showInputDialog("입력:");
		 * 
		 * Center pick = new Center();
		 * 
		 * String print = pick.solution(input);
		 * 
		 * System.out.println("가운데글자:"+print);
		 *
		 * String input = JOptionPane.showInputDialog("입력:");
		 * 
		 * Hashad ha = new Hashad(); boolean print = ha.solution(input);
		 * 
		 * System.out.println("하샤드수 :"+print);
		 */
		 String s = JOptionPane.showInputDialog("입력:");
		 Solution so = new Solution();
		 String print = so.solution(s);
		 System.out.println(print);
	}

}
