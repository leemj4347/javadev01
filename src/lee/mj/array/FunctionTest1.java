package lee.mj.array;

import javax.swing.JOptionPane;

public class FunctionTest1 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionTest1 object= new FunctionTest1();
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("°ª1"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("°ª2"));
		
		int sumResult= object.sum(num1, num2);
		int minusResult=object.minus(num1, num2);
		int multiResult=object.multi(num1, num2);
		System.out.println(sumResult);
		System.out.println(minusResult);
		System.out.println(multiResult);

	}

}
