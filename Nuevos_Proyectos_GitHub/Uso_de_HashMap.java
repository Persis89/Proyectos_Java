package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Uso_de_HashMap {
	
	HashMap<String,Integer> players; // Attribute
	
	public Uso_de_HashMap() { // Constructor
		
		players= new HashMap<String,Integer>();
	}
	
	public void addPlayer(String name, int point) { //Method with parameters
		
		players.put(name, point);
		
	}
	
	public void getWinner() { // Method without parameters
		
		
		
		players.entrySet().forEach(System.out::println);
	
		
//		List<HashMap.Entry<String,Integer>> list = new ArrayList<>(players.entrySet());
//		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getValue()-o2.getValue(); // Reescribe las reglas de clasificación, menor que 0 significa orden ascendente, mayor que 0 significa orden descendente
//			}
//		});
//		// Usa el iterador para recorrer los elementos en la lista
//		Iterator<Map.Entry<String, Integer>> iter = list.iterator();
//		while(iter.hasNext()){
//			Map.Entry<String, Integer> item = iter.next();
//			String key = item.getKey();
//			int value = item.getValue();
//			
//			System.out.println(key + " " + value);
//		}
		
//		LinkedHashMap<String,Integer> t= new LinkedHashMap<>();
//	    t.putAll(players);
//	    
//		for (String name : players.keySet()) {
//		    Integer valor = players.get(name);
//		    
//		    
//		    
//		    System.out.println(name + " " + valor);
//		    
//		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uso_de_HashMap game= new Uso_de_HashMap();
		
		Scanner entrada= new Scanner(System.in);
		
		for(int i=0; i <3; i++) {
			
			String input= entrada.nextLine();
			String [] valores= input.split(" ");
			String name= valores[0];
			
			int puntos= Integer.parseInt(valores[1]);
			
			game.addPlayer(name, puntos);
			
			
		}
		
		game.getWinner();
		
	}

}
