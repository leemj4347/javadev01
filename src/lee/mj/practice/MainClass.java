package lee.mj.practice;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String input = JOptionPane.showInputDialog("�Է�:");
		 * 
		 * Center pick = new Center();
		 * 
		 * String print = pick.solution(input);
		 * 
		 * System.out.println("�������:"+print);
		 */
		String input = JOptionPane.showInputDialog("�Է�:");
		
		Hashad ha = new Hashad();
		boolean print = ha.solution(input);
		
		System.out.println("�ϻ���� :"+print);
	}

}
