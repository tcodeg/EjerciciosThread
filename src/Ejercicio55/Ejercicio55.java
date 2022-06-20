package Ejercicio55;

import java.util.function.Function;
import java.util.stream.Stream;

public class Ejercicio55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crea un Stream de nombre de personas en mayúsculas, conviértelo en nombres con solo la\r\n"
				+ "primera en mayúscula (el resto en minúsculas), y usa las siguientes operaciones terminales\r\n"
				+ "(puedes inventarte tu la condición… que empiece por L, que acabe en “o”,…):\r\n"
				+ " anyMatch\r\n"
				+ " noneMatch\r\n"
				+ " allMatch");
		Stream<String> personas = Stream.of("TOMAS","MARIA","LUCIA","JUAN","JULIA","MANUEL");
		Function <String,String> primeraMayus = x->x.toUpperCase().charAt(0)+x.substring(1,x.length()).toLowerCase();
		//System.out.println(personas.map(primeraMayus).anyMatch(y->y.startsWith("M"))); //RESULTADO TRUE SI HAY ALGUIEN QUE EMPIEZE POR M.
		//System.out.println(personas.map(primeraMayus).noneMatch(y->y.startsWith("M"))); //FALSE SI NO HAY NADIE QUE EMPIEZE POR M
		System.out.println(personas.map(primeraMayus).allMatch(y->y.startsWith("Juan")));
		
	}

}
