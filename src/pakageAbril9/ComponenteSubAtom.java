package pakageAbril9;

abstract public class ComponenteSubAtom {

	public enum Ubicacion {
		NUCLEO, NUBE_ELECTRONICA
	}

	public static final int CARGA_DEFECTO = 1;
	public static final Ubicacion UBICACION_DEFECTO = Ubicacion.NUCLEO;
	public static final int MASA_DEFECTO = 1;
	public static final String DESCRIPCION_DEFECTO = "Descripcion del elemento por defecto(PROTON)";

	protected int carga;
	protected Ubicacion ubicacion;
	protected double masa;
	protected String descripcion;

	// Constructor
	public ComponenteSubAtom(int carga, Ubicacion ubicacion, double masa) throws IllegalArgumentException {
		if (carga != 1 && carga != 0 && carga != -1) {
			throw new IllegalArgumentException("La carga debe ser 1, 0 o -1");

		}
		if (ubicacion != Ubicacion.NUCLEO && ubicacion != Ubicacion.NUBE_ELECTRONICA) {
			throw new IllegalArgumentException("Introduzca: NUCLEO o REDEDOR");

		}
		if (carga == -1 && ubicacion.equals(Ubicacion.NUCLEO)) {
			throw new IllegalArgumentException("Un elemento de carga -1 (ELECTRON) no puede estar en nucleo ");

		}

		this.carga = carga;
		this.ubicacion = ubicacion;
		this.masa = masa;
		this.descripcion = DESCRIPCION_DEFECTO;
	}

	public ComponenteSubAtom(int carga) throws IllegalArgumentException {
		if (carga != 1 && carga != 0 && carga != -1) {
			throw new IllegalArgumentException("La carga debe ser 1, 0 o -1");
		}

		this.carga = carga;

		if (carga == 1) {
			this.ubicacion = Ubicacion.NUCLEO;
			this.masa = 1;
			this.descripcion = "Es un PROTON: Determina el número atómico y la identidad del elemento";
		}
		if (carga == 0) {
			this.ubicacion = Ubicacion.NUCLEO;
			this.masa = 1;
			this.descripcion = "Es un NEUTRON: Aporta estabilidad al núcleo; los isótopos de un mismo elemento tienen distinto número de neutrones.";

		}
		if (carga == -1) {
			this.ubicacion = Ubicacion.NUBE_ELECTRONICA;
			this.masa = 0.00054858;
			this.descripcion = "Es un ELECTRON: Responsable de las reacciones químicas y los enlaces entre átomos.";
		}

	}

	public ComponenteSubAtom() {
		this.carga = CARGA_DEFECTO;
		this.ubicacion = UBICACION_DEFECTO;
		this.masa = MASA_DEFECTO;
		this.descripcion = "Es un PROTON(por defecto): Determina el número atómico y la identidad del elemento";

	}

	// GETTERS
	public static int getCargaDefecto() {
		return CARGA_DEFECTO;
	}

	public static Ubicacion getUbicacionDefecto() {
		return UBICACION_DEFECTO;
	}

	public static int getMasaDefecto() {
		return MASA_DEFECTO;
	}

	public static String getDescripcionDefecto() {
		return DESCRIPCION_DEFECTO;
	}

	public int getCarga() {
		return carga;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public double getMasa() {
		return masa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// SETTERS
	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//TO STRING
	@Override
	public String toString() {
		return "ComponenteSubAtom [carga=" + carga + ", ubicacion=" + ubicacion + ", masa=" + masa + ", descripcion="
				+ descripcion + "]";
	}

}
