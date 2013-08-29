/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;


public class Employee implements EmployeeInterface {
    
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String department;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    

    @Override
    public double weeklyPay() {
        return 0;
    }
    
}
