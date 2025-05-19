import taxes.TaxSystemUsnIncomeSpent;

import java.util.Scanner;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        taxes.TaxSystem taxSystem = new taxes.TaxSystem();
        taxes.TaxSystem taxesSystem1 = new taxes.TaxSystemUsnIncome();
        taxes.TaxSystem taxesSystem2 = new TaxSystemUsnIncomeSpent();
        String companyTitle = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название компании:");
        companyTitle = scanner.nextLine();
        Company company = new Company(companyTitle, taxSystem);
        System.out.println("Выберите систему налогообложения.");
        System.out.println("1. УСН доходы — налог 6% от доходов;");
        System.out.println("2. УСН доходы минус расходы — налог 15% от разницы доходов и расходов.");
        String input = scanner.nextLine();
        int operation = Integer.parseInt(input);
        switch (operation) {
            case 1:
                company.setTaxSystem(taxesSystem1);
                break;
            case 2:
                company.setTaxSystem(taxesSystem2);
                break;
        }

        while (true) {

            System.out.println("Введите обороты компании (обороты можно вводить несколько раз) по завершении введите end");
            input = scanner.nextLine();
            if (input.equals("end")) break;
            company.shiftMoney(Integer.parseInt(input));


        }
        company.payTaxes();
    }
}
