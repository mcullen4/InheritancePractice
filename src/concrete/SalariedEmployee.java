/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;


public class SalariedEmployee extends Employee {
    
    private int annualSalary;

    public SalariedEmployee() {
        super();
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
}
