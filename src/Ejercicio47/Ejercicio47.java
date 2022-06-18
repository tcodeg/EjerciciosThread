package Ejercicio47;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaJava8 nueva = new PersonaJava8("Tomas","Gil");
		System.out.println(nueva.toString());
		System.out.println("*********************BICONSUME SETNAME******************");
		
		BiConsumer<PersonaJava8, String> setN = (p,n) -> {
			p.setNombre(n);
		};
		
		setN.accept(nueva, "Pepe");
		System.out.println(nueva);
		
		System.out.println("*********** SUPPLIER NUMERO ALEATORIO ****************");
		
		Supplier<Integer> num = () -> (int)(Math.random()*10+1);
		System.out.println(num.get());
		
		System.out.println("*********** SUPPLIER OBTENER NOMBRE ****************");
		Supplier<String> nombre = () -> nueva.getNombre();
		System.out.println(nombre.get());
		
		
		System.out.println("*********** SUPPLIER CAMBIAR NOMBRE ****************");
		Supplier<PersonaJava8> sup = () -> {
			PersonaJava8 segunda = new PersonaJava8("Lucia","Sanchez");
			return segunda;
		};
		System.out.println(sup.get());
		PersonaJava8 inter = sup.get();
		
		setN.accept(inter, "Francisco");
		
		System.out.println("\n/****************Nombre cambiado*****************/");
		System.out.println(inter.toString());
		
		//Supplier<PersonaJava8> sun = PersonaJava8::new; //no tiene que tener el constructor parametros.
		
		
	}
	

	
}
