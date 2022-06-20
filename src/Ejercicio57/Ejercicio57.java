package Ejercicio57;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio57 {
public static void main(String[] args) {
	System.out.println("Crea un Stream de int y añádele una operación que sume sus valores\r\n"
			+ " Crea un IntStream con números entre el 1 y el 50\r\n"
			+ " A partir de IntStream anterior, crea un IntStream con número aleatorios entre el valor y\r\n"
			+ "el valor + 50.\r\n"
			+ " Con el IntStream resultado, muestra por pantalla algunas de sus estadísticas (máximo\r\n"
			+ "valor, mínimo, sumatorio, contar, media,….)");
	
	Stream<Integer> vaInt = Stream.of(1,2,3,4,5,6,7);
	int suma = vaInt.reduce(0, Integer::sum);
	System.out.println(suma);
	
	IntStream valor = IntStream.range(1,51);
	IntStream nueva = valor.map(i->(int)(Math.random()*((51-1)+1))+1).peek(System.out::println);
	
	//System.out.println(nueva.min().getAsInt());
	
	IntSummaryStatistics estadis = nueva.summaryStatistics();
	System.out.println("Maximo "+estadis.getMax());
	System.out.println("Minimo "+estadis.getMin());
	System.out.println("Suma "+estadis.getSum());
	System.out.println("Count "+estadis.getCount());
	System.out.println("Average "+estadis.getAverage());
	}

}
