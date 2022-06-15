package Ejercicio39;

public class Coche implements Runnable{

private String marca;
private String modelo;


public Coche(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}


@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println(this.marca);
	try {
		Thread.sleep(1000);
		if(Thread.currentThread().getName().compareTo("hilo2")==0)
		{
			System.out.println("Hilo 2 -> " + Thread.currentThread().getName());
			try {
					Thread.currentThread().wait();
					
				}catch(Exception e) {
			e.getMessage();
			}
		}else {
			if(Thread.currentThread().getName().compareTo("hilo3")==0) {
				try {
					System.out.println("Despertando todos los hilos Estamos en : "+Thread.currentThread().getName()+"->"+Thread.currentThread().getState());
					Thread.currentThread().notifyAll();
					System.out.println("Estamos en el hilo -> "+Thread.currentThread()+" "+Thread.currentThread().getState());
				}catch(Exception e) {
					e.getMessage();
				}
			}
			}
	}catch(InterruptedException e) {
		e.getMessage();
	}
	System.out.println(this.modelo);
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	Coche c1 = new Coche("Fiat","punto");
	Coche c2 = new Coche ("Renault","Laguna");
	Coche c3 = new Coche ("Seat","Leon"); 
	Thread hilo1 = new Thread(c1);
	Thread hilo2 = new Thread(c2);
	Thread hilo3 = new Thread(c3);
	hilo1.setName("hilo1");
	hilo1.start();
	try {
		hilo1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	hilo2.start();
	hilo2.setName("hilo2");
	hilo3.start();
	hilo3.setName("hilo3");

	

}


}
