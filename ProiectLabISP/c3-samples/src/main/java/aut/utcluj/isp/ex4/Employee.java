package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Employee implements IdentityManager {
    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee(String firstName, String lastName, String cnp, Double monthlyRevenue) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        try {
            this.employeeSalaryInfo = new SalaryInfo(monthlyRevenue);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    /**
     * Add salary to the employee
     */
    public void addSalary() {
        this.employeeSalaryInfo.addSalary();
    }

    /**
     * Add money as bonus to the employee
     * Value added should be positive
     *
     * @param money - money to be added
     */
    public void addMoney(final Double money) {
        try {
            this.employeeSalaryInfo.addMoney(money);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Pay tax from salary
     *
     * @param tax - tax to be paid
     */
    public void payTax(final Double tax) {
        try {
            this.employeeSalaryInfo.payTax(tax);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Get salary info
     *
     * @return salary info
     */
    public SalaryInfo getSalaryInfo() {
        return this.employeeSalaryInfo;
    }

    @Override
    public String getIdentity() {
        return this.firstName + "_" + this.lastName + "_" + this.cnp;
    }
    
      public static void main(String[] args)
  {
     EmployeeControllerrJFrame j1 = new EmployeeControllerrJFrame("Jhonny","Bravo","123456321",123.00);
     j1.setVisible(true);
     
     EmployeeControllerrJFrame j2 = new EmployeeControllerrJFrame("Soyey","Lamue","123456321",123.00);
     j2.setVisible(true);
   }
   
}
