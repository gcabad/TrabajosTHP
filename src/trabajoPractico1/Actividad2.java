package trabajoPractico1;

import java.util.Scanner;

public class Actividad2 {

	private static Scanner input = new Scanner(System.in);

	/*
	 * 11 - Realizá un programa que permita ingresar un número entero e indique si
	 * se trata de un número par o impar. [EC]
	 */

	public static void ejercicio11() {
		System.out.println("Ingrese un numero entero:");
		int numero = Integer.parseInt(input.nextLine());
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
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese ahora el segundo numero entero:");
		int numero2 = Integer.parseInt(input.nextLine());
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
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese ahora el segundo numero entero:");
		int numero2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese ahora el tercer numero entero:");
		int numero3 = Integer.parseInt(input.nextLine());
		
		if (numero1 > numero2 && numero1 > numero2) {
			System.out.println("El primer numero es el mas grande. Su valor es: " + numero1 + ".");
		} else if (numero2 > numero1 && numero2 > numero3 ) {
			System.out.println("El segundo numero es el mas grande. Su valor es: " + numero2 + ".");
		} else if (numero3 > numero1 && numero3 > numero2){
			System.out.println("El tercer numero es el mas grande. Su valor es: " + numero3 + ".");
		} else {
			System.out.println("No hay un numero que sea mayor a los otros dos.");
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
		int edad = Integer.parseInt(input.nextLine());
		while (edad <= 0) {
			System.out.println("La edad ingresada no es valida. Por favor, ingrese una edad mayor a 0");
			edad = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese ahora la altura correspondiente:");
		double altura = Double.parseDouble(input.nextLine());
		while (altura <= 0) {
			System.out.println("La altura ingresada no es valida. Por favor, ingrese una altura mayor a 0");
			edad = Integer.parseInt(input.nextLine());
		}
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
		int edad = Integer.parseInt(input.nextLine());
		while (edad <= 0) {
			System.out.println("La edad ingresada no es valida. Por favor, ingrese una edad mayor a 0");
			edad = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese ahora la altura correspondiente:");
		double altura = Double.parseDouble(input.nextLine());
		while (altura <= 0) {
			System.out.println("La altura ingresada no es valida. Por favor, ingrese una altura mayor a 0");
			edad = Integer.parseInt(input.nextLine());
		}
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
		int inscriptos = Integer.parseInt(input.nextLine());
		while (inscriptos < 0) {
			System.out.println("El numero ingresado no es valido. Por favor, ingrese un numero mayor o igual a 0.");
			inscriptos = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese la cantidad de asientos disponibles en la conferencia:");
		int asientosDisponibles = Integer.parseInt(input.nextLine());
		while (asientosDisponibles < 0) {
			System.out.println("El numero ingresado no es valido. Por favor, ingrese un numero mayor o igual a 0.");
			asientosDisponibles = Integer.parseInt(input.nextLine());
		}
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
		int edad = Integer.parseInt(input.nextLine());
		while (edad < 1 || edad > 120) {
			System.out.println("La edad ingresada es invalida, por favor ingrese un numero entre 1 y 120 inclusive.");
			edad = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ahora ingrese su genero, ingresando 'F' para Femenino y 'M' para Masculino.");
		String genero = input.nextLine().toUpperCase();
		while(!genero.equals("F") && !genero.equals("M")) {
			System.out.println("El genero ingresado es invalido. Por favor, ingrese 'F' para femenino y 'M' para Masculino");
			genero = input.nextLine().toUpperCase();
		}
		if ((genero.equals("F") && edad >= 60) || (genero.equals("M") && edad >= 65)) {
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
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Por favor, ingrese otro numero entero:");
		int numero2 = Integer.parseInt(input.nextLine());
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
		System.out.println("Ingrese un numero entero:");
		int numero = Integer.parseInt(input.nextLine());
		
		boolean esDeUnSoloDigito = (numero >= -9) && (numero <= 9);
		boolean esImpar = numero%2 != 0;
		boolean estaEnAmbos = esDeUnSoloDigito && esImpar;
		boolean noEstaEnNinguno = !esImpar && !esDeUnSoloDigito;

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
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ahora ingrese un segundo numero: ");
		int num2 = Integer.parseInt(input.nextLine());
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
		int dia = Integer.parseInt(input.nextLine());
		while (dia > 7 || dia < 1) {
			System.out.println("El numero ingresado no es valido. Ingrese un numero entre 1 y 7 inclusive.");
			dia = Integer.parseInt(input.nextLine());
		}
		String resultado = "";
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
		String msjPrincipalInicial = ("Por favor, ingrese el numero de ejercicio que quiere ejecutar. \n"
				+ "Recuerde que la actividad 2 del TP1 incluye los ejercicios 11 a 21 inclusive."
				+ " Si desea salir, escriba 'salir' o 'exit'.");
		String msjEjecucion;
		String msjPrincipal;
		
		System.out.println("Bienvenido a la actividad 2 del TP1");
		
		System.out.println(msjPrincipalInicial);
		String resultado = input.nextLine();
		
		while (!resultado.equals("salir") && !resultado.equals("exit")) {
			
			msjEjecucion = "------ Ejecutando ejercicio " + resultado + " ------\n";
			msjPrincipal = "\n------ Ejecucion finalizada -----\n" + msjPrincipalInicial;
			
			if (resultado.equals("11")) {
				System.out.println(msjEjecucion);
				ejercicio11();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("12")) {
				System.out.println(msjEjecucion);
				ejercicio12();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("13")) {
				System.out.println(msjEjecucion);
				ejercicio13();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("14")) {
				System.out.println(msjEjecucion);
				ejercicio14();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("15")) {
				System.out.println(msjEjecucion);
				ejercicio15();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("16")) {
				System.out.println(msjEjecucion);
				ejercicio16();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("17")) {
				System.out.println(msjEjecucion);
				ejercicio17();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("18")) {
				System.out.println(msjEjecucion);
				ejercicio18();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("19")) {
				System.out.println(msjEjecucion);
				ejercicio19();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("20")) {
				System.out.println(msjEjecucion);
				ejercicio20();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("21")) {
				System.out.println(msjEjecucion);
				ejercicio21();
				System.out.println(msjPrincipal);
			} else {
				System.out.println("La opcion ingresada no es valida. \n"
						+ "Debe ingresar un numero del 11 al 20 inclusive para ejecutar el ejercicio correspondiente o 'salir' o 'exit' para terminar.");	
			}
			resultado = input.nextLine();
		}
	}
}