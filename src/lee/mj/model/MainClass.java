package lee.mj.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk KimCoding = new SungJuk();
		KimCoding.setUsername("���ڵ�");
		KimCoding.setScratch(72);
		KimCoding.setEntry(63);
		KimCoding.setcLanguage(82);
		KimCoding.setJava(49);
		KimCoding.setPython(92);
		KimCoding.setMath(75);
		
		SungJuk leeSoen = new SungJuk();
		leeSoen.setUsername("�̼ҿ�");
		leeSoen.setScratch(58);
		
		SungJuk sunny = new SungJuk();
		sunny.setUsername("�ڽ��");
		sunny.setScratch(86);
		
		SungJuk misun = new SungJuk();
		misun.setUsername("Ȳ�̼�");
		misun.setScratch(63);
		
		SungJuk jaesuck =new SungJuk();
		jaesuck.setUsername("���缮");
		jaesuck.setScratch(72);
		
		List<SungJuk> classList = new ArrayList<SungJuk>();
		classList.add(KimCoding);
		classList.add(sunny);
		classList.add(misun);
		classList.add(leeSoen);
		classList.add(jaesuck);
		
		for(int i=0; i<classList.size();i++) {
			SungJuk item = classList.get(i);
			double ave = item.average();
			System.out.println(ave);
		}
		
		Map<String, SungJuk> map = new HashMap<String, SungJuk>();
		map.put("���ڵ�", KimCoding);
		map.put("�̼ҿ�", leeSoen);
		map.put("�ڽ��", sunny);
		map.put("Ȳ�̼�", misun);
		map.put("���缮", jaesuck);
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String name = keys.next();
			SungJuk item = map.get(name);
			double ave = item.average();
			System.out.println(name+":"+ave);
		}
	}

}
