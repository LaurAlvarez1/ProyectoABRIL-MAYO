package pakageAbril7;

import java.util.Scanner;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		Persona persona1 = new Persona();
		ArrayList<Persona> personas = new ArrayList<>();

		int opcion = 0;

		do {
			System.out.println("\n======= MENU PRINCIPAL ========");
			System.out.println("1. Crear una persona (pide al usuario el nombre y edad)");
			System.out.println("2. Mostrar los datos de la persona");
			System.out.println("3. Verificar si la persona es mayor de edad");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");

			opcion = reader.nextInt();

			switch (opcion) {

			case 1: {
				crearNuevaPersona(reader, personas);

				break;
			}
			case 2: {
				mostrarDatosPersona(reader, personas);

				break;

			}
			case 3: {
				verificarMayorEdad(reader, personas);

				break;
			}
			case 4: {
				System.out.println("\nSaliendo del programa...");
				break;
			}

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 4);

		reader.close();

	}

//Metodos propios
	public static void crearNuevaPersona(Scanner reader, ArrayList personas) {

		String nombreNuevo = "";
		int edadNuevo = 0;

		System.out.println("\nCreemos una nueva persona:");
		System.out.println("\nNombre: ");
		nombreNuevo = reader.next();

		System.out.println("\nEdad: ");

		edadNuevo = reader.nextInt();

		Persona personaNueva = new Persona(nombreNuevo, edadNuevo);

		System.out.println("Persona " + personaNueva.getNombre() + " creada con éxito :)");

		personas.add(personaNueva);

	}

	public static Persona buscarPersona(ArrayList<Persona> personas, String nombre) {
		for (Persona p : personas) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		return null;
	}

	public static void verificarMayorEdad(Scanner reader, ArrayList<Persona> personas) {
		System.out.print("Nombre de la persona: ");
		String nombre = reader.next();

		Persona persona = buscarPersona(personas, nombre);

		if (persona != null) {
			if (persona.getEdad() >= 18) {
				System.out.println("La persona " + persona.getNombre() + " es MAYOR de edad.");
			} else {
				System.out.println("La persona " + persona.getNombre() + " es MENOR de edad.");
			}
		} else {
			System.out.println("No se encontró ninguna persona con ese nombre.");
		}
	}

	public static void mostrarDatosPersona(Scanner reader, ArrayList<Persona> personas) {
		System.out.print("Nombre de la persona: ");
		String nombre = reader.next();

		Persona persona = buscarPersona(personas, nombre);

		if (persona != null) {
			System.out.println("Datos de la persona:");
			System.out.println(persona);
		} else {
			System.out.println("No se encontró ninguna persona con ese nombre.");
		}
	}

}
