package lee.mj;

import javax.swing.JOptionPane;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값을 입력받아 받은 값의 단을 나타냄
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력해주세요."));

		System.out.println(i+"단");
		for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}

	}

}
