
public class Main {

	public static void main (String[] args) {
		
//		int n = 10000;
//		double a = 0;
//		double b = 10;
		
		Integrator integrator = new Integrator();

		System.out.println("Total area= " + integrator.integrate(0, 10, 10000));
 		
	}
	
}
