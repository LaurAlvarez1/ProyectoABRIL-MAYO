package pakageAbril7_1;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		Empleado empleado1 = new Empleado();
		
		ArrayList<Empleado> empleados = new ArrayList<>();


		int opcion = 0;

		do {
			System.out.println("\n======= MENU PRINCIPAL ========");
			System.out.println("1. Crear nuevo empleado");
			System.out.println("2. Mostrar todos los empleados.");
			System.out.println("3. Buscar empleado por nombre.");
			System.out.println("4. Mostrar sueldo total de un empleado.");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");

			opcion = reader.nextInt();

			switch (opcion) {

			case 1: {
				
				

				break;
			}
			case 2: {

				break;

			}
			case 3: {

				break;
			}
			case 4: {
				System.out.println("\nSaliendo del programa...");
				break;
			}

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 5);

		reader.close();

	}
	}


