package hilos;

public class Uso_de_Runnable implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Interfaz Runnable");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Uso_de_Runnable run= new Uso_de_Runnable();
	Thread thread= new Thread(run);
	thread.start(); // Invocar Método 
		
	}
}
