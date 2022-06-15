package Ejercicio36;

public class Ejercicio1 extends Thread {
	
private String name;

public Ejercicio1(String name) {
	// TODO Auto-generated constructor stub
	super(name);
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println("Hilo :"+ this.getName());
		
		try {
			this.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Estado dentro de run : "+ this.getState());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 hilo1= new Ejercicio1("hilo1");
		hilo1.start();
		System.out.println("Estado del hilo 1: "+ hilo1.getState());
		try {
			hilo1.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Estado del hilo 1: "+hilo1.getState());
	}

}
