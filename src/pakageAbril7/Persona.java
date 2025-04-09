package pakageAbril7;

import java.util.Scanner;

public class Persona {

	// ATTOS
	public static final String NOMBRE_DEFECTO = "nombre";
	public static final int EDAD_DEFECTO = 18;

	private String nombre;
	private int edad;

	// CONSTRUCTORES
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {

		this.nombre = NOMBRE_DEFECTO;
		this.edad = EDAD_DEFECTO;
	}

	// GETTERS
	public static String getNombreDefecto() {
		return NOMBRE_DEFECTO;
	}

	public static int getEdadDefecto() {
		return EDAD_DEFECTO;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	// SETTERS

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// METODOS
	

	// TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
