package lee.mj;

import javax.swing.JOptionPane;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� ���� �Է¹޾� ������ ���
		int n1;
		int n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��Ͻÿ�."));
		while( 1 > n1 || n1 > 9 ) {
			n1=Integer.parseInt(JOptionPane.showInputDialog("1�̻�9������ ���ڸ� �Է��� �ּ���."));
		}
		n2=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��Ͻÿ�."));
        while( n1 > n2 || n2 > 9 ) {
        	n2=Integer.parseInt(JOptionPane.showInputDialog(n1+"�̻�9������ ���ڸ� �Է��� �ּ���."));
        }  
		for(int i=n1;i<=n2;i++){
			System.out.println(i+"��");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
