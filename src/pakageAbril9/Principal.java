package pakageAbril9;

import java.util.Scanner;
import java.io.Reader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		try {

			//ComponenteSubAtom componente = new ComponenteSubAtom();

			int opcion = 0;

			do {
				System.out.println("\n======= LABORATORIO ========");
				System.out.println("1. Crear un elemento subatomico");
				System.out.println("2. Mostrar lista de elementos subatomicos");
				System.out.println("3. Crear un atomo de Helio");
				System.out.println("4. Salir");
				System.out.print("Elige una opción: ");

				opcion = reader.nextInt();

				switch (opcion) {

				case 1: {

					System.out.println("\n1. Crear un elemento subatomico");
					System.out.println("\nDame la carga de tu elemento: ");
					int carga = reader.nextInt();
					crearElemento(carga);

					break;
				}
				case 2: {
					System.out.println("\n2. Mostrar lista de elementos subatomicos:");

					System.out.println("\nDame la carga de tu elemento: ");

					break;

				}
				case 3: {

					break;
				}
				case 4: {
					break;
				}

				default:
				}

			} while (opcion != 4);

			reader.close();
		} catch (Exception e) {
			
			// Aquí capturas el error si se lanza desde el constructor
			System.out.println("Error al crear el componente subatómico: " + e.getMessage());
		}
	}

//Metodos propios

	public static void crearElemento(int carga) {

		ComponenteSubAtom componente1 = new ComponenteSubAtom(carga);

		if (carga == 1) {
			System.out.println("\nSu proton ha sido creado");
		} else if (carga == 0) {
			System.out.println("\nSu neutron ha sido creado");
		} else if (carga == -1) {
			System.out.println("\nSu electron ha sido creado");
		}
		System.out.println(componente1.toString());
	}

}
