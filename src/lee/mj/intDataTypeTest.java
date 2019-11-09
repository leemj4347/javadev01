package lee.mj;

public class intDataTypeTest {
	public static void main(String[] args) {
		/*
		 * //byte aVar = 100; //short bVar = 30000; //int cVar = 50000; //long dVar =
		 * 1000000; //System.out.println("byte 타입 :"+aVar);
		 * //System.out.println("short 타입 :"+bVar);
		 * //System.out.println("int 타입 :"+cVar);
		 * //System.out.println("long 타입 :"+dVar);
		 * 
		 * 
		 * //float aVar; //double bVar;
		 * 
		 * //aVar=20.1f; float뒤에는 f를 붙여야됨 //bVar=20.1;
		 * //System.out.println("float 타입 :"+ aVar); //System.out.println("double 타입 :"+
		 * bVar);
		 */		boolean aVar=true;
		System.out.println(aVar);
		String strNum1="789";
		String strNum2="211";
		int number1= Integer.parseInt(strNum1);
		int number2= Integer.parseInt(strNum2);
		int sum= number1 + number2;
		System.out.println(sum);
	}

}
