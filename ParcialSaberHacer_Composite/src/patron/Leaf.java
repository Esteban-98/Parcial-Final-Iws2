package patron;

public class Leaf extends Component {

	public Leaf(String plantaPersonal) {
		super(plantaPersonal);
		
	}

	@Override
	public void view(int level) {
		
		System.out.println( plantaPersonal);
		
	}

	

	@Override
	public void obtenerMax() {
		maximoC("");
		
	}

	@Override
	public void maximoC(String maximoC) {
		if(maximoC.length()>plantaPersonal.length()) {
			System.out.println("Planta -> "+ maximoC+"  Nº Caracteres -> "+maximoC.length());
		}
		else {
			System.out.println("Planta -> "+ plantaPersonal +"  Nº caracteres-> "+plantaPersonal.length());
		}
		
	}

	



	
	
	
	  
	
}
