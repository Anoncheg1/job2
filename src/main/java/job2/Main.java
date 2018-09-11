package job2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	private static Map<String, List<String>> m = new HashMap<String, List<String>>();
	
	static {
		List<String> l = new ArrayList<String>();
		l.add("+8 800 2000 500");
		l.add("+8 800 200 600");
		m.put("Иванов И.И.", l);		
		
		l = new ArrayList<String>();
		l.add("+8 830 200 500");
		l.add("+8 850 202 604");
		l.add("+8 802 203 605");
		m.put("Сидоров Г.Г.", l);
	}
	
	static public List<String> getNumber(String fio){
		return m.get(fio);
	}
	
	
	public static void main(String[] args) {
		String f = "";
		for (String arg : args)
			f += arg;
		
		List<String> n = getNumber(f);
		if(n != null) {
			for (String s : n)
				System.out.println(s);
			System.exit(0);
		}
		
		System.out.println("Такой фамилии нет в справочнике");
		System.exit(1);
	}

}
