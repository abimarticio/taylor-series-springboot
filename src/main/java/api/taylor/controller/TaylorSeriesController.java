package api.taylor.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.taylor.model.TaylorSeries;
import api.taylor.model.Cosine;
import api.taylor.model.Exponential;
import api.taylor.model.Sine;


@RestController
public class TaylorSeriesController {
	@GetMapping("/taylor-series/cosine")
	public double cosine(@RequestParam Map<String,String> requestParameters) {
		double numTerms = Double.valueOf(requestParameters.get("numTerms"));
		double value = Double.valueOf(requestParameters.get("value"));
		TaylorSeries cos = new Cosine();
		double computedValue = cos.computeSeries(value, numTerms);
		return computedValue;
	}
	
	@GetMapping("/taylor-series/sine")
	public double sine(@RequestParam Map<String,String> requestParameters) {
		double numTerms = Double.valueOf(requestParameters.get("numTerms"));
		double value = Double.valueOf(requestParameters.get("value"));
		TaylorSeries sin = new Sine();
		double computedValue = sin.computeSeries(value, numTerms);
		return computedValue;
	}
	
	@GetMapping("/taylor-series/exponential")
	public double exponential(@RequestParam Map<String,String> requestParameters) {
		double numTerms = Double.valueOf(requestParameters.get("numTerms"));
		double value = Double.valueOf(requestParameters.get("value"));
		TaylorSeries exp = new Exponential();
		double computedValue = exp.computeSeries(value, numTerms);
		return computedValue;
	}
}
