package MyMa;

public interface carInterface {
    /*
        Create 4 int variables variables

            hyundaiMinIncome with value 100000

            toyotaMinIncome with value 80000

            bmwMinIncome with value 110000

            documentationFees with value 1000

            Create two methods -->

             1) return type is String ,  no parameter  ,,, name is ---> leaseMonthlyCalculator

             2) return type is boolean ,  no parameter ,,, name is ---> isAligable

     */
    int hyundaiMinIncome = 100000;
    int toyotaMinIncome = 80000;
    int bmwMinIncome = 110000;
    int documentationFees = 1000;

   String leaseMonthlyCalculator();
    boolean isAligable();

}
