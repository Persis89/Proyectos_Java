package excepciones;

public class Uso_de_try_catch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1= 12;
		int valor2= 0;
		try {
			
			int result= valor1 / valor2;
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Error, no puede ser divisible entre 0");
		}
		
	}

}
