
public class Main {

	public static void main (String[] args) {
		
//		int n = 10000;
//		double a = 0;
//		double b = 10;
		
		Integrator integrator = new Integrator();
		
		Integrable square = new Integrable() {
			double eval(double x) {
				return x*x;
			}
		};
		
		Integrable cube = new Integrable() {
			double eval(double x) {
				return x*x*x;
			}
		};

		System.out.println("Total area square = " + integrator.integrate(square, 0, 10, 10000));
		System.out.println("Total area cube = " + integrator.integrate(cube, 0, 10, 10000));
 		
	}
	
}
