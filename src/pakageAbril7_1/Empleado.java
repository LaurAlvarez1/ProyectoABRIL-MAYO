package pakageAbril7_1;

import java.util.Scanner;

public class Empleado {
	
	
	Scanner reader = new Scanner(System.in);

	// ATTOS
	public enum Puesto {
		TECNICO, GERENTE, PRACTICANTE
	}

	public final static String NOMBRE_DEFECTO = "nombre default";
	public final static Puesto PUESTO_DEFECTO = Puesto.TECNICO;
	public final static double SUELDO_DEFECTO = 1000;

	private String nombre;
	private Puesto puesto;
	private double sueldoBase;

	// CONSTRUCTOR

	public Empleado(String nombre, Puesto puesto, double sueldoBase) {

		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldoBase = sueldoBase;
		
	}

	public Empleado() {
		this.nombre = NOMBRE_DEFECTO;
		this.puesto = PUESTO_DEFECTO;
		this.sueldoBase = SUELDO_DEFECTO;
	}

	// GETTER
	public static String getNombreDefecto() {
		return NOMBRE_DEFECTO;
	}

	public static Puesto getPuestoDefecto() {
		return PUESTO_DEFECTO;
	}

	public static double getSueldoDefecto() {
		return SUELDO_DEFECTO;
	}

	public String getNombre() {
		return nombre;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}

	// SETTER
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	// METODOS
	
	public static Empleado crearEmpleado(Scanner reader) {
		
		reader.nextLine(); // limpiar buffer
		
		System.out.println("Nombre de nuevo Empleado: \n");
		String nombre=reader.next();
		
		System.out.println("Salario de nuevo Empleado: \n");
		double sueldo=reader.nextDouble();

		reader.nextLine(); // limpiar buffer
		
		System.out.println("Puesto de nuevo Empleado: \n(TECNICO, GERENTE, PRACTICANTE)\n");
		String puesto =reader.nextLine().toUpperCase();
		
		
		if(Puesto.GERENTE.toString().equalsIgnoreCase(puesto)) {
			
			//entiendo que por aqui debo poner un setter????
		}else if(Puesto.PRACTICANTE.toString().equalsIgnoreCase(puesto)) {
			
		}else if(Puesto.TECNICO.toString().equalsIgnoreCase(puesto)) {
			
		}else {
			
		}
		
		Empleado empleadoNuevo = new Empleado(nombre, puesto, sueldo);
		
		
		
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Epleado [nombre=" + nombre + ", puesto=" + puesto + ", sueldoBase=" + sueldoBase + "]";
	}


}
