package taxes;

public class TaxSystemUsnIncome extends TaxSystem {
    final int TAXRATE = 6;

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = ((debit * TAXRATE) / 100);
        return tax;
    }
}
