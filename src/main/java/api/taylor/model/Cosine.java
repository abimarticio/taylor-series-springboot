package api.taylor.model;
import java.lang.Math;


public class Cosine extends TaylorSeries {
	 public double computeSeries(double x, double numTerms) {
	        x  = Math.toRadians(x);
	        double approximation = 0;
	        for (int i = 0; i < numTerms; i++) {
	            double coefficient = Math.pow((-1), i);
	            double numerator = Math.pow(x, (2 * i));
	            double denominator = factorial(2 * i);
	            approximation += (coefficient * (numerator / denominator));
	        }
	        return approximation;
	    } 
}