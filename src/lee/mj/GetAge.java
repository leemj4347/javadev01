package lee.mj;

import javax.swing.JOptionPane;

public class GetAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 키와 나이를 입력하세요.");
		String input1 =JOptionPane.showInputDialog("실수 입력:");
		double result1 = Double.parseDouble(input1);
		String input2 =JOptionPane.showInputDialog("실수 입력:");
		double result2 = Double.parseDouble(input2);
		System.out.println("당신의 키는 "+result1+"입니다.");
		System.out.println("당신의 몸무게는 "+result2+"입니다.");

	}

}
