package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String cnp;

    public Employee(String firstName, String lastName, Double salary, String cnp) {
        this.cnp=cnp;
        this.salary=salary;
        this.firstName=firstName;
        this.lastName=lastName;
    }
public Employee(){


}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCnp() {
        return cnp;
    }
<<<<<<< HEAD
}
=======

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
>>>>>>> 7389fa48187c09ed0fc714cbc0a1cd0497f5d70b
