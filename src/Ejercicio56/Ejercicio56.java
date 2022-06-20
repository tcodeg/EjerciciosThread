package Ejercicio56;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Ejercicio56 {
	public static void main(String[] args) {	
	System.out.println(" Crea un Stream de nombre de personas en minúscula, usa la operación distinct() y\r\n"
			+ "muéstralo por pantalla el nombre con la primera en mayúsculas\r\n"
			+ " Añádele la operación reduce()");
	
	Stream nombres = Stream.of("tomas","juan","maria","lucia");
	Function<String,String> primeraMayus = x -> x.toUpperCase().charAt(0)+x.substring(1,x.length());
	Stream<String> nom = nombres.distinct().map(primeraMayus);
	String re = nom.reduce("",(a,b)->a+b);
	System.out.println(re);
	}
}
