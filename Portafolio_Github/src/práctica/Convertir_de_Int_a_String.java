package práctica;

import javax.swing.JOptionPane;

public class Convertir_de_Int_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= Integer.parseInt(JOptionPane.showInputDialog("Dame Valor: "));
		String Cadena= String.valueOf(n);
		
		if( Cadena != null) {
			
			System.out.println("Convertido en Cadena: " +  Cadena);
			
		} else {
			
			System.out.println("Sigue siendo entero");
			
		}
		
	}

}
