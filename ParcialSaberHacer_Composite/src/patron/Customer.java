package patron;

public class Customer {

	public static void main(String[] args) {

		Composite level1 = new Composite("Despacho del Miniterio de Educacion");

		Leaf hoja0 = new Leaf("Oficina de Cooperacion y Asuntos internacionales");
		Leaf hoja1 = new Leaf("Oficina Asesora de Comunicaciones");
		Leaf hoja2 = new Leaf("Oficina asesora juridica");
		Leaf hoja3 = new Leaf("Oficina de Control interno"); 
		Leaf hoja4 = new Leaf("Oficina Asesora de Planeacion y Finanzas");
		Leaf hoja5 = new Leaf("Oficina de Tecnologia y Sistemas de Informacion");
		Leaf hoja6 = new Leaf("Oficina de Inovacion Educativa con Uso de Nuevas tecnologias");
		
		level1.addPlanta(hoja0);
		level1.addPlanta(hoja1);
		level1.addPlanta(hoja2);
		level1.addPlanta(hoja3);
		level1.addPlanta(hoja4);
		level1.addPlanta(hoja5);
		level1.addPlanta(hoja6);
		
		Composite level2P0 = new Composite("Viceministerio de Educacion PBM");
		Composite level2P1 = new Composite("Viceministerio de Educacion Superior");
		Composite level2P2 = new Composite("Secretaria General");
		
		level1.addPlanta(level2P0);
		level1.addPlanta(level2P1);
		level1.addPlanta(level2P2);
		
		Composite level3P0 = new Composite("Direccion de Calidad para la Educacion PBM");
		Composite level3P1 = new Composite("Direccion de fortalecimineto a la gestion territorial");
		Composite level3P2 = new Composite("Direccion de cobertura y Equidad");
		Composite level3P3 = new Composite("Direccion de Primera Infancia");
		
		level2P0.addPlanta(level3P0);
		level2P0.addPlanta(level3P1);
		level2P0.addPlanta(level3P2);
		level2P0.addPlanta(level3P3);
		
		Composite level31P0 = new Composite("Direccion de la Calidad para la ES");
		Composite level31P1 = new Composite("Direccion de Fomento de la Educacion Superior");
		
		level2P1.addPlanta(level31P0);
		level2P1.addPlanta(level31P1);
		
		Leaf hojaL2 = new Leaf("Unidad de Atencion al Usuario");
		Leaf hoja1L2 = new Leaf("Subdireccion de Gestion Finaciera");
		Leaf hoja2L2 = new Leaf("Subdireccion de Desarrollo Organizacional");
		Leaf hoja3L2 = new Leaf("Subdireccion de talento Humano");
		Leaf hoja4L2 = new Leaf("Subdireccion de Contratacion");
		Leaf hoja5L2 = new Leaf("Subdireccion de gestion Administrativa");
		
		level2P2.addPlanta(hojaL2);
		level2P2.addPlanta(hoja1L2);
		level2P2.addPlanta(hoja2L2);
		level2P2.addPlanta(hoja3L2);
		level2P2.addPlanta(hoja4L2);
		level2P2.addPlanta(hoja5L2);
		
		//level 4
		Composite level4P0 = new Composite("SubD. de Referentes y Evaluacion de la Calidad Educativa");
		level3P0.addPlanta(level4P0);
		
		Composite level4P1 = new Composite("SubD. de Monitireso y Control");
		level3P1.addPlanta(level4P1);
		
		Composite level4P2 = new Composite("SuD. de Acceso");
		level3P2.addPlanta(level4P2);
		
		Composite level4P3 = new Composite("SubD. de Cobertura de P.I");
		level3P3.addPlanta(level4P3);
		
		Composite level41P0 = new Composite("SudD. de Aseguramiento de la Calidad de la ES ");
		level31P0.addPlanta(level41P0);
		
		Composite level41P1 = new Composite("SubD. de Apoyo a la gestion de las IES");
		level31P1.addPlanta(level41P1);
		
		//level 5
		Leaf hoja1L4 = new Leaf("SubD. de Fomento de Competencias");
		level4P0.addPlanta(hoja1L4);
		
		Composite level5P1 = new Composite("SubD. de Fortalecimineto Institucional");
		level4P1.addPlanta(level5P1);
		
		Leaf hoja2L4 = new Leaf("SubD. de Permanencia");
		level4P2.addPlanta(hoja2L4);
		
		Leaf hoja3L4 = new Leaf("SubD. de Calidad de P.I");
		level4P3.addPlanta(hoja3L4);
		
		Leaf hoja4L4 = new Leaf("SubD. de Inspeccion y Vigilancia");
		level41P0.addPlanta(hoja4L4);
		
		Leaf hoja5L4 = new Leaf("SubD. de Desarrollo Sectorial");
		level41P1.addPlanta(hoja5L4);
		
		//level 6
		Leaf hojaL5 = new Leaf("SubD. de Recursos Humanos del Sector Educativo");
		level5P1.addPlanta(hojaL5);

		level1.view(1);
		
		
		
		
		System.out.println("==========****** Mayor Numero de caracteres ******==========");
		
		hoja6.obtenerMax();
	
		

						


	}

}
