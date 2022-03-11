package enumeraciones;

import javax.swing.JOptionPane;

public class Cartas {
	
	public enum Figura {
		
		Corazon,
		Trebol,
		Diamante,
		Espada
		
	}
	
	private Figura fig;
	
	public Cartas(int numero, Figura fig) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Valor = Integer.parseInt(JOptionPane.showInputDialog("Dame Valor: "));
		
		Cartas uso= new Cartas(Valor, Figura.Corazon);
		
		
		System.out.println(uso);
		
	}

}
