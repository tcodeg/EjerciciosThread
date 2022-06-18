package Ejercicio48;

import java.time.LocalTime;
import java.util.function.Function;

public class Ejercicio48 {

	public static void main(String[] args) {
		// FUNCTION Y BIFUNCTION
		
		System.out.println("/*****************FUNCTION PASAMOS LOCALTIME Y DEVUELVE STRING");
		
		Function<LocalTime,String> tiempo = LocalTime -> LocalTime.now().toString();
		String hora = tiempo.apply(LocalTime.now());
		System.out.println("\n"+hora);
		System.out.println("\n\n/*Crea una expresión Function que devuelva un valor aleatorio entre 1 y un valor introducido por parámetro.*/");
		
		System.out.println("\n\n/*Crea una expresión Function que reciba una cadena y la devuelva convertida en mayúsculas.*/");
		
		
	}
}

