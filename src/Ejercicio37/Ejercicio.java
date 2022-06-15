package Ejercicio37;

public class Ejercicio implements Runnable{
	private String name;
	public Ejercicio(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName());
		System.out.println(this.name);
		System.out.println("probando");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread hilo1 = new Thread(new Ejercicio("hilo1"));
		Thread hilo2 = new Thread(new Ejercicio("hilo2"));
		Thread hilo3 = new Thread(new Ejercicio("hilo3"));
		
		hilo1.start();
		hilo1.getState();
		hilo2.start();
		hilo2.getState();
		hilo3.start();
		hilo3.getState();

	}



}
