package lee.mj;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �Է¹޾� �� �ڸ����� ���� ����
		int sum = 0;
		String input;
		input=JOptionPane.showInputDialog("���ڸ� �Է����ּ��� :");

		for(int i = 0; i<input.length() ; i++) {
			sum +=Integer.parseInt(input.substring(i,i+1));
		}
		System.out.println("�ڸ����� ������"+sum+"�Դϴ�.");

	}

}
