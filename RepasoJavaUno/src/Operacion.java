
public class Operacion {
	
	public Persona generarImc(Persona per) {
		
		per.setImc((per.getPeso() / per.getAltura())*(per.getAltura()));
		
		return per;
		
	}

}
