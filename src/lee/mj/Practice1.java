package lee.mj;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수를 입력받아 각 자릿수의 합을 구함
		int sum = 0;
		String input;
		input=JOptionPane.showInputDialog("숫자를 입력해주세요 :");

		for(int i = 0; i<input.length() ; i++) {
			sum +=Integer.parseInt(input.substring(i,i+1));
		}
		System.out.println("자릿수의 총합은"+sum+"입니다.");

	}

}
