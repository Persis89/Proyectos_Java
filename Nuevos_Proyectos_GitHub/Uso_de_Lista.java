package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Uso_de_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name= new ArrayList();
		name.add("a");
		name.add("e");
		name.add("i");
		name.add("o");
		name.add("u");
		name.forEach(System.out::println);
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("Jhon", 100);
		map.put("Jame", 15);
		map.put("Jose", 45);
		
      map.entrySet().forEach(System.out::println);
		System.out.println(map.entrySet());
		
		for (HashMap.Entry<String,Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

	}

}
