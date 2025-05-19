import taxes.TaxSystem;

public class Company {
    private  String title;
    private int debit;
    private  int credit;
    private TaxSystem taxSystem;

    public Company(String title, taxes.TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;

    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {

        if (amount > 0) {
            debit = debit + amount;
        }
        if (amount < 0) {
            credit = credit + Math.abs(amount);
        }

    }

    public void payTaxes() {
        int taxPaid = taxSystem.calcTaxFor(debit, credit);
        System.out.println(" Компания " + this.title + " уплатила налог в размере " + taxPaid + " руб.");
        debit = 0;
        credit = 0;

    }
}

