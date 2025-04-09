package pakageAbril9;

public class Proton extends ComponenteSubAtom {
	
	//ATTO
	private final static boolean ESESTABLE=true;

	
	//CONSTRUCTOR
	public Proton(int carga, Ubicacion ubicacion, double masa) throws IllegalArgumentException {
		super();
		this.carga=+1;
		this.ubicacion=Ubicacion.NUCLEO;
		this.masa=1;
	}
	
	public Proton(){
		super();
		this.carga=+1;
		this.ubicacion=Ubicacion.NUCLEO;
		this.masa=1;
	}
	

}
