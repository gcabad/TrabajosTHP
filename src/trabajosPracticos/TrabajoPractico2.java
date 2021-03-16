package trabajosPracticos;

import java.util.Scanner;

public class TrabajoPractico2 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void ejercicio20() {
		System.out.println("Bienvenido, ingrese un numero:");
		double num1 = input.nextInt();
		System.out.println("Ahora ingrese un segundo numero: ");
		double num2 = input.nextInt();
		input.nextLine();
		System.out.println("Ahora ingrese la operacion a realizar:");
		String entrada = input.nextLine();
		if (entrada.equals('/') && num2 != 0) {
			System.out.println(num1/num2);
		} else if (entrada.equals('/') && num2 == 0) {
			System.out.println("ERROR");
		} else if (entrada.equals('*')) {
			System.out.println(num1*num2);
		} else if (entrada.equals('+')) {
			System.out.println(num1+num2);
		} else if (entrada.equals('-')) {
			System.out.println(num1-num2);
		} else {
			System.out.println("La opcion ingresada no es valida");
		}
		
	}
}
