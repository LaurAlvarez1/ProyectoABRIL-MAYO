package packageAbril1;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int opcion = 0;

		do {
			System.out.println("\n======= MENU PRINCIPAL ========");
			System.out.println("1. Mostrar saludo");
			System.out.println("2. Mostrar fecha actual");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");

			opcion = reader.nextInt();

			switch (opcion) {

			case 1: {
				System.out.println("Hola, esto es un saludo");
				break;
			}
			case 2: {
				System.out.println("La fecha de hoy es: " + LocalDate.now());
				break;

			}
			case 3: {
				System.out.println("\nSaliendo del programa...");
				break;
			}
			case 4: {
				System.out.println("El resultado es: "+sumar(reader));//el escaner por parámetro
				
				break;
			}
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 3);

		reader.close();

		// TODO Auto-generated method stub

	}
	
	//========== METODOS =====================
	
	
	public static int sumar(Scanner reader) { //para hacer metodos en el principal, siempre STATIC
		//si necesito usar el escaner lo puedo importar como parametro, así no creo uno nuevo.
		
		int num1;
		int num2;
		int resultado;
		
		System.out.println("\nDime el primer numero que quieras sumar: ");
		
		num1=reader.nextInt();
		
		
		System.out.println("\nDime el segundo numero que quieras sumar: ");
		num2=reader.nextInt();
		
		resultado = num1+num2;
		
		return resultado;
		
	}

}
