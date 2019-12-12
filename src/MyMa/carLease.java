package MyMa;

public abstract class carLease {

    String name;
    String whichModel;

    int age;
    int salary;
    int totalCost;
    int downPayment;
    int termofLease;
    int leaseFee;
    int depractionAmount;

    double taxRate;
    double moneyFactor;
    double interestAmount;

    public carLease(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        this.name = name;
        this.whichModel = whichModel;
        this.age = age;
        this.salary = salary;
        this.totalCost = totalCost;
        this.downPayment = downPayment;
        this.termofLease = termofLease;
        this.leaseFee = leaseFee;
        this.taxRate = taxRate;
        this.moneyFactor = moneyFactor;
        depractionAmount  = calculateDepreciation();
        interestAmount = calculateInterest();
    }

    public int calculateDepreciation() {
        return (totalCost - downPayment) / termofLease;
    }

    public double calculateInterest() {
        return (totalCost + downPayment) * moneyFactor;
    }

    public double taxes() {
        return depractionAmount + interestAmount * taxRate;
    }

    public int getSalary() {
        return salary;
    }
}
