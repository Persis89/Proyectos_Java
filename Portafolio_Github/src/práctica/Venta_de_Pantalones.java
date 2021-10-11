package práctica;


import javax.swing.JOptionPane;

public class Venta_de_Pantalones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio= 500;
		double descuento= 0.30;
		
		int Pants= Integer.parseInt(JOptionPane.showInputDialog("Cuantos Pantalones vas a llevar: "));
		
		if(Pants > 2) {
			
			double Mayoreo=  Pants * (precio - (precio * descuento));
			System.out.println("Vas a llevarte " +  Pants + " Pantalones y  su costo es de $ " + Mayoreo);
			
		} else {
			
			double Minorista= precio * Pants;
			System.out.println("Vas a llevarte " + Pants + " Pantalon y su costo es de $ " + Minorista);
			
			
		}

	}

}
