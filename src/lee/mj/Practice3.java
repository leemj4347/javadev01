package lee.mj;

import javax.swing.JOptionPane;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2가지 수를 입력받아 구구단 출력
		int n1;
		int n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하시오."));
		while( 1 > n1 || n1 > 9 ) {
			n1=Integer.parseInt(JOptionPane.showInputDialog("1이상9이하의 숫자를 입력해 주세요."));
		}
		n2=Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하시오."));
        while( n1 > n2 || n2 > 9 ) {
        	n2=Integer.parseInt(JOptionPane.showInputDialog(n1+"이상9이하의 숫자를 입력해 주세요."));
        }  
		for(int i=n1;i<=n2;i++){
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
