package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double rt = population*growthRate;
		rt *= (growthRate*2);
		return rt;
	}

}
