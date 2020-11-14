package api.taylor.model;

public class TaylorSeries {
	
	static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }
}

class Cosine extends TaylorSeries {
	
    static double computeSeries(double x, double numTerms) {
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

class Exponential extends TaylorSeries {
	
    static double computeSeries(double x, double numTerms) {
        double approximation = 0;
        for (int i = 0; i < numTerms; i++) {
            double numerator = Math.pow(x, i);
            double denominator = factorial(i);
            approximation += (numerator / denominator);
        }
        return approximation;
    }
}