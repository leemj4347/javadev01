package lee.mj;

import javax.swing.JOptionPane;

public class GetAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� Ű�� ���̸� �Է��ϼ���.");
		String input1 =JOptionPane.showInputDialog("�Ǽ� �Է�:");
		double result1 = Double.parseDouble(input1);
		String input2 =JOptionPane.showInputDialog("�Ǽ� �Է�:");
		double result2 = Double.parseDouble(input2);
		System.out.println("����� Ű�� "+result1+"�Դϴ�.");
		System.out.println("����� �����Դ� "+result2+"�Դϴ�.");

	}

}
