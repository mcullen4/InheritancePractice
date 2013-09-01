
package abstract1;


public class SalaryPlusBonusEmployee extends SalariedEmployee {

    private int bonus;

    public SalaryPlusBonusEmployee(String lName, String fName, String dept, int ID) {
        super(lName, fName, dept, ID);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    
    @Override
    public double weeklyPay() {
     double weeklyPay;
        weeklyPay=(getAnnualSalary()+bonus)/52.0;
        return weeklyPay;   
    }
}
