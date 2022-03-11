package colecciones;

import java.util.Vector;

public class Uso_de_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> num= new Vector<>();
		num.add("one");
		num.add("two");
		num.add("three");
		
		System.out.println(num);
		System.out.println(num.size());
		
		for(String valores: num) {
			
			System.out.println(valores);
			
			
		}

	}

}
