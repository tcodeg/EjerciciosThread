package Ejercicio49;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Crea un Predicate que reciba un numero y te diga si es divisible entre 2.");
		System.out.println("\n¿Introduce un número para saber si es divisible por 2?");
		Predicate<Integer> divisible = num -> num % 2 ==0;
		if(divisible.test(sc.nextInt()))
		{
			System.out.println("Es divisible");
		}else
		{
			System.out.println("No es divisible");
		}
		
		
		System.out.println("\n\nCrea un BiPredicate que te diga si dos cadenas introducidas son iguales ignorando mayúsculas/minúsculas.");
		sc.nextLine();
		System.out.println("¿Introduce primera cadena?");
		String cadena=sc.next();
		
		System.out.println("¿Introduce segunda cadena?");
		String cadena2=sc.next();
		
		BiPredicate<String,String> igual = (x,y) -> {
			return x.equalsIgnoreCase(y);
		};
		
		System.out.println("Estas dos cadenas son "); 
		System.out.println(igual.test(cadena, cadena2)?"Iguales":"Diferentes");
		
	}
}
