package práctica; // Paquete que guarda esta clase

import javax.swing.JOptionPane; // Libreria a utilizar

	/*  
	 * Escribe un programa que permita generar la tabla de multiplicar de un numero entero positivo N,
	 *  comenzando desde 0.
	 *  
	 *  Si el usuario escribe un numero incorrecto, el programa no se ejecuta.
	 *  En cambio, pregunta de nuevo por la información hasta que el dato 
	 *  ingresado sea correcto.
	 *  
	 */
	 
public class Tabla_de_Multiplicar { // Clase
	
public void Multiplicar() { // Metodo
		
		
		JOptionPane.showMessageDialog(null,"Multiplicar","Ingreso de Datos",1);
		
			
//			int suma=1;  Valor inicial para sumar 
			boolean comprobar= true; // Variable 
			
			while(comprobar==true) { // Mientras se cumpla la condicion se ejecuta las instrucciones siguientes.
				
				int N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo: "));

				// Si se cumple condicionn se ejecuta lo que esta adentro del condigo que seria sumar valores
				// incrementando en 1.
				if(N > 0) { // El número es positivo porque es mayor que 0
			
					for(int i=0; i <= 10;  i++) { // Ciclar valor 10 veces e incrementar en 1.
				
//						while(i < 10) { Cumple la misma funcion del bucle for si se cumple se incrementa abajo en 1.

//						suma= N * i; Realizar Operación de Multiplicar y guardar en variable suma.
				
						System.out.println(N + " x " + i + " = " + N * i ); // (n * i)
						
//						i++; Incremento del Bucle o Ciclo
//					    }
				
					} // Cierre del Bucle for
			
			// Si no se cumple condicion se detiene proceso.
			 comprobar = false;
			
				} else { // Si no se cumple se ejecuta la siguiente instrucción.
			
			System.out.println("El numero ingresado no es correcto, intentalo de nuevo");
			
			} // Cierre del while
				} // Cierre del else
		
		
} // Cierre del Metodo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tabla_de_Multiplicar invocar_metodo= new Tabla_de_Multiplicar();
		invocar_metodo.Multiplicar();
		
	}


}
