package api.taylor.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.taylor.model.TaylorSeries;


@RestController
public class TaylorSeriesController {
	@GetMapping("/taylor-series/cosine")
	public Double cosine(@RequestParam Map<Double,Double> requestParameters) {
		double numTerms = Double.valueOf(requestParameters.get("numTerms"));
		double value = Double.valueOf(requestParameters.get("value"));
		TaylorSeries cos = new Cosine();
		double computedValue = cos.computeSeries(value, numTerms);
		return computedValue;
	}
}
