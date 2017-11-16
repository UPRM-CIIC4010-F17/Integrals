
public class Integrator {

	public double integrate(Integrable f, double a, double b, long n) {
		
		double deltaX = (b-a) / n;
		double xi = a;
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			double avgHeight = (f.eval(xi) + f.eval(xi + deltaX)) / 2.0;
			double nextArea = deltaX * avgHeight;
			sum += nextArea;
			xi += deltaX;
		}
		return sum;
	}
	
}
