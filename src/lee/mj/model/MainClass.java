package lee.mj.model;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk KimCoding = new SungJuk();
		KimCoding.setUsername("김코딩");
		KimCoding.setScratch(72);
		KimCoding.setEntry(63);
		KimCoding.setcLanguage(82);
		KimCoding.setJava(49);
		KimCoding.setPython(91);
		KimCoding.setMath(75);
		
		SungJuk LeeSoen = new SungJuk();
		LeeSoen.setUsername("이소엔");
		LeeSoen.setScratch(58);
		LeeSoen.setEntry(72);
		LeeSoen.setcLanguage(47);
		LeeSoen.setJava(92);
		LeeSoen.setPython(87);
		LeeSoen.setMath(82);
		
		SungJuk ParkSunny = new SungJuk();
		ParkSunny.setUsername("박써니");
		ParkSunny.setScratch(83);
		ParkSunny.setEntry(81);
		ParkSunny.setcLanguage(29);
		ParkSunny.setJava(56);
		ParkSunny.setPython(92);
		ParkSunny.setMath(69);
		
		SungJuk HwangIseon = new SungJuk();
		HwangIseon.setUsername("황이선");
		HwangIseon.setScratch(63);
		HwangIseon.setEntry(49);
		HwangIseon.setcLanguage(86);
		HwangIseon.setJava(37);
		HwangIseon.setPython(85);
		HwangIseon.setMath(64);
		
		SungJuk WooJaesuk = new SungJuk();
		WooJaesuk.setUsername("우재석");
		WooJaesuk.setScratch(72);
		WooJaesuk.setEntry(58);
		WooJaesuk.setcLanguage(62);
		WooJaesuk.setJava(59);
		WooJaesuk.setPython(82);
		WooJaesuk.setMath(79);
		
		SungJuk [] array = new SungJuk[5];
		array[0] = KimCoding;
		array[1] = LeeSoen;
		array[2] = ParkSunny;
		array[3] = HwangIseon;
		array[4] = WooJaesuk;
	}

}
