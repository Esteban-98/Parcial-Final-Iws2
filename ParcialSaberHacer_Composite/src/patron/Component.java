package patron;



public  abstract class Component {
	
	
	protected String plantaPersonal;

	public Component(String plantaPersonal) {
		
		this.plantaPersonal = plantaPersonal;
	}

	

	public String getPlantaPersonal() {
		return plantaPersonal;
	}

	public void setPlantaPersonal(String plantaPersonal) {
		this.plantaPersonal = plantaPersonal;
	}
	
	abstract public void view(int level );
	
    abstract public void obtenerMax();
    abstract public void maximoC(String maximoC);
	//abstract public int Maximo(Component level, int indice);
	
	
	
	
	//public String operation() 

}
