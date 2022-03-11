package arreglos;

import java.util.Scanner;

public class Invertir_Arreglo_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		String text= entrada.nextLine();
		char []arr= text.toCharArray();
		
		
			
			String valor= String.valueOf(arr);
	
			
			StringBuilder str= new StringBuilder(valor);
			str.reverse();
			
			System.out.print(str);
			

	}

}
