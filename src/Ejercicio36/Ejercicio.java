package Ejercicio36;

import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio implements Runnable{
	
		private String name;

		public Ejercicio(String name) {
			// TODO Auto-generated constructor stub
			super();
			this.name=name;
		}

		public void run() {
			int valorEntero = ThreadLocalRandom.current().nextInt(3600,8000);
			
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				System.out.println("Este es el thread "+this.name);
			}
//			try {
//				Thread.sleep(valorEntero); //dormimos el hilo con un número aleatorio.
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//System.out.println("Hilo "+this.name+" "+Thread.currentThread().getState());
			
			if(Thread.currentThread().isAlive()==true) {
				System.out.println("Hilo1 NO finalizado ESTA VIVO.");
			};

			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getState()); //main principal
		Thread hilo1 = new Thread(new Ejercicio("hilo1"));
		hilo1.start();
		System.out.println("HILO 1 ANTES DEL TRY :"+hilo1.getState());
		try {
			Thread.sleep(6000);
			System.out.println("HILO 1: "+hilo1.getState());//hilo 1 terminado
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HILO PRINCIPAL "+Thread.currentThread().getState().TERMINATED); //main terminado.
	}

}
