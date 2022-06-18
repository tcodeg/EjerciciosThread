package Ejercicio48;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio48 {

	public static void main(String[] args) {
		// FUNCTION Y BIFUNCTION
		Scanner sc = new Scanner(System.in);
		System.out.println("/*****************FUNCTION PASAMOS LOCALTIME Y DEVUELVE STRING");
		
		Function<LocalTime,String> tiempo = LocalTime -> LocalTime.now().toString();
		String hora = tiempo.apply(LocalTime.now());
		System.out.println("\n"+hora);
		System.out.println("\n\n/*Crea una expresión Function que devuelva un valor aleatorio entre 1 y un valor introducido por parámetro.*/");
		System.out.println("¿Introduce ún número mayor que 1?");
		int a = sc.nextInt();
		Function<Integer,Integer> ran = Integer -> (int)(Math.random()*a)+1;
		System.out.println(ran.apply(a));
		
		sc.nextLine();
		System.out.println("\n\n/*Crea una expresión Function que reciba una cadena y la devuelva convertida en mayúsculas.*/");
		String cadena = sc.next();
		Function<String,String> conversion = String -> cadena.toUpperCase();
		System.out.println(conversion.apply(cadena));
		
		sc.nextLine();
		System.out.println("\n\n/*Crea una expresión BiFunction que reciba 2 números, que compare cual es mayor y devuelva un número al azar entre ambos*/");
		System.out.println("¿Introduce número 1?");
		int b = sc.nextInt();
		System.out.println("¿Introduce número 2?");
		int c = sc.nextInt();
		BiFunction<Integer,Integer,Integer> mayor = (l,f) -> {
			int ma = f;
			int mi = l;
			if(l>f) {
			  ma=l;
			  mi=f;
			}
			return (int)(Math.random()*(ma-mi+1)+mi); //valores entre maximo y minimos ambos incluidos
		};
		System.out.println(mayor.apply(b, c));
		
		
	}
}

