package excepciones;

public class Uso_de_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		
		int array[]= new int[2];
		
		System.out.println(array[4]);
		
		
//				Tipo de Excepción
		} catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("Fuera de rango");
			
		}
		
		
//		ArrayIndexOutBoundsException
//		NumberFormatException
//		ArithmeticException
//		Exception
		
		
	}

}
