package lee.mj;

import javax.swing.JOptionPane;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �Է¹޾� ���� ���� ���� ��Ÿ��
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է����ּ���."));

		System.out.println(i+"��");
		for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}

	}

}
