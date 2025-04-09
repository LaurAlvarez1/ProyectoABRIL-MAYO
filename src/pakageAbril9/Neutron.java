package pakageAbril9;


public class Neutron extends ComponenteSubAtom{
	
	
	private final static double VIDA_MEDIA_DEFECTO=880;
	private final static boolean ES_INESTABLE_DEFECTO=false;
	
	
	private boolean esInestableLibre;
	private double vidaMedia ;
	
	
	
	public Neutron(int carga, Ubicacion ubicacion, double masa, boolean esInestableLibre, double vidaMedia)
			throws IllegalArgumentException {
		super(carga, ubicacion, masa);
		this.esInestableLibre = esInestableLibre;
		this.vidaMedia = vidaMedia;
	}
	
	
	
	public Neutron(){
		super();
		
		this.carga=0;
		this.ubicacion=Ubicacion.NUCLEO;
		this.masa=1;
		
		this.esInestableLibre = ES_INESTABLE_DEFECTO;
		this.vidaMedia = VIDA_MEDIA_DEFECTO;
	}
	
		
	

	
	
}
