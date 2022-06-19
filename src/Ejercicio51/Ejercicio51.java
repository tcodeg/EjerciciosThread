package Ejercicio51;

import java.util.stream.Stream;

public class Ejercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crea un Stream de nombres de personas y muestra sus datos por consola (en 2 líneas de código)");
		
		Stream<String> nombres = Stream.of("Tomás","Juan","Lucia","Antonio","Maria");
		nombres.forEach(System.out::println);

	}

}
