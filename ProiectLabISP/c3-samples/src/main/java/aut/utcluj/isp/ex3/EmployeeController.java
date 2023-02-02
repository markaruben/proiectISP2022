package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {
    private List<Employee> employeeList = new ArrayList<Employee>();
    /**
     * Add new employee to the list of employees
     *
     * @param employee - employee information
     */
    public void addEmployee(final Employee employee){
        if(this.employeeList.contains(employee)){
            System.out.println("Employee already exists!");
        }
        else
        {
            this.employeeList.add(employee);
        }
    }

    /**
     * Get employee by cnp
     *
     * @param cnp - unique cnp
     * @return found employee or null if not found
     */
    public Employee getEmployeeByCnp(final String cnp) {
        for(Employee e : this.employeeList){
            if(cnp.equals(e.getCnp())){
                return e;
            }

        }
        return null;
    }

    /**
     * Update employee salary by cnp
     *
     * @param cnp    - unique cnp
     * @param salary - salary
     * @return updated employee
     */
    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
      for(Employee e : this.employeeList){
          if(cnp.equals(e.getCnp())){
              e.setSalary(salary);
              return e;
          }
      }
      return null;
    }

    /**
     * Delete employee by cnp
     *
     * @param cnp - unique cnp
     * @return deleted employee or null if not found
     */
    public Employee deleteEmployeeByCnp(final String cnp) {
        Employee employee=new Employee();
        employee=null;
        for(Employee e : this.employeeList)
        {
            if(cnp.equals(e.getCnp())){
                employee=e;
                this.employeeList.remove(e);
            }
        }
        return employee;
    }

    /**
     * Return current list of employees
     *
     * @return current list of employees
     */
    public List<Employee> getEmployees() {
        return this.employeeList;
    }

    /**
     * Get number of employees
     *
     * @return - number of registered employees
     */
    public int getNumberOfEmployees() {
        return this.employeeList.size();
    }
}