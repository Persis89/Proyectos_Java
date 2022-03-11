package excepciones;

public class Uso_de_Excepciones_multiples {

	public void Division(int v1, int v2) throws ArithmeticException {
		
			int result= v1 / v2;
			System.out.println(result);
		
			if(v2 == 0) {
			
				throw new ArithmeticException("No divisible entre 0");
				
			}

		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uso_de_Excepciones_multiples invocar_excepciones= new Uso_de_Excepciones_multiples();
		invocar_excepciones.Division(12, 0);

		
	}

}
