package Ejercicio54;

import java.util.function.Function;
import java.util.stream.Stream;

public class Ejercicio54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Crea un Stream de nombre de personas en mayúsculas, conviértelo en nombres con solo la\r\n"
				+ "primera en mayúscula (el resto en minúsculas), y muestra por pantalla, sólo los nombres que\r\n"
				+ "empiecen por J.");
		Function<String,String> primeraMayus = x-> x.toUpperCase().charAt(0)+x.substring(1,x.length()).toLowerCase();
		Stream<String> personas = Stream.of("TOMAS","JUAN","MARIA","LUCIA","JULIA");
		personas.map(primeraMayus).filter(t->t.startsWith("J")).forEach(System.out::println);
	}

}
