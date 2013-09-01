
package abstract1;


public class SalariedEmployee extends Employee {

    private int annualSalary;

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
        weeklyPay=(annualSalary/52.0);
        return weeklyPay;   
    }
}
