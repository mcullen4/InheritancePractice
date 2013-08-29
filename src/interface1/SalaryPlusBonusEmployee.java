/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;


public class SalaryPlusBonusEmployee extends SalariedEmployee {
   private int bonus;


    public SalaryPlusBonusEmployee(int annualSalary, int bonus) {
        super(annualSalary);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
     public double weeklyPay(){
        double weeklyPay;
        weeklyPay=(annualSalary+bonus)/52.0;
        return weeklyPay;
    } 
}
