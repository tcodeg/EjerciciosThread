package Ejercicio59;

import java.util.stream.Stream;

public class Ejercicio59 {
public static void main(String[] args) {
	System.out.println("Con un Stream de nombres y usando la operación flatMap devuelve el nombre en\r\n"
			+ "mayúsculas si el nombre empieza por A y devuelve el nombre en minúsculas si empieza\r\n"
			+ "por T (por ejemplo, lo puedes adaptar a tu ejemplo)");
	//flatMat siempre devuelve Stream
	Stream nombres = Stream.of("tomas","pepe","alicia","angel","julian");
}
}
