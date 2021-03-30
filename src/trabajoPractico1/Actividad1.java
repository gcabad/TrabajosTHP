package trabajoPractico1;

import java.util.Scanner;

public class Actividad1 {

	private static Scanner input = new Scanner(System.in);

	/*
	 * 1. Realizá un programa que permita que el usuario ingrese su nombre. El
	 * programa debe emitir una salida con un mensaje de bienvenida que incluya el
	 * nombre ingresado. [EC]
	 * 
	 */

	public static void ejercicio1() {
		System.out.println("Bienvenido! Por favor, ingrese su nombre:");
		String nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre + "!");
	}

	/*
	 * 2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres
	 * trimestres distintos para cierto alumno de nivel secundario. Debe calcularse
	 * y mostrarse la nota promedio. [EC]
	 */

	public static void ejercicio2() {
		String msjError = "La nota ingresada no es valida. Por favor, ingrese una nota entre 1 y 10 inclusive.";
		int prom = 0;
		System.out.println("Bienvenido! Por favor, ingrese la nota correspondiente al primer trimestre:");
		int nota = Integer.parseInt(input.nextLine());
		while (nota > 10 || nota < 1) {
			System.out.println(msjError);
			nota = Integer.parseInt(input.nextLine());
		}
		prom += nota;
		System.out.println("Ingrese ahora la nota correspondiente al segundo trimestre:");
		nota = Integer.parseInt(input.nextLine());
		while (nota > 10 || nota < 1) {
			System.out.println(msjError);
			nota = Integer.parseInt(input.nextLine());
		}
		prom += nota;
		System.out.println("Ingrese ahora la nota correspondiente al tercer trimestre:");
		nota += Integer.parseInt(input.nextLine());
		while (nota > 10 || nota < 1) {
			System.out.println(msjError);
			nota = Integer.parseInt(input.nextLine());
		}
		prom += nota;
		System.out.println("La nota promedio del alumno es: " + prom / 3 + ".");
	}

	/*
	 * 3. Realizá un programa que permita ingresar un número entero. Debe mostrarse
	 * el número ingresado: a. Multiplicado por 5. b. Dividido por 2.
	 * 
	 */

	private static void ejercicio3() {
		System.out.println("Por favor, ingrese un numero entero:");
		int numero = Integer.parseInt(input.nextLine());
		System.out.println("El numero ingresado es: " + numero + 
				"\nSi lo multiplicamos por 5 nos da: " + numero * 5 + 
				".\nSi lo dividimos por 2 nos da: " + (numero / 2) + ".");
	}

	/*
	 * 4. Realizá un programa que permita ingresar el valor monetario de una hora de
	 * trabajo y la cantidad de horas trabajadas por día por un trabajador. Debes
	 * mostrar el valor del salario semanal, sabiendo que trabaja todos los días
	 * hábiles y la mitad de las horas del día hábil los sábados. (Todas las horas
	 * valen lo mismo.)
	 */

	private static void ejercicio4() {
		System.out.println("Por favor, ingrese el valor de la hora:");
		int valorHora = Integer.parseInt(input.nextLine());
		while (valorHora < 0) {
			System.out.println("El valor hora no es valido. Por favor, ingrese un monto mayor a 0: ");
			valorHora = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ahora introduzca la cantidad de horas que trabaja en un dia normal:");
		int cantHoras = Integer.parseInt(input.nextLine());
		while (cantHoras < 0) {
			System.out.println("El valor hora no es valido. Por favor, ingrese un monto mayor a 0: ");
			cantHoras = Integer.parseInt(input.nextLine());
		}
		System.out.println("El valor del salario semanal es de: $"
				+ ((valorHora * cantHoras * 5) + (valorHora * cantHoras / 2)) + ".");
	}

	/*
	 * 5. Realizá un programa que permita ingresar valores del mismo tipo para las
	 * variables num1 y num2. Una vez cargadas, mostrar ambas variables por
	 * pantalla, intercambiá sus valores (que lo cargado en num1 quede en num2, y
	 * viceversa) y volvé a mostrarlas actualizadas. [EC]
	 * 
	 */

	private static void ejercicio5() {
		System.out.println("Por favor, ingrese un numero: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("El primer numero ingresado es: " + num1 + " y el segundo numero es: " + num2 + ".");
		int auxNum = num1;
		num1 = num2;
		num2 = auxNum;
		System.out.println("Los valores han sido intercambiados. \nEl primer numero ahora es: " + num1
				+ " y el segundo es " + num2 + ".");
	}

	/*
	 * 6. Realizá un programa que permita ingresar el monto total de las ventas
	 * realizadas por un vendedor durante el mes, de quien se sabe que gana un
	 * sueldo fijo de 44000 pesos más el 16 por ciento del monto total vendido. Con
	 * tales datos debes calcular y mostrar el importe a cobrar por el vendedor
	 */

	private static void ejercicio6() {
		System.out.println("Por favor, ingrese el monto total correspondiente a las ventas realizadas en el mes:");
		double montoVentas = Double.parseDouble(input.nextLine());
		while (montoVentas < 0) {
			System.out.println("El monto ingresado no es valido. Por favor, ingrese un numero mayor o igual a 0.");
			montoVentas = Double.parseDouble(input.nextLine());
		}
		System.out.println("El monto a cobrar por el vendedor es de $" + (44000 + (montoVentas * 0.16)) + ".");
	}

	/*
	 * 7. Realizá un programa que permita ingresar el ancho y el largo de un terreno
	 * en metros y el valor del metro cuadrado de tierra. Debe mostrarse el valor
	 * total del terreno y la cantidad de metros de alambre para cercarlo
	 * completamente a tres alturas distintas.
	 */

	private static void ejercicio7() {
		String msjError = "La medida ingresada no es valida. Por favor, ingrese un numero mayor a 0.";
		System.out.println("Ingrese el ancho en mt2 correspondiente al terreno:");
		double ancho = Double.parseDouble(input.nextLine());
		while (ancho <= 0) {
			System.out.println(msjError);
			ancho = Double.parseDouble(input.nextLine());
		}
		System.out.println("Ingrese el largo en mt2 correspondiente al terreno:");
		double  largo = Double.parseDouble(input.nextLine());
		while (largo <= 0) {
			System.out.println(msjError);
			ancho = Double.parseDouble(input.nextLine());
		}
		System.out.println("Ingrese el monto correspondiente al metro cuadrado:");
		double valorMt2 = Double.parseDouble(input.nextLine());
		while (valorMt2 <= 0) {
			System.out.println("El monto ingresado no es valido. Por favor, ingrese un numero mayor a 0.");
			ancho = Double.parseDouble(input.nextLine());
		}
		System.out.println("El valor total del terreno es: $" + ancho * largo * valorMt2 + ". "
				+ "Para poder cercarlo a tres alturas distintas son necesarios " + ((ancho * 2) + (largo * 2)) * 3
				+ " metros de alambre.");

	}

	/*
	 * 8. Realizá un programa que permita ingresar dos números naturales. Debes
	 * mostrar los resultados para las 4 operaciones matemáticas básicas con los
	 * números ingresados. [EC]
	 */

	private static void ejercicio8() {
		String msjError = "El numero ingresado no es valido. Recuerde que los numeros naturales son aquellos numeros que son enteros y mayores a 0:";
		
		System.out.println("Bienvenido, ingrese por favor un numero natural:");
		int num1 = Integer.parseInt(input.nextLine());
		while (num1 < 0) {
			System.out.println(msjError);
			num1 = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ahora ingrese un segundo numero natural: ");
		int num2 = Integer.parseInt(input.nextLine());
		while (num2 < 0) {
			System.out.println(msjError);
			num2 = Integer.parseInt(input.nextLine());
		}
		System.out.println("Los resultados de las cuatro operaciones matematicas basicas son:" + 
						"\nSuma = " + (num1 + num2) + 
						"\nResta = " + (num1 - num2) + 
						"\nDivision = " + (num1 / num2) + 
						"\nMultiplicacion = "+ (num1 * num2) + ".");
	}

	/*
	 * 9. Realizá un programa que permita ingresar dos números que representan las
	 * medidas en grados de dos ángulos interiores de cierto triángulo. A partir de
	 * los valores de estos dos ángulos el programa debe mostrar el valor en grados
	 * del ángulo restante. Recordá que la suma de los ángulos interiores de todo
	 * triángulo es de 180º.
	 * 
	 */

	private static void ejercicio9() {
		String msjError = "La medida ingresada no es valida. El angulo debe ser mayor a 0.";
		
		System.out.println("Por favor, ingrese la medida del primer angulo: ");
		int angulo1 = Integer.parseInt(input.nextLine());
		while (angulo1 <= 0) {
			System.out.println(msjError);
			angulo1 = Integer.parseInt(input.nextLine());
		}
		System.out.println("Ingrese ahora la medida del segundo angulo: ");
		int angulo2 = Integer.parseInt(input.nextLine());
		while (angulo2 <= 0) {
			System.out.println(msjError);
			angulo2 = Integer.parseInt(input.nextLine());
		}
		System.out.println(
				"Para formar un triangulo, el tercer angulo debería medir " + (180 - (angulo1 + angulo2)) + " grados.");
	}

	/*
	 * 10.Realizá un programa que permita resolver el siguiente problema: Tres
	 * personas aportan diferente capital a una sociedad y desean saber el valor
	 * total aportado y qué porcentaje aportó cada una (indicando nombre y
	 * porcentaje). Solicitar la carga por teclado del nombre de cada socio, su
	 * capital aportado y a partir de esto calcular e informar lo requerido
	 * previamente.
	 */

	private static void ejercicio10() {
		String msjError = "El monto ingresado no es valido. Por favor, introduzca un numero mayor a 0";
		System.out.println("Ingrese el nombre del socio 1:");
		String nombreSocio1 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		double capitalSocio1 = Double.parseDouble(input.nextLine());
		while (capitalSocio1 <= 0) {
			System.out.println(msjError);
			capitalSocio1 = Double.parseDouble(input.nextLine());
		}
		System.out.println("Ingrese ahora el nombre del socio 2:");
		String nombreSocio2 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		double capitalSocio2 = Double.parseDouble(input.nextLine());
		while (capitalSocio2 <= 0) {
			System.out.println(msjError);
			capitalSocio2 = Double.parseDouble(input.nextLine());
		}
		System.out.println("Ingrese el nombre del socio 3:");
		String nombreSocio3 = input.nextLine();
		System.out.println("Ingrese ahora el capital aportado por dicho socio:");
		double capitalSocio3 = Double.parseDouble(input.nextLine());
		while (capitalSocio3 <= 0) {
			System.out.println(msjError);
			capitalSocio3 = Double.parseDouble(input.nextLine());
		}
		double capitalTotal = capitalSocio1 + capitalSocio2 + capitalSocio3;
		System.out.println("El total del capital aportado por los socios es de: " + capitalTotal + "."
				+ "\nEl porcentaje aportado por cada socio es el siguiente: \n" + 
				"El socio " + nombreSocio1 + " aportó un " + (capitalSocio1 * 100 / capitalTotal) + "%.\n" + 
				"El socio " + nombreSocio2 + " aportó un " + (capitalSocio2 * 100 / capitalTotal) + "%.\n" + 
				"El socio " + nombreSocio3 + " aportó un " + (capitalSocio3 * 100 / capitalTotal) + "%.");
	}

	public static void main(String[] args) {
		String msjPrincipalInicial = ("Por favor, ingrese el numero de ejercicio que quiere ejecutar. \n"
				+ "Recuerde que la actividad 1 del TP1 incluye los ejercicios 1 a 10 inclusive."
				+ " Si desea salir, escriba 'salir' o 'exit'.");
		String msjEjecucion;
		String msjPrincipal;
		
		System.out.println("Bienvenido a la actividad 1 del TP1");
		
		System.out.println(msjPrincipalInicial);
		String resultado = input.nextLine();
		
		while (!resultado.equals("salir") && !resultado.equals("exit")) {
			
			msjEjecucion = "------ Ejecutando ejercicio " + resultado + " ------\n";
			msjPrincipal = "\n------ Ejecucion finalizada -----\n" + msjPrincipalInicial;
			
			if (resultado.equals("1")) {
				System.out.println(msjEjecucion);
				ejercicio1();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("2")) {
				System.out.println(msjEjecucion);
				ejercicio2();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("3")) {
				System.out.println(msjEjecucion);
				ejercicio3();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("4")) {
				System.out.println(msjEjecucion);
				ejercicio4();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("5")) {
				System.out.println(msjEjecucion);
				ejercicio5();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("6")) {
				System.out.println(msjEjecucion);
				ejercicio6();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("7")) {
				System.out.println(msjEjecucion);
				ejercicio7();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("8")) {
				System.out.println(msjEjecucion);
				ejercicio8();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("9")) {
				System.out.println(msjEjecucion);
				ejercicio9();
				System.out.println(msjPrincipal);
			} else if (resultado.equals("10")) {
				System.out.println(msjEjecucion);
				ejercicio10();
				System.out.println(msjPrincipal);
			} else {
				System.out.println("La opcion ingresada no es valida. \n"
						+ "Debe ingresar un numero del 1 al 10 inclusive para ejecutar el ejercicio correspondiente o 'salir' o 'exit' para terminar.");	
			}
			resultado = input.nextLine();
		}
	}
}
