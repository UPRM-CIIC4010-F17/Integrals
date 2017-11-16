
public class Main {

	public static void main (String[] args) {
		
		int n = 10000;
		double a = 0;
		double b = 10;
		double deltaX = (b-a) / n;
		double xi = a;
		
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			double avgHeight = ((xi * xi) + (xi + deltaX) * (xi + deltaX)) / 2.0;
			double nextArea = deltaX * avgHeight;
			sum += nextArea;
			xi += deltaX;
		}
		
		System.out.println("Total area= " + sum);
 		
		
	}
	
}
