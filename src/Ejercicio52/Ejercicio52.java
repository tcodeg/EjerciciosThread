package Ejercicio52;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 52:\r\n"
				+ "Crea un Stream de nombre de personas en mayúsculas, conviértelo en nombres con solo la\r\n"
				+ "primera en mayúscula (el resto en minúsculas), muéstralo por pantalla y luego mételo dentro\r\n"
				+ "de una lista.");
	
		Stream<String> nom = Stream.of("TOMAS","LUCIA","CARMEN","PEPE","LUIS");
		List<String> nueva = nom.map((y) -> y.toUpperCase().charAt(0) + y.substring(1,y.length()).toLowerCase()).peek(elemento -> System.out.println(elemento)).collect(Collectors.toList());
		System.out.println(nueva);
	}

}
