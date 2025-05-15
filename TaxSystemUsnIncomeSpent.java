package taxes;

public class TaxSystemUsnIncomeSpent extends TaxSystem {
    final int TAXRATE = 15;

    @Override
    public int calcTaxFor(int debet, int credit) {
        int tax = (((credit - debet) * TAXRATE) / 100);
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
