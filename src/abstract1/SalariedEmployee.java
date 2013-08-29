/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;


public class SalariedEmployee extends Employee {

    protected int annualSalary;

    public SalariedEmployee(String lName, String fName, String dept, int ID) {
        super(lName, fName, dept, ID);
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
    @Override
    public double weeklyPay() {
     double weeklyPay;
        weeklyPay=(annualSalary/52);
        return weeklyPay;   
    }
}
