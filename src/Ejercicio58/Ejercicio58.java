package Ejercicio58;

import java.util.stream.Stream;

public class Ejercicio58 {
public static void main(String[] args) {
	System.out.println(" Crea un Stream de nombres y obtén un IntStream con la longitud de cada uno de ellos\r\n"
			+ " Crea un IntSummaryStatistics para obtener las estadística (máximo valor, mínimo,\r\n"
			+ "sumatorio, contar, media,….)");
	
	Stream personas = Stream.of("Tomas","Juan","Melody","Jose Ramón");
	personas.mapToInt(y -> y.lenght())
}
}
