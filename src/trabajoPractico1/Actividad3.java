package trabajoPractico1;

import java.util.Scanner;

public class Actividad3 {

	private static Scanner input = new Scanner(System.in);
	/*
	 * 22.Realiz� un programa que muestre todos los n�meros enteros del 1 al 5, y
	 * luego los mismos n�meros pero en orden inverso. [EC]
	 * 
	 */

	public static void ejercicio22() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	/*
	 * 23.Realiz� un programa que permita ingresar un n�mero entero n. Debe mostrar
	 * los primeros 10 m�ltiplos de n (desde 1 x n).
	 */

	public static void ejercicio23() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero = input.nextInt();
		input.nextLine();
		for (int i = 1; i < 11; i++) {
			System.out.println(numero * i);
		}

	}

	/*
	 * 24.Realiz� un programa que permita al usuario ingresar dos n�meros enteros
	 * num1 y num2, donde el primero siempre deber� ser menor o igual al segundo. La
	 * computadora debe mostrar la secuencia de n�meros existentes entre ambos: a.
	 * Incluy�ndolos; b. Excluy�ndolos.
	 * 
	 */

	public static void ejercicio24() {

		System.out.println("Ingrese un numero entero:");
		int numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese otro numero entero:");
		int numero2 = input.nextInt();
		while (numero2 < numero1) {
			input.nextLine();
			System.out.println("El numero ingresado es invalido. Debe ser mayor o igual a: " + numero1
					+ ".\nPor favor, ingrese un numero valido:");
			numero2 = input.nextInt();
		}
		System.out.println("Se imprimen los numeros entre " + numero1 + " y " + numero2 + " incluyendolos.");
		for (int i = numero1; i <= numero2; i++) {
			System.out.println(i);
		}
		System.out.println("Se imprimen los numeros entre " + numero1 + " y " + numero2 + " excluyendolos.");
		for (int i = numero1 + 1; i < numero2; i++) {
			System.out.println(i);
		}
	}

	/*
	 * 25.Realiz� un programa que permita ingresar dos n�meros enteros que
	 * representen el ancho y el alto de una matriz de cruces. El programa debe
	 * dibujar dicha matriz.
	 */

	public static void ejercicio25() {
		System.out.println("Por favor, ingrese un numero entero:");
		int x = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese ahora otro numero entero:");
		int y = input.nextInt();
		input.nextLine();
		String resultado = "";
		for (int i = 0; i < x; i++) {
			String linea = " |";
			String divisor = "";
			for (int j = 0; j < y; j++) {
				linea += "x|";
				divisor += "---";
			}
			resultado += divisor + "\n" + linea + "\n";
			if (i == x - 1) {
				resultado += divisor;
			}
		}
		System.out.println(resultado);
	}

	/*
	 * 26.Realiz� un programa que permita al usuario ingresar un n�mero natural n.
	 * La computadora debe mostrar los primeros n m�ltiplos de 3 excepto aquellos
	 * que sean a la vez m�ltiplos de 5.
	 */
	public static void ejercicio26() {
		System.out.println("Ingrese un numero natural:");
		int multiplos = input.nextInt();
		System.out.println(
				"Los primeros " + multiplos + " multiplos del 3 sin inlcuir aquellos que lo son tambien del 5, son:");
		for (int i = 2; i < multiplos + 2; i++) {
			int salida = 3 * i;
			if ((salida) % 5 != 0) {
				System.out.println(salida);
			}
		}
	}

	/*
	 * 27.Realiz� un programa que permita ingresar 5 edades. Calcular y mostrar el
	 * promedio de todas las edades ingresadas y cu�ntas edades fueron valores
	 * impares mayores que 18. [EC]
	 */
	public static void ejercicio27() {
		System.out
				.println("Por favor, ingrese 5 edades separadas por comas y sin espacios. \nPOR EJEMPLO: 3,29,48,2,17");
		String edades = input.nextLine();
		String[] partes = edades.split(",");
		double promedio = 0;
		int mayoresEimpares = 0;
		for (String linea : partes) {
			int numeroActual = Integer.parseInt(linea);
			promedio += numeroActual;
			if (numeroActual > 18 && numeroActual % 2 != 0) {
				mayoresEimpares++;
			}
		}
		System.out.println("El promedio de edades es: " + (promedio / 5)
				+ " y la cantidad de edades impares mayores a 18 es de " + mayoresEimpares + ".");

	}
	/*
	 * 28.Realiz� un programa que a partir de un n�mero entero cant ingresado por el
	 * usuario permita cargar por teclado cant n�meros enteros. La computadora debe
	 * mostrar cu�l fue el mayor n�mero y en qu� posici�n apareci�.
	 */

	public static void ejercicio28() {
		System.out.println("Ingrese la cantidad de numeros que le gustaria que el sistema procese:");
		int cant = input.nextInt();
		input.nextLine();
		if (cant == 0) {
			System.out.println("La cantidad ingresada es 0. Fin del programa.");
		} else {
			int mayor = 0;
			String resultado = "";
			for (int i = 1; i <= cant; i++) {
				System.out.println("Numeros restantes: " + (cant - i + 1) + ".\nIngrese un numero:");
				int numActual = input.nextInt();
				if (i == 0) {
					mayor = numActual;
				} else {
					if (numActual > mayor) {
						mayor = numActual;
						resultado = "El numero mas grande fue " + mayor + " y se encontraba en la posici�n: " + i + ".";
					}
				}
			}
			System.out.println(resultado);
		}
	}

	/*
	 * 29.Realiz� un programa que permita validar la nota de un examen. Se espera
	 * que la nota que el usuario ingrese sea un n�mero comprendido entre 0 y 10. La
	 * misma debe ser ingresada tantas veces como sea necesario hasta que quede
	 * comprendida dentro del rango indicado. [EC]
	 */

	public static void ejercicio29() {
		System.out.println(
				"Por favor, ingrese la nota. Recuerde que la misma debe estar comprendida en el rango de 0 a 10 inclusive.");
		int nota = input.nextInt();
		while (nota > 10 || nota < 0) {
			input.nextLine();
			System.out.println("La nota ingresada no es valida. Por favor, ingrese una nota entre 0 y 10 inclusive.");
			nota = input.nextInt();
		}
		System.out.println("Nota aceptada.");
	}

	/*
	 * 30.Realiz� un programa que permita realizar varias operaciones matem�ticas
	 * ingresando un caracter por cada una la operaci�n a realizar (�+�, �-�, �*�,
	 * �/�, �F�) y dos n�meros enteros en el caso que no haya elegido �F�. La
	 * computadora debe mostrar el resultado para la operaci�n ingresada. Considerar
	 * que no se puede dividir por cero. Cuando la operaci�n ingresada sea �F� nos
	 * indicar� que no se desean calcular m�s operaciones. [EC]
	 */

	public static void ejercicio30() {
		System.out.println("Por favor, indique la operaci�n que desea realizar:\n"
				+ "- Ingrese '+' para sumar.\n"
				+ "- Ingrese '-' para restar.\n"
				+ "- Ingrese '*' para multiplicar.\n"
				+ "- Ingrese '/' para dividir.\n"
				+ "- Ingrese 'F' si desea finalizar la ejecuci�n del programa.");
		String operacion = input.nextLine();
		while(!operacion.equals("F")) {
			System.out.println("Ingrese ahora por favor un numero entero:");
			int numero1 = input.nextInt();
			input.nextLine();
			System.out.println("Ingrese ahora el segundo numero entero:");
			int numero2 = input.nextInt();
			input.nextLine();
			if(operacion.equals("/") && numero2 == 0) {
				System.out.println("No se puede dividir por cero!");
			} else {
				switch(operacion) {
				case "+": System.out.println("El resultado de sumar los dos numeros es: " + (numero1+numero2) + ".");
				break;
				case "-": System.out.println("El resultado de restar los dos numeros es: " + (numero1-numero2) + ".");
				break;
				case "/": System.out.println("El resultado de dividir los dos numeros es: " + (numero1/numero2) + ".");
				break;
				case "*": System.out.println("El resultado de multiplicar los dos numeros es: " + (numero1*numero2) + ".");
				break;
				default: System.out.println("Ingreso una operacion que no es valida. Recuerde:\n"
						+ "- Ingrese '+' para sumar.\n"
						+ "- Ingrese '-' para restar.\n"
						+ "- Ingrese '*' para multiplicar.\n"
						+ "- Ingrese '/' para dividir.\n"
						+ "- Ingrese 'F' si desea finalizar la ejecuci�n del programa.");
				}
			}
			System.out.println("Por favor, indique la operaci�n que desea realizar ahora:\n");
			operacion = input.nextLine();
		}
	}

	/*
	 * 31.Realiz� un programa que permita validar una opci�n ingresada. Se le
	 * preguntar� al usuario si desea continuar con alguna operaci�n de la forma
	 * "�Dese�s continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una
	 * 'N' (incluir las min�sculas). La opci�n debe ser ingresada tanto como sea
	 * necesario hasta que quede comprendida dentro de las posibilidades esperadas.
	 * Realiz� este ejercicio en dos versiones (A y B): con ciclo while y con ciclo
	 * do-while.
	 */
	public static void ejercicio31() {

	}

	/*
	 * 32.Realiz� un programa que permita validar la nota de un examen de la misma
	 * manera que el ejercicio 28 pero con las siguientes nuevas directivas: Las
	 * notas 1 y 3 no usan nunca. La nota 0 se reserva para los ausentes En resumen,
	 * las notas v�lidas pueden ser un 2 o un valor entre 4 y 10. [EC]
	 */
	public static void ejercicio32() {

	}

	/*
	 * 33.Realiz� un programa que permita al usuario ingresar n�meros hasta que se
	 * introduzca un 0. La computadora debe mostrar el n�mero m�ximo y el n�mero
	 * m�nimo. [EC]
	 */

	public static void ejercicio33() {

	}

	/*
	 * 34.Realiz� un programa que permita ingresar la estatura (en metros con
	 * decimales) de cada jugador de un equipo de baloncesto. La carga finalizar� al
	 * ingresar cero. Calcular y mostrar la estatura promedio del equipo.
	 */
	public static void ejercicio34() {

	}

	/*
	 * 35.Realiz� un programa que permita ingresar nombre y edad de un grupo de
	 * personas (para cada una, nombre y edad). La carga termina cuando en el nombre
	 * de la persona se ingresa un asterisco ('*'). Mostrar al final c�mo se llama
	 * la persona m�s joven.
	 */

	public static void ejercicio35() {

	}

	/*
	 * 36.Realiz� un programa que permita ingresar n�meros mientras el promedio
	 * entre todos los ingresados sea menor a 20. Al terminar el ingreso indicar la
	 * cantidad de valores le�dos. [EC]
	 * 
	 * 
	 */

	public static void ejercicio36() {

	}

	/*
	 * 37.Realiz� un programa que permita al usuario ingresar hasta 12 valores, de a
	 * uno por vez, que representan los sueldos mensuales que percibi� un empleado
	 * durante un a�o calendario. Si durante la carga de los sueldos mensuales se
	 * detecta un valor negativo, esto indica que a�n no se ha cobrado el mes en
	 * curso, y en ese caso se debe dejar de ingresar datos. Al finalizar mostrar el
	 * monto percibido por el empleado hasta ese momento (total o parcial).
	 */

	public static void ejercicio37() {

	}

	/*
	 * 38.Realiz� un programa que permita controlar con validaci�n el ingreso a un
	 * sitio web. Teniendo ya precargados un nombre de usuario ("admin") y una
	 * contrase�a ("123456"), el programa debe permitir al usuario ingresar sus
	 * credenciales. Si las mismas son err�neas, se volver�n a pedir hasta un m�ximo
	 * de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
	 * siguientes mensajes seg�n sea el caso: "Acceso concedido" o "Se ha bloqueado
	 * la cuenta"
	 */

	public static void ejercicio38() {

	}

	public static void main(String[] args) {
		System.out.println("Bienvenido al TP3:\nPor favor, ingrese el numero de ejercicio que quiere correr. \n"
				+ "Recuerde que el TP3 incluye los ejercicios 22 a 38 inclusive."
				+ " Si desea salir, escriba 'salir' o 'exit'.");
		String resultado = input.nextLine();
		if (resultado.equals("22")) {
			ejercicio22();
		} else if (resultado.equals("23")) {
			ejercicio23();
		} else if (resultado.equals("24")) {
			ejercicio24();
		} else if (resultado.equals("25")) {
			ejercicio25();
		} else if (resultado.equals("26")) {
			ejercicio26();
		} else if (resultado.equals("27")) {
			ejercicio27();
		} else if (resultado.equals("28")) {
			ejercicio28();
		} else if (resultado.equals("29")) {
			ejercicio29();
		} else if (resultado.equals("30")) {
			ejercicio30();
		} else if (resultado.equals("31")) {
			ejercicio31();
		} else if (resultado.equals("32")) {
			ejercicio32();
		} else if (resultado.equals("33")) {
			ejercicio33();
		} else if (resultado.equals("34")) {
			ejercicio34();
		} else if (resultado.equals("35")) {
			ejercicio35();
		} else if (resultado.equals("36")) {
			ejercicio36();
		} else if (resultado.equals("37")) {
			ejercicio37();
		} else if (resultado.equals("38")) {
			ejercicio38();
		} else if (resultado.equals("salir") || resultado.equals("exit")) {
			System.exit(0);
		} else {
			System.out.println("La opcion ingresada no es valida.");
		}
	}
}
