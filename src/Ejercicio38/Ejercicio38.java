package Ejercicio38;

import Ejercicio38.Ejercicio38;

public class Ejercicio38 implements Runnable{
	private String name;
	public Ejercicio38(String name) {
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

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Thread hilo1 = new Thread(new Ejercicio38("hilo1"));
		Thread hilo2 = new Thread(new Ejercicio38("hilo2"));
		Thread hilo3 = new Thread(new Ejercicio38("hilo3"));
		
		hilo1.start();
		hilo1.getState();
		hilo1.join();
		hilo2.start();
		hilo2.getState();
		hilo3.start();
		hilo3.getState();

	}


	private static void join() {
		// TODO Auto-generated method stub
		
	}



}