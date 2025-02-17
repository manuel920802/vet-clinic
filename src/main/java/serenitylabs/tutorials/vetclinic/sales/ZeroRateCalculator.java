package serenitylabs.tutorials.vetclinic.sales;

import serenitylabs.tutorials.vetclinic.sales.model.LineItem;

public class ZeroRateCalculator implements TaxRateCalculator {
    @Override
    public TaxRate rateFor(LineItem item) {
        return new TaxRate(0.0, "Zero");
    }
}
