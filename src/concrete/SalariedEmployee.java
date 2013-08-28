/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;


public class SalariedEmployee extends Employee {
    
    /**
     *
     */
    protected int annualSalary;

    public SalariedEmployee(int annualSalary) {
        super();
        this.annualSalary=annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public double weeklyPay(){
        double weeklyPay;
        weeklyPay=annualSalary/52;
        return weeklyPay;
    }
}
