public class BudgetCalculator {

    public static final double SALARY = 3000.0;
    public static final double SAVINGS_PERCENT = 0.20;
    public static final double RENT_PERCENT = 0.30;
    public static final double GROCERIES_PERCENT = 0.15;
    public static final double ENTERTAINMENT_PERCENT = 0.10;

    public static void main(String[] args) {
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;

        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;

        System.out.println("=== Monthly Budget Summary ===");
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved (20%): $" + savedAmount);
        System.out.println("Rent (30%): $" + rentAmount);
        System.out.println("Groceries (15%): $" + groceriesAmount);
        System.out.println("Entertainment (10%): $" + entertainmentAmount);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}
