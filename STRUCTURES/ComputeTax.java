public class ComputeTax {

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;

        if (status == 0) { 
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 835 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 4675 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 16750 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 41754 + (taxableIncome - 171550) * 0.33;
            else
                tax = 108216 + (taxableIncome - 372950) * 0.35;

        } else if (status == 1) { 
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 1670 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137050)
                tax = 9350 + (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                tax = 26637.5 + (taxableIncome - 137050) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 46741.5 + (taxableIncome - 208850) * 0.33;
            else
                tax = 100894.5 + (taxableIncome - 372950) * 0.35;

        } else if (status == 2) { 
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 835 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 4675 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                tax = 13318.75 + (taxableIncome - 68525) * 0.28;
            else if (taxableIncome <= 186475)
                tax = 23370.75 + (taxableIncome - 104425) * 0.33;
            else
                tax = 50447.25 + (taxableIncome - 186475) * 0.35;

        } else if (status == 3) { 
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 1195 + (taxableIncome - 11950) * 0.15;
            else if (taxableIncome <= 117450)
                tax = 6227.5 + (taxableIncome - 45500) * 0.25;
            else if (taxableIncome <= 190200)
                tax = 24215 + (taxableIncome - 117450) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 44585 + (taxableIncome - 190200) * 0.33;
            else
                tax = 104892.5 + (taxableIncome - 372950) * 0.35;
        }

        return tax;
    }

    public static void main(String[] args) {

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n",
                "Income", "Single", "Married Joint", "Married Sep", "Head of House");

        for (int income = 50000; income <= 70000; income += 100) {
            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f%-15.2f%n", income, computeTax(0, income), computeTax(1, income), computeTax(2, income), computeTax(3, income));
        }
    }
}
