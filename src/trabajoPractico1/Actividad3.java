package trabajoPractico1;

import java.util.Scanner;

public class Actividad3 {

	private static Scanner input = new Scanner(System.in);
	/*
	 * 22.Realizá un programa que muestre todos los números enteros del 1 al 5, y
	 * luego los mismos números pero en orden inverso. [EC]
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
	 * 23.Realizá un programa que permita ingresar un número entero n. Debe mostrar
	 * los primeros 10 múltiplos de n (desde 1 x n).
	 */

	public static void ejercicio23() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero = Integer.parseInt(input.nextLine());
		for (int i = 1; i < 11; i++) {
			System.out.println(numero * i);
		}

	}

	/*
	 * 24.Realizá un programa que permita al usuario ingresar dos números enteros
	 * num1 y num2, donde el primero siempre deberá ser menor o igual al segundo. La
	 * computadora debe mostrar la secuencia de números existentes entre ambos: a.
	 * Incluyéndolos; b. Excluyéndolos.
	 * 
	 */

	public static void ejercicio24() {

		System.out.println("Ingrese un numero entero:");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero entero:");
		int numero2 = Integer.parseInt(input.nextLine());
		while (numero2 < numero1) {
			System.out.println("El numero ingresado es invalido. Debe ser mayor o igual a " + numero1
					+ ".\nPor favor, ingrese un numero valido:");
			numero2 = Integer.parseInt(input.nextLine());
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
	 * 25.Realizá un programa que permita ingresar dos números enteros que
	 * representen el ancho y el alto de una matriz de cruces. El programa debe
	 * dibujar dicha matriz.
	 */

	public static void ejercicio25() {
		System.out.println("Por favor, ingrese un numero entero:");
		int x = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese ahora otro numero entero:");
		int y = Integer.parseInt(input.nextLine());
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print('X');
			}
			System.out.println();
		}
	}
	/*
	 * 26.Realizá un programa que permita al usuario ingresar un número natural n.
	 * La computadora debe mostrar los primeros n múltiplos de 3 excepto aquellos
	 * que sean a la vez múltiplos de 5.
	 */
	public static void ejercicio26() {
		System.out.println("Ingrese un numero natural:");
		int numero = Integer.parseInt(input.nextLine());
		while (numero <= 0) {
			System.out.println("El numero ingresado no es valido. Recuerde, los numeros naturales son aquellos que son enteros mayores a 0. Vuelva a ingresarlo: ");
			numero = Integer.parseInt(input.nextLine());
		}
		System.out.println(
				"Los primeros " + numero + " multiplos del 3 sin incluir aquellos que lo son tambien del 5, son:");
		for (int i = 1; i <= numero ; i++) {
			int salida = 3 * i;
			if ((salida) % 5 != 0) {
				System.out.println(salida);
			}
		}
	}

	/*
	 * 27.Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el
	 * promedio de todas las edades ingresadas y cuántas edades fueron valores
	 * impares mayores que 18. [EC]
	 */
	public static void ejercicio27() {
		double promedio = 0;
		int mayoresEImpares = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor, ingrese una edad.");
			int edad = Integer.parseInt(input.nextLine());
			while (edad < 0) {
				System.out.println("La edad ingresada no es valida. por favor, ingrese una edad mayor a 0.");
				edad = Integer.parseInt(input.nextLine());
			}
			promedio += edad;
			if (edad > 18 && edad % 2 != 0) {
				mayoresEImpares++;
			}
		}

		System.out.println("El promedio de edades es: " + (promedio / 5)
				+ " y la cantidad de edades impares mayores a 18 es de " + mayoresEImpares + ".");
	}
		
	/*
	 * 28.Realizá un programa que a partir de un número entero cant ingresado por el
	 * usuario permita cargar por teclado cant números enteros. La computadora debe
	 * mostrar cuál fue el mayor número y en qué posición apareció.
	 */

	public static void ejercicio28() {
		System.out.println("Ingrese la cantidad de numeros que le gustaria que el sistema procese:");
		int cant = Integer.parseInt(input.nextLine());
		while (cant < 0) {
			System.out.println("El numero ingresado no es valido. Ingrese un numero mayor a 0 o 0 para salir.");
			cant = Integer.parseInt(input.nextLine());
		}
		if (cant == 0) {
			System.out.println("La cantidad ingresada es 0. Fin del programa.");
		} else {
			int mayor = 0;
			String resultado = "";
			for (int i = 1; i <= cant; i++) {
				System.out.println("Numeros restantes: " + (cant - i + 1) + ".\nIngrese un numero:");
				int numActual = Integer.parseInt(input.nextLine());
				if (i == 1) {
					mayor = numActual;
				} else {
					if (numActual > mayor) {
						mayor = numActual;
						resultado = "El numero mas grande fue " + mayor + " y se encontraba en la posición: " + i + ".";
					}
				}
			}
			System.out.println(resultado);
		}
	}

	/*
	 * 29.Realizá un programa que permita validar la nota de un examen. Se espera
	 * que la nota que el usuario ingrese sea un número comprendido entre 0 y 10. La
	 * misma debe ser ingresada tantas veces como sea necesario hasta que quede
	 * comprendida dentro del rango indicado. [EC]
	 */

	public static void ejercicio29() {
		System.out.println(
				"Por favor, ingrese la nota. Recuerde que la misma debe estar comprendida en el rango de 0 a 10 inclusive.");
		int nota = Integer.parseInt(input.nextLine());
		while (nota > 10 || nota < 0) {
			System.out.println("La nota ingresada no es valida. Por favor, ingrese una nota entre 0 y 10 inclusive.");
			nota = Integer.parseInt(input.nextLine());
		}
		System.out.println("Nota aceptada. La misma es: " + nota + ".");
	}

	/*
	 * 30.Realizá un programa que permita realizar varias operaciones matemáticas
	 * ingresando un caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’,
	 * ‘/’, ‘F’) y dos números enteros en el caso que no haya elegido ‘F’. La
	 * computadora debe mostrar el resultado para la operación ingresada. Considerar
	 * que no se puede dividir por cero. Cuando la operación ingresada sea ‘F’ nos
	 * indicará que no se desean calcular más operaciones. [EC]
	 */

	public static void ejercicio30() {
		String errorMsg = "Ingreso una operacion que no es valida. Recuerde:\n"
				+ "- Ingrese '+' para sumar.\n" + "- Ingrese '-' para restar.\n"
				+ "- Ingrese '*' para multiplicar.\n" + "- Ingrese '/' para dividir.\n"
				+ "- Ingrese 'F' si desea finalizar la ejecución del programa.";
		String operacion = "";
		
		System.out.println("Por favor, indique la operación que desea realizar:\n");
		operacion = input.nextLine();
		while (!operacion.equals("F") && !operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/")) {
			System.out.println(errorMsg);
			operacion = input.nextLine();
		}
		while (!operacion.equals("F")) {			
			System.out.println("Ingrese ahora por favor un numero entero:");
			int numero1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese ahora el segundo numero entero:");
			int numero2 = Integer.parseInt(input.nextLine());
				switch (operacion) {
				case "+":
					System.out.println("El resultado de sumar los dos numeros es: " + (numero1 + numero2) + ".");
					break;
				case "-":
					System.out.println("El resultado de restar los dos numeros es: " + (numero1 - numero2) + ".");
					break;
				case "/":
					if(numero2 == 0) {
						System.out.println("ERROR: No se puede dividir por 0.");
					} else {
					System.out.println("El resultado de dividir los dos numeros es: " + (numero1 / numero2) + ".");
					}
					break;
				case "*":
					System.out.println("El resultado de multiplicar los dos numeros es: " + (numero1 * numero2) + ".");
					break;
				}
			System.out.println("Por favor, indique la operación que desea realizar:\n");
			operacion = input.nextLine();
			while (!operacion.equals("F") && !operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/")) {
				System.out.println(errorMsg);
				operacion = input.nextLine();
			}
		}
	}

	/*
	 * 31.Realizá un programa que permita validar una opción ingresada. Se le
	 * preguntará al usuario si desea continuar con alguna operación de la forma
	 * "¿Deseás continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una
	 * 'N' (incluir las minúsculas). La opción debe ser ingresada tanto como sea
	 * necesario hasta que quede comprendida dentro de las posibilidades esperadas.
	 * Realizá este ejercicio en dos versiones (A y B): con ciclo while y con ciclo
	 * do-while.
	 */
	public static void ejercicio31A() {
		
		//OPCION A: CICLO WHILE.
		System.out.println("-------------------\nejercicio con WHILE\n-------------------");
		
		System.out.println("ingrese una opcion:");
		String opcion = input.nextLine();
		System.out.println("Usted ingreso: " + opcion + ".\n¿Deseás continuar? [S/N]");
		String continuar = input.nextLine().toUpperCase();
		while(!continuar.equals("S") && !continuar.equals("N")) {
			System.out.println("La opcion ingresada es incorrecta. Por favor, elija S si desea continuar, o N si quiere modificar su opcion");
			continuar = input.nextLine().toUpperCase();
		}
		while(continuar.equals("N")) {
			System.out.println("ingrese otra opcion:");
			opcion = input.nextLine();
			System.out.println("Usted ingreso: " + opcion + ".\n¿Deseás continuar? [S/N]");
			continuar = input.nextLine().toUpperCase();
		}
	}
		
		
	public static void ejercicio31B() {		
		System.out.println("-------------------\nejercicio con DO-WHILE\n-------------------");
		String continuar2 = "";
			do {
				System.out.println("ingrese una opcion:");
				String opcion2 = input.nextLine();
				System.out.println("Usted ingreso: " + opcion2 + ".\n¿Deseás continuar? [S/N]");
				continuar2 = input.nextLine().toUpperCase();
				while (!continuar2.equals("S") && !continuar2.equals("N")) {
					System.out.println("La opcion ingresada es incorrecta. Por favor, elija S si desea continuar, o N si quiere modificar su opcion");
					continuar2 = input.nextLine().toUpperCase();
				}
			} while(continuar2.equals("N"));
	}

	/*
	 * 32.Realizá un programa que permita validar la nota de un examen de la misma
	 * manera que el ejercicio 28 pero con las siguientes nuevas directivas: Las
	 * notas 1 y 3 no usan nunca. La nota 0 se reserva para los ausentes En resumen,
	 * las notas válidas pueden ser un 2 o un valor entre 4 y 10. [EC]
	 */
	public static void ejercicio32() {
		System.out.println("Bienvenido, por favor ingrese la nota de un examen:");
		int nota = Integer.parseInt(input.nextLine());
		while(nota != 2 && !(nota >= 4 && nota <= 10)) {
			System.out.println("La nota ingresada no es valida. Por favor, ingrese otra nota:");
			nota = Integer.parseInt(input.nextLine());
		} 
		System.out.println("La nota ingresada es valida.");
	}

	/*
	 * 33.Realizá un programa que permita al usuario ingresar números hasta que se
	 * introduzca un 0. La computadora debe mostrar el número máximo y el número
	 * mínimo. [EC]
	 */

	public static void ejercicio33() {
		System.out.println("Introduzca un numero:");
		int numero = Integer.parseInt(input.nextLine());
		if (numero == 0) {
			System.out.println("No ha introducido numeros. La ejecucion ha finalizado.");
			System.exit(0);
		}
		int max = 0;
		int min = 0;
		while (numero != 0) {
			if(numero > max ) {
				max = numero;
			} else if (numero < min) {
				min = numero;
			}
			System.out.println("Introduzca otro numero o 0 para salir.");
			numero = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ejecucion finalizada. El numero maximo ha sido: " + max + " y el minimo fue: " + min + ".");
	}

	/*
	 * 34.Realizá un programa que permita ingresar la estatura (en metros con
	 * decimales) de cada jugador de un equipo de baloncesto. La carga finalizará al
	 * ingresar cero. Calcular y mostrar la estatura promedio del equipo.
	 */
	public static void ejercicio34() {
		double alturasSumadas = 0.00;
		int cantIngresos = 0;
		System.out.println("Bienvenido, por favor ingrese la altura del jugador o ingrese 0 para finalizar");
		double altura = Double.parseDouble(input.nextLine());
		while (altura != 0.00) {
			cantIngresos++;
			alturasSumadas += altura;
			System.out.println("Por favor, ingrese una nueva altura o ingrese 0 para finalizar.");
			altura = Double.parseDouble(input.nextLine());
		}
		if (alturasSumadas == 0.00) {
			System.out.println("No ha ingresado ninguna altura nueva. Ejecución finalizada.");
		} else {
		System.out.println("La altura promedio del equipo es de: "  + alturasSumadas/cantIngresos + ".");
		}
	}

	/*
	 * 35.Realizá un programa que permita ingresar nombre y edad de un grupo de
	 * personas (para cada una, nombre y edad). La carga termina cuando en el nombre
	 * de la persona se ingresa un asterisco ('*'). Mostrar al final cómo se llama
	 * la persona más joven.
	 */

	public static void ejercicio35() {
		System.out.println("Ingrese a continuacion el nombre de la persona o '*' para salir.");
		String nombre = input.nextLine();
		int edad = 0;
		String nombreMasJoven = "not_existent_name";
		int edadMasJoven = -1;
		while (!nombre.equals("*")) {
			System.out.println("Ingrese ahora la edad de la persona");
			edad = Integer.parseInt(input.nextLine());
			while (edad < 0) {
				System.out.println("La edad ingresada no es valida. Por favor, ingrese un numero mayor o igual a 0.");
				edad = Integer.parseInt(input.nextLine()); 
			}
			if (edadMasJoven == -1) {
				edadMasJoven = edad;
			} else if (edad < edadMasJoven) {
				edadMasJoven = edad;
				nombreMasJoven = nombre;
			}
			System.out.println("Ingrese el nombre de la proxima persona a cargar, o ingrese '*' para salir.");
			nombre = input.nextLine();
		}
		if (edadMasJoven == -1) {
			System.out.println("La ejecucion fue finalizada sin ingresar nombres");
		} else {
			System.out.println("La persona mas joven es: " + nombreMasJoven + " con " + edadMasJoven + " años.");
		}
	}

	/*
	 * 36.Realizá un programa que permita ingresar números mientras el promedio
	 * entre todos los ingresados sea menor a 20. Al terminar el ingreso indicar la
	 * cantidad de valores leídos. [EC]
	 * 
	 * 
	 */

	public static void ejercicio36() {
		int numero = 0;
		int cant = 0;
		final int PROMEDIO_MAX = 20;
		System.out.println("Bienvenido! Usted podra ingresar numeros mientras el promedio de todo sea menor a 20");
		do {
			numero += Integer.parseInt(input.nextLine());
			cant++;
		} while (numero/cant < PROMEDIO_MAX);
		if (cant == 1) {
		System.out.println("Usted ingreso " + cant + " numero.");
		} else {
			System.out.println("Usted ingreso " + cant + " numeros.");
		}
	}

	/*
	 * 37.Realizá un programa que permita al usuario ingresar hasta 12 valores, de a
	 * uno por vez, que representan los sueldos mensuales que percibió un empleado
	 * durante un año calendario. Si durante la carga de los sueldos mensuales se
	 * detecta un valor negativo, esto indica que aún no se ha cobrado el mes en
	 * curso, y en ese caso se debe dejar de ingresar datos. Al finalizar mostrar el
	 * monto percibido por el empleado hasta ese momento (total o parcial).
	 */

	public static void ejercicio37() {
		int cantIngresada = 1;
		int total = 0;
		int valorMes = 0;
		do {
			total += valorMes;
			System.out.println("Ingrese el sueldo correspondiente al mes " + cantIngresada + ":");
			valorMes = Integer.parseInt(input.nextLine());
			cantIngresada++;
		} while (cantIngresada <= 12 && valorMes >= 0); 
		System.out.println("El monto percibido por el empleado es de " + total + ".");
	}

	/*
	 * 38.Realizá un programa que permita controlar con validación el ingreso a un
	 * sitio web. Teniendo ya precargados un nombre de usuario ("admin") y una
	 * contraseña ("123456"), el programa debe permitir al usuario ingresar sus
	 * credenciales. Si las mismas son erróneas, se volverán a pedir hasta un máximo
	 * de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
	 * siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado
	 * la cuenta"
	 */

	public static void ejercicio38() {
		final String usuario = "admin";
		final String contraseña = "123456";
		String tmpUsuario = "";
		String tmpContraseña = "";
		int intentos = 0;
		boolean accesoConcedido;
		
		do{
			System.out.println("Ingrese su nombre de usuario:");
			tmpUsuario = input.nextLine();
			System.out.println("Ingrese su contraseña:");
			tmpContraseña = input.nextLine();
			accesoConcedido = tmpUsuario.equals(usuario) && tmpContraseña.equals(contraseña);
			intentos++;
		} while (!accesoConcedido && intentos < 3);
		
		if(accesoConcedido) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}

	}

	public static void main(String[] args) {
		String msjPrincipalInicial = ("Por favor, ingrese el numero de ejercicio que quiere ejecutar. \n"
				+ "Recuerde que la actividad 3 del TP1 incluye los ejercicios 22 a 38 inclusive."
				+ " Si desea salir, escriba 'salir' o 'exit'.");
		String msjEjecucion;
		String msjPrincipal;
		
		System.out.println("Bienvenido a la actividad 3 del TP1");
		
		System.out.println(msjPrincipalInicial);
		String resultado = input.nextLine();
		
		while (!resultado.equals("salir") && !resultado.equals("exit")) {
			
			msjEjecucion = "------ Ejecutando ejercicio " + resultado + " ------\n";
			msjPrincipal = "\n------ Ejecucion finalizada -----\n" + msjPrincipalInicial;
			
			if (resultado.equals("22")) {
				System.out.println(msjEjecucion);
				ejercicio22();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("23")) {
				System.out.println(msjEjecucion);
				ejercicio23();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("24")) {
				System.out.println(msjEjecucion);
				ejercicio24();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("25")) {
				System.out.println(msjEjecucion);
				ejercicio25();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("26")) {
				System.out.println(msjEjecucion);
				ejercicio26();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("27")) {
				System.out.println(msjEjecucion);
				ejercicio27();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("28")) {
				System.out.println(msjEjecucion);
				ejercicio28();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("29")) {
				System.out.println(msjEjecucion);
				ejercicio29();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("30")) {
				System.out.println(msjEjecucion);
				ejercicio30();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("31")) {
				System.out.println("¿Que variante del ejercicio desea ejecutar? Ingrese 'A' para la variante WHILE, y 'B' para la variante DO-WHILE");
				String variante = input.nextLine().toUpperCase();
				while(!variante.equals("A") && !variante.equals("B")) {
					System.out.println("La variante ingresada no es valida. Recuerde: 'A' para la variante WHILE, y 'B' para la variante DO-WHILE");
					variante = input.nextLine().toUpperCase();
				}
				if(variante.equals("A")) {
					System.out.println(msjEjecucion);
					ejercicio31A();
					System.out.println(msjPrincipal);
				} else {
					System.out.println(msjEjecucion);
					ejercicio31B();
					System.out.println(msjPrincipal);
				}
			} else if (resultado.equals("32")) {
				System.out.println(msjEjecucion);
				ejercicio32();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("33")) {
				System.out.println(msjEjecucion);
				ejercicio33();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("34")) {
				System.out.println(msjEjecucion);
				ejercicio34();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("35")) {
				System.out.println(msjEjecucion);
				ejercicio35();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("36")) {
				System.out.println(msjEjecucion);
				ejercicio36();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("37")) {
				System.out.println(msjEjecucion);
				ejercicio37();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("38")) {
				System.out.println(msjEjecucion);
				ejercicio38();
				System.out.println(msjPrincipal);
			} else {
				System.out.println("La opcion ingresada no es valida. \n"
						+ "Debe ingresar un numero del 22 al 38 inclusive para ejecutar el ejercicio correspondiente o 'salir' o 'exit' para terminar.");	
			}
			resultado = input.nextLine();
		}
	}
}