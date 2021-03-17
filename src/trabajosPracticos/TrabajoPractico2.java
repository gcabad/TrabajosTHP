package trabajosPracticos;

import java.util.Scanner;

public class TrabajoPractico2 {

	private static Scanner input = new Scanner(System.in);

	/*
	 * 11 - Realizá un programa que permita ingresar un número entero e indique si
	 * se trata de un número par o impar. [EC]
	 */

	public static void ejercicio11() {
		System.out.println("Ingrese un numero entero:");
		int numero = input.nextInt();
		if (numero == 0) {
			System.out.println("El numero ingresado es el 0.");
		} else if (numero % 2 == 0) {
			System.out.println("El numero ingresado es par.");
		} else {
			System.out.println("El numero ingresado es impar");
		}
	}

	/*
	 * 12 - Realizá un programa que permita ingresar dos números enteros e indique
	 * cuál de ellos es el mayor. [EC]
	 */

	public static void ejercicio12() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora el segundo numero entero:");
		int numero2 = input.nextInt();
		if (numero1 > numero2) {
			System.out.println("El numero mas grande es el primero.");
		} else if (numero1 < numero2) {
			System.out.println("El numero mas grande es el segundo.");
		} else {
			System.out.println("Los numeros son iguales.");
		}
	}

	/*
	 * 13 - Realizá un programa para ingresar tres números enteros e indique cuál de
	 * ellos es el mayor y su valor. [EC]
	 */

	public static void ejercicio13() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora el segundo numero entero:");
		int numero2 = input.nextInt();
		if (numero1 > numero2) {
			System.out.println("El numero mas grande es: " + numero1 + ".");
		} else if (numero1 < numero2) {
			System.out.println("El numero mas grande es: " + numero2 + ".");
		} else {
			System.out.println("Los numeros son iguales.");
		}
	}

	/*
	 * 14 - Para entrar a la montaña rusa Infierno en las alturas se requiere tener
	 * al menos 7 años y medir más de 1,50 metros. Completá el siguiente cuadro a
	 * mano según los requisitos y luego haz el programa que permita, según las
	 * edades y estaturas ingresadas por el usuario, obtener los mismos resultados
	 * según los siguientes datos: [EC]
	 * 
	 *   NOMBRE | EDAD | ALTURA | ¿Entra al juego? (V/F) |
	 *   Juan   | 5    |  1.45  |            F           |
	 *   Maria  | 7    |  1.23  |            F           |
	 *   Luis   | 8    |  1.51  |            V           |
	 *   Ana    | 9    |  1.39  |            F           |
	 */

	public static void ejercicio14() {
		System.out.println("Por favor, ingrese el nombre de la persona:");
		String nombre = input.nextLine();
		System.out.println("Ingrese ahora la edad de la persona:");
		int edad = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora la altura correspondiente:");
		double altura = input.nextDouble();
		if (edad >= 7 && altura > 1.50) {
			System.out.println("Autorizado " + nombre + " a ingresar a la montaña rusa.");
		} else {
			System.out.println("El ingreso de " + nombre + " no está autorizado.");
		}
	}

	/*
	 * 15.Para entrar a la montaña rusa Miedo a las alturas, algo más chica y
	 * tranquila que la anterior, alcanza con que se cumpla solamente una de las
	 * siguientes condiciones: ser mayor de 6 años o medir más de 1,50 metros.
	 * Realizá el mismo procedimiento que con el ejercicio anterior pero con los
	 * nuevos requisitos. [EC]
	 * 
	 *   NOMBRE | EDAD | ALTURA | ¿Entra al juego? (V/F) |
	 *   Juan   | 5    |  1.45  |            F           |
	 *   Maria  | 7    |  1.23  |            V           |
	 *   Luis   | 8    |  1.51  |            V           |
	 *   Ana    | 9    |  1.39  |            V           |
	 */
	
	public static void ejercicio15() {
		System.out.println("Por favor, ingrese el nombre de la persona:");
		String nombre = input.nextLine();
		System.out.println("Ingrese ahora la edad de la persona:");
		int edad = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora la altura correspondiente:");
		double altura = input.nextDouble();
		if (edad > 6 || altura > 1.50) {
			System.out.println("Autorizado " + nombre + " a ingresar a la montaña rusa.");
		} else {
			System.out.println("El ingreso de " + nombre + " no está autorizado.");
		}
	}

	/*
	 * 16.Realizá un programa que permita ingresar la cantidad de inscriptos a una
	 * conferencia y la cantidad de asientos disponibles en el auditorio. Debes
	 * indicar si alcanzan los asientos, Si los asientos no alcanzaran indicar
	 * cuántos faltan para que todos los inscriptos puedan sentarse.
	 * 
	 */

	public static void ejercicio16() {
		System.out.println("Ingrese la cantidad de personas inscriptas a la conferencia:");
		int inscriptos = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese la cantidad de asientos disponibles en la conferencia:");
		int asientosDisponibles = input.nextInt();
		if(asientosDisponibles >= inscriptos) {
			System.out.println("Los asientos alcanzan. Sobran: " + (asientosDisponibles - inscriptos) + " asientos.");
		} else {
			System.out.println("Los asientos no alcanzan. Se necesitan: " + (inscriptos - asientosDisponibles) + " asientos mas.");
		}
	}
	
	/*
	 * 17.Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y
	 * un género ('F' para mujeres, 'M' para hombres). En caso de haber ingresado
	 * valores erróneos (edad fuera de rango o género inválido), informar tal
	 * situación. Si los datos están bien ingresados el programa debe indicar,
	 * sabiendo que las mujeres se jubilan con 60 años o más y los hombres con 65
	 * años o más, si la persona está en edad de jubilarse.
	 */
	
	public static void ejercicio17() {
		System.out.println("Bienvenido, por favor ingrese su edad:");
		int edad = input.nextInt();
		input.nextLine();
		System.out.println("Ahora ingrese su genero, ingresando 'F' para Femenino y 'M' para Masculino.");
		String genero = input.nextLine();
		if (edad < 1 && edad > 120) {
			System.out.println("La edad ingresada es invalida");
		} else if (!genero.equals("F") && !genero.equals("M")) {
			System.out.println("El genero ingresado es invalido");
		} else if ((genero.equals("F") && edad >= 60)||(genero.equals("M") && edad >=65)){
			System.out.println("Usted se puede jubilar.");
		} else {
			System.out.println("Usted no se encuentra en edad de jubilación.");
		}
	}
	
	/*
	 * 18.Realizá un programa que permita al usuario ingresar dos números enteros.
	 * La computadora debe indicar si el mayor es divisible por el menor. (Un número
	 * entero a es divisible por un número entero b cuando el resto de la división
	 * entre a y b es 0.
	 * 
	 */
	
	public static void ejercicio18() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Por favor, ingrese otro numero entero:");
		int numero2 = input.nextInt();
		if (numero1 > numero2) {
			if (numero2 == 0) {
				System.out.println("ERROR: No se puede dividir por 0.");
			} else if (numero1 % numero2 == 0) {
				System.out.println("El numero " + numero1 + " es divisible por " + numero2 + ".");
			} else {
				System.out.println("El numero " + numero1 + " no es divisible por " + numero2 + ".");
			}
		} else if (numero1 < numero2) {
			if (numero1 == 0) {
				System.out.println("ERROR: no se puede dividir por 0.");
			}else if (numero2 % numero1 == 0) {
				System.out.println("El numero " + numero2 + " es divisible por " + numero1 + ".");
			} else {
				System.out.println("El numero " + numero2 + " no es divisible por " + numero1 + ".");
			}
		} else if (numero1 == 0 && numero2 == 0) {
			System.out.println("ERROR: Ambos numeros valen 0.");
		} else {
			System.out.println("Los numeros son iguales, por ende son divisibles entre si.");
		}
	}
	
	/*
	 * 19.Existen dos reglas que identifican dos conjuntos de valores:
	 *  
	 * a. El número es de un solo dígito.
	 * b. El número es impar. 
	 * 
	 * A partir de estas reglas,realizá un programa que permita ingresar un número entero. Debe asignar el
	 * valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
	 * estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, según corresponda,
	 * para indicar si el valor número ingresado pertenece o no a cada conjunto.
	 * Definí un lote de prueba de varios números y probá el algoritmo, escribiendo
	 * los resultados tal como se hizo en los ejercicios anteriores.
	 */
	
	public static void ejercicio19() {
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		
		System.out.println("Ingrese un numero entero:");
		int numero = input.nextInt();
		if (numero >= 0 && numero <= 9) {
			esDeUnSoloDigito = true;
		}
		if (numero % 2 != 0) {
			esImpar = true;
		}
		if (esDeUnSoloDigito && esImpar) {
			estaEnAmbos = true;
		} else if (!esDeUnSoloDigito && !esImpar) {
			noEstaEnNinguno = true;
		}
		System.out.println("El resultado es el siguinte: \n Es de un solo digito? " + esDeUnSoloDigito  
				+ "\n Es impar? " + esImpar 
				+ "\n Esta en ambas categorias? " + estaEnAmbos 
				+ "\n No esta en ninguna categoria? " + noEstaEnNinguno);
		
	}

	/*
	 * 20.Realizá un programa que permita ingresar dos números enteros y la
	 * operación a realizar ('+', '-', '*', '/'). Debe mostrarse el resultado para
	 * la operación ingresada. Considerar que no se puede dividir por cero (en ese
	 * caso mostrar el texto 'ERROR'). [EC]
	 */
	
	public static void ejercicio20() {
		System.out.println("Bienvenido, ingrese un numero:");
		double num1 = input.nextInt();
		System.out.println("Ahora ingrese un segundo numero: ");
		double num2 = input.nextInt();
		input.nextLine();
		System.out.println("Ahora ingrese la operacion a realizar:");
		String entrada = input.nextLine();
		if (entrada.equals("/") && num2 != 0) {
			System.out.println(num1 / num2);
		} else if (entrada.equals("/") && num2 == 0) {
			System.out.println("ERROR");
		} else if (entrada.equals("*")) {
			System.out.println(num1 * num2);
		} else if (entrada.equals("+")) {
			System.out.println(num1 + num2);
		} else if (entrada.equals("-")) {
			System.out.println(num1 - num2);
		} else {
			System.out.println("La opcion ingresada no es valida");
		}

	}
	
	/*
	 * 21.Realizá un programa que permita al usuario ingresar un número entero entre
	 * 1 y 7. Debe mostrarse por pantalla el nombre del día de la semana que
	 * representa tal número tomando como el primer día de la semana el Domingo. De
	 * ingresar un número fuera de rango debe mostrar error.
	 */
	
	public static void ejercicio21() {
		System.out.println("Ingrese un numero del 1 al 7 inclusive.");
		int dia = input.nextInt();
		String resultado = "";
		input.nextLine();
		switch (dia) {
		case 1:
			resultado = "Domingo";
			break;
		case 2:
			resultado = "Lunes";
			break;
		case 3:
			resultado = "Martes";
			break;
		case 4:
			resultado = "Miercoles";
			break;
		case 5:
			resultado = "Jueves";
			break;
		case 6:
			resultado = "Viernes";
			break;
		case 7:
			resultado = "Sabado";
			break;
		default:
			resultado = "El dia ingresado no es valido";
		}
		System.out.println(resultado);
	}
	

	public static void main(String[] args) {
		System.out.println("Bienvenido al TP2:\nPor favor, ingrese el numero de ejercicio que quiere correr. \n"
				+ "Recuerde que el TP2 incluye los ejercicios 11 a 21 inclusive."
				+ " Si desea salir, escriba 'salir' o 'exit'.");
		String resultado = input.nextLine();
		if (resultado.equals("11")) {
			ejercicio11();
		} else if (resultado.equals("12")) {
			ejercicio12();
		} else if (resultado.equals("13")) {
			ejercicio13();
		} else if (resultado.equals("14")) {
			ejercicio14();
		} else if (resultado.equals("15")) {
			ejercicio15();
		} else if (resultado.equals("16")) {
			ejercicio16();
		} else if (resultado.equals("17")) {
			ejercicio17();
		} else if (resultado.equals("18")) {
			ejercicio18();
		} else if (resultado.equals("19")) {
			ejercicio19();
		} else if (resultado.equals("20")) {
			ejercicio20();
		} else if (resultado.equals("21")) {
			ejercicio21();
		} else if (resultado.equals("salir") || resultado.equals("exit")) {
			System.exit(0);
		} else {
			System.out.println("La opcion ingresada no es valida.");
		}
	}
}