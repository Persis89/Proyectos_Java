package hilos;

public class Uso_de_Thread extends Thread {
	
	public int valor;
	
	public Uso_de_Thread(int v) {
		
		this.valor= v;
		
	}
	
	public void run() {
		
		System.out.println("Mensaje");
		System.out.println("Valores: " + valor);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uso_de_Thread instancia= new Uso_de_Thread(5);
		instancia.start();
		
		
	}

}
