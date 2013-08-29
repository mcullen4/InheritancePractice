
package interface1;


public class SalariedEmployee extends Employee {
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
    
   @Override
    public double weeklyPay(){
        double weeklyPay;
        weeklyPay=(annualSalary/52.0);
        return weeklyPay;
    }  
}
