package lee.mj;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello world";
		String str2 = new String("Hello world");
		boolean isSame = str1.equals(str2);
		boolean strRela = str1 == str2;

		System.out.println(isSame);
		System.out.println(strRela);
		int where = str1.lastIndexOf("o");
		System.out.println(where);
		str1 = str1.replace("world", "java");
		System.out.println(str1);
		String subResult = str1.substring(0,4);
		System.out.println(subResult);
		String str3 = str1.toUpperCase();
		System.out.println(str3);
		int strLegth = str1.length();
		System.out.println(strLegth);
		String longString ="a,b,c,d,e,f,g,h,i";
		String[] arrayStr = longString.split(",");
		
		for(int i=0; i<arrayStr.length; i++){
			System.out.println(">>"+arrayStr[i]);
		}
	}

}
