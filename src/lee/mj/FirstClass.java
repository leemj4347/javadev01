package lee.mj;

public class FirstClass {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// sysout 컨트롤 + 스페이스바
		System.out.println("Hello World");
		Storage storage = new Storage();
		storage.num1 = 10;
		storage.num2 = 20;
		
		System.out.println(storage.num2);
		
		int total = storage.num1 + storage.num2;
		
		System.out.println("total:" + total);
		System.out.println("total:" + (total + storage.num1));
	}

}
