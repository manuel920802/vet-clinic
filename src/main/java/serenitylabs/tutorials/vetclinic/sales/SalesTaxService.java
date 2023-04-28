package serenitylabs.tutorials.vetclinic.sales;

import serenitylabs.tutorials.vetclinic.sales.model.LineItem;
import serenitylabs.tutorials.vetclinic.sales.model.ProductCategory;
import serenitylabs.tutorials.vetclinic.sales.model.SalesTax;

import java.util.HashMap;
import java.util.Map;

import static serenitylabs.tutorials.vetclinic.sales.model.ProductCategory.*;

public class SalesTaxService {

    public SalesTax salesTaxEntryFor(LineItem item){

        TaxRate applicableTaxRate = taxRateFor(item);

        return SalesTax.atRateOf(applicableTaxRate.getRate())
                .withName(applicableTaxRate.getName())
                .forAmountOf(item.getTotal() * applicableTaxRate.getRate());
    }

    private static Map<ProductCategory, TaxRateCalculator> CALCULATOR_PER_PRODUCT = new HashMap<ProductCategory, TaxRateCalculator>();

    static {
        CALCULATOR_PER_PRODUCT.put(SNACKS, new ReducedRateCalculator());
        CALCULATOR_PER_PRODUCT.put(SOFTDRINKS, new ReducedRateCalculator());
        CALCULATOR_PER_PRODUCT.put(BOOKS, new ZeroRateCalculator());
        CALCULATOR_PER_PRODUCT.put(MEDICINE, new ZeroRateCalculator());
    }

    private TaxRate taxRateFor(LineItem item){
        return CALCULATOR_PER_PRODUCT
                .getOrDefault(item.getCategory(), new StandardRateCalculator())
                .rateFor(item);
    }
}
