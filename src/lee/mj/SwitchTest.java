package lee.mj;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ln_Num;
		ln_Num=Integer.parseInt(JOptionPane.showInputDialog("번호입력 :"));

		switch(ln_Num) {
		case 1:
			System.out.println("예금조회를 선택하셨습니다.");break;
		case 2:
			System.out.println("예금출금를 선택하셨습니다.");break;
		case 3:
			System.out.println("예금이체를 선택하셨습니다.");break;
		default:
			System.out.println("번호를 잘못 누르셨습니다.");
		}	

	}

}
