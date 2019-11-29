package patron;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;


public class Composite extends Component{

	public Composite(String plantaPersonal) {
		super(plantaPersonal);

	}

	private List<Component> plantaP = new ArrayList<>();

	public void addPlanta(Component p) {
		this.plantaP.add(p);
	}

	public boolean removePlanta(Component p) {
		return this.plantaP.remove(p);
	}
	
	@Override
	public void view(int level) {
		System.out.println(plantaPersonal + "     //Nodo nivel: " + level);
		for (Component componente : plantaP) {
			componente.view(level+1);
			System.out.println(" ");
		}

	}

	@Override
	public void obtenerMax() {
		maximoC("");
		
	}

	@Override
	public void maximoC(String maximoC) {
		
		for(Component h : plantaP) {
			if(maximoC.length()>plantaPersonal.length()) {
				h.maximoC(maximoC);
			}
			else {
				h.maximoC(plantaPersonal);
			}
			
		}
		
	}

	


	
	
	
	
	

}