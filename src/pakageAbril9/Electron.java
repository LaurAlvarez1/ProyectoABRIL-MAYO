package pakageAbril9;

import pakageAbril9.ComponenteSubAtom.Ubicacion;

public class Electron extends ComponenteSubAtom {

	//

	protected static int contadorElectron = 1;
	
	private int nivelEnergia;// la orbita (1+cerca. cuanto mas mayor mas lejos)
	private String spin;// +1/2 o -1/2
	private String orbital;// s o p

	public Electron(int carga, Ubicacion ubicacion, double masa, int nivelEnergia, String spin, String orbital)
			throws IllegalArgumentException {
		super(carga, ubicacion, masa);
		this.nivelEnergia = nivelEnergia;
		this.spin = spin;
		this.orbital = orbital;
	}

	public Electron(int carga) {
		super(carga);

		this.nivelEnergia = 1;
		this.spin = spin;
		this.orbital = orbital;
		contadorElectron++;

	}

	public Electron() {
		super();

		this.nivelEnergia = nivelEnergia;
		this.spin = spin;
		this.orbital = orbital;
	}

	public Electron(){
		super();
		
		this.carga=-1;
		this.ubicacion=Ubicacion.NUBE_ELECTRONICA;
		this.masa= 0.00054858;
		
		this.nivelEnergia=;
		this.spin=;
		this.orbital=;

		contadorElectron++;
	}

}
