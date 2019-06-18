package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double rt = population*growthRate;
		rt += population/2;
		return rt;
	}

}
