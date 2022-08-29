import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("ingre el nombre de la persona");
		p.setNombre(sc.next());
		
		System.out.println("ingre el nombre de la persona");
		p.setAltura(sc.nextDouble());
		
		System.out.println("ingre el nombre de la persona");
		p.setPeso(sc.nextDouble());
		
		Operacion o = new Operacion();
		p = o.generarImc(p);
		System.out.println("el imc de la persona es : " + p.getImc());
		
		
		
	}

}
