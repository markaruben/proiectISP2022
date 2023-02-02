package aut.utcluj.isp.ex4;

public class SalaryInfo {
    private Double totalRevenue;
    private Double monthlyRevenue;

    /**
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param monthlyRevenue
     */
    public SalaryInfo(Double monthlyRevenue) throws NegativeAmountException {
        if (monthlyRevenue < 0) {
            throw new NegativeAmountException();
        }
        this.totalRevenue = 0.0;
        this.monthlyRevenue = monthlyRevenue;
    }

    /**
     * Add incoming salary to total revenue
     */
    public void addSalary() {
        this.totalRevenue = this.totalRevenue + this.monthlyRevenue;
    }

    /**
     * Add certain amount of money as bonus
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param value - money to be added
     */
    public void addMoney(final Double value) throws NegativeAmountException {
        if (value < 0) {
            throw new NegativeAmountException();
        }
        this.totalRevenue = this.totalRevenue + value;
    }

    /**
     * Pay certain amount of money as tax
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     * If not enough revenue found, an {@link NegativeBalanceException } exception should be thrown
     *
     * @param value - value to be paid
     */
    public void payTax(final Double value) throws NegativeAmountException, NegativeBalanceException {
        if (value < 0) {
            throw new NegativeAmountException();
        } else if (value > this.totalRevenue) {
            throw new NegativeBalanceException();
        } else {
            this.totalRevenue = this.totalRevenue - value;
        }
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }
}
