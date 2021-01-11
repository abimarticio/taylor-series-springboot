package api.taylor.model;
import java.lang.Math;


public class Sine extends TaylorSeries {
	 public double computeSeries(double x, double numTerms) {
	        double approximation = 0;
	        for (int i = 0; i < numTerms; i++) {
	            double numerator = Math.pow(x, i);
	            double denominator = factorial(i);
	            approximation += (numerator / denominator);
	        }
	        return approximation;
	    }
}