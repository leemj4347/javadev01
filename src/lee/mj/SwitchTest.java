package lee.mj;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ln_Num;
		ln_Num=Integer.parseInt(JOptionPane.showInputDialog("��ȣ�Է� :"));

		switch(ln_Num) {
		case 1:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");break;
		case 2:
			System.out.println("������ݸ� �����ϼ̽��ϴ�.");break;
		case 3:
			System.out.println("������ü�� �����ϼ̽��ϴ�.");break;
		default:
			System.out.println("��ȣ�� �߸� �����̽��ϴ�.");
		}	

	}

}
