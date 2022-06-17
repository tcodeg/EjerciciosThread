package Ejercicio46;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class Ejercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("***************EJEMPLO CONSUMER*****************");		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(1);
		num.add(15);
		num.add(13);
		//accion a realizar por elemento de lista.
		Consumer<Integer> lista = (x) -> {
			System.out.println(x);
		};
		
		num.forEach(lista);
System.out.println("************** EJEMPLO BICONSUMER *************");
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "primero");
		map.put(2, "segundo");
		map.put(3, "tercero");
		
		BiConsumer<Integer,String> lista2 = (x,y) -> {
			System.out.println("key "+x+ " value "+y);
		};
		
		map.forEach(lista2);
	}

}
