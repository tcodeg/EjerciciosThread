package Ejercicio53;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio53 {
	public static void main(String[] args) {	
	
		System.out.println("Crea un Stream de nombre de personas en minúscula, conviértelo en nombres con solo la\r\n"
				+ "primera en minúscula , muéstralo por pantalla , luego haz a la inversa (primera mayúscula y las\r\n"
				+ "siguientes minúsculas), muéstralo por pantalla y luego mételo dentro de una lista.");
		Stream<String> personas = Stream.of("tomas","lucia","maria","juan");
		
		Function<String,String> primeraMinus = y->y.toLowerCase().charAt(0) + y.substring(1,y.length()).toUpperCase();
		Function<String,String> primeraMayus = x->x.toUpperCase().charAt(0) + x.substring(1,x.length()).toLowerCase();
		
		 List<String> resultados = personas.map(primeraMinus).peek(System.out::println).map(primeraMayus).peek(System.out::println).collect(Collectors.toList());
		 System.out.println(resultados);
		
	}
}
