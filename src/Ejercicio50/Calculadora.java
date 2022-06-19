package Ejercicio50;

import java.util.function.BiFunction;

public class Calculadora {

public Calculadora() {
	
}
	public double metodoDouble1(double x, double y,Arithmetic calcula) {
		return calcula.operacion(x, y);
	}

	public double metodoDouble2(double x, double y,BiFunction<Double, Double, Double> cal) {
		return (double) cal.apply(x, y);
	}

}
