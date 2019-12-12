package MyMa;

import java.text.DecimalFormat;

public class BMW extends carLease implements carInterface {
    public BMW(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, taxRate, moneyFactor);
    }

    @Override
    public String leaseMonthlyCalculator() {
        double result = calculateDepreciation() + calculateInterest() + taxes();
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(result);
    }

    @Override
    public boolean isAligable() {
        if (getSalary() > bmwMinIncome) {
            return true;
        } else
            return false;
    }

    public String totalCalculator() {
        double result = ((Double.valueOf(leaseMonthlyCalculator()) * termofLease) + documentationFees);
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(result);
    }

}



