package Ejercicio50;

import java.util.function.BiFunction;

public class Ejercicio50 {
	
	public static void main(String[] args) {
		System.out.println("Crea una interfaz funcional que contenga un método “operacion” al que se le pasen dos números (o doubles).");
		System.out.println("\n\n************************************************************************");
		System.out.println("Crea una clase calculadora que tenga un método al que se le pasen dos enteros (o doubles) y un\r\n"
				+ "objeto tipo Arithmetic y realice la operación entre ambos valores. Crea otro método que haga\r\n"
				+ "lo mismo pero en vez de pasarle un objeto tipo Arithmetic se le pase una BiFuncional.");
		
		
		Arithmetic suma =(a, b) -> a+b ;
		System.out.println(suma.operacion(10, 20));
		
		Calculadora su = new Calculadora();
		System.out.println(su.metodoDouble1(15, 55, suma));
		
		BiFunction<Double,Double,Double> nuevo = (a,b) -> a+b;
		System.out.println(su.metodoDouble2(15, 20, nuevo));
		
	}
	

}
