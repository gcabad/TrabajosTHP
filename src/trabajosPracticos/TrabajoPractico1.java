package trabajosPracticos;

import java.util.Scanner;

public class TrabajoPractico1 {

	private static Scanner input = new Scanner(System.in);

	public static void ejercicio1() {
		System.out.println("Bienvenido! Por favor, ingrese su nombre:");
		String nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre + "!");
	}

	public static void ejercicio2() {
		System.out.println("Bienvenido! Por favor, ingrese la nota correspondiente al primer trimestre:");
		int nota = input.nextInt();
		System.out.println("Ingrese ahora la nota correspondiente al segundo trimestre:");
		nota += input.nextInt();
		System.out.println("Ingrese ahora la nota correspondiente al tercer trimestre:");
		nota += input.nextInt();
		System.out.println("La nota promedio del alumno es: " + nota / 3 + ".");
	}

	private static void ejercicio3() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero = input.nextInt();
		System.out.println("Si multiplicamos ese numero por 5 nos da: " + numero * 5 + ".\n"
				+ "si lo dividimos por 2 nos da: " + numero / 2 + ".");
	}

	private static void ejercicio4() {
		System.out.println("Por favor, ingrese el valor de la hora:");
		int valorHora = input.nextInt();
		System.out.println("Ahora intrduzca la cantidad de horas que trabaja en un dia normal:");
		int cantHoras = input.nextInt();
		System.out.println("El valor del salario semanal es de: $"
				+ ((valorHora * cantHoras * 5) + (valorHora * cantHoras / 2)) + ".");
	}

	private static void ejercicio5() {
		System.out.println("Por favor, ingrese un numero: ");
		int num1 = input.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int num2 = input.nextInt();
		System.out.println("El primer numero ingresado es: " + num1 + " y el segundo numero es: " + num2 + ".");
		int auxNum = num1;
		num1 = num2;
		num2 = auxNum;
		System.out.println("Los valores han sido intercambiados. \nEl primer numero ahora es: " + num1
				+ " y el segundo es " + num2 + ".");
	}

	private static void ejercicio6() {
		System.out.println("Por favor, ingrese el monto total correspondiente a las ventas realizadas en el mes:");
		double montoVentas = input.nextDouble();
		System.out.println("El monto a cobrar por el vendedor es de $" + (44000 + (montoVentas * 0.16)) + ".");
	}

	private static void ejercicio7() {
		System.out.println("Ingrese el ancho correspondiente al terreno:");
		int ancho = input.nextInt();
		System.out.println("Ingrese el largo correspondiente al terreno:");
		int largo = input.nextInt();
		System.out.println("Ingrese el monto correspondiente al metro cuadrado:");
		double valorMt2 = input.nextDouble();
		System.out.println("El valor total del terreno es: $" + ancho * largo * valorMt2 + ". "
				+ "Para poder cercarlo a tres alturas distintas son necesarios " + ((ancho * 2) + (largo * 2)) * 3
				+ " metros de alambre.");

	}

	private static void ejercicio8() {
		System.out.println("Bienvenido, ingrese por favor un numero natural:");
		int num1 = input.nextInt();
		System.out.println("Ahora ingrese un segundo numero natural: ");
		int num2 = input.nextInt();
		System.out.println("Los resultados de las cuatro operaciones matematicas basicas son: \n" + "Suma = "
				+ (num1 + num2) + "\nResta = " + (num1 - num2) + "\nDivision = " + (num1 / num2) + "\nMultiplicacion = "
				+ (num1 * num2) + ".");
	}

	private static void ejercicio9() {
		System.out.println("Por favor, ingrese la medida del primer angulo: ");
		int angulo1 = input.nextInt();
		System.out.println("Ingrese ahora la medida del segundo angulo: ");
		int angulo2 = input.nextInt();
		System.out.println(
				"Para formar un triangulo, el tercer angulo debería medir " + (180 - (angulo1 + angulo2)) + " grados.");
	}

	private static void ejercicio10() {
		System.out.println("Ingrese el nombre del socio 1:");
		String nombreSocio1 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		int capitalSocio1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora el nombre del socio 2:");
		String nombreSocio2 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		int capitalSocio2 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese el nombre del socio 3:");
		String nombreSocio3 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		int capitalSocio3 = input.nextInt();
		int capitalTotal = capitalSocio1 + capitalSocio2 + capitalSocio3;
		System.out.println("El total del capital aportado por los socios es de: " + capitalTotal + ".\n"
				+ "El porcentaje aportado por cada socio es el siguiente: \n" + "El socio " + nombreSocio1
				+ " aportó un " + (capitalSocio1 * 100 / capitalTotal) + "%.\n" + "El socio " + nombreSocio2
				+ " aportó un " + (capitalSocio2 * 100 / capitalTotal) + "%.\n" + "El socio " + nombreSocio3
				+ " aportó un " + (capitalSocio3 * 100 / capitalTotal) + "%.\n");

	}

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
		ejercicio9();
		ejercicio10();
	}

}
