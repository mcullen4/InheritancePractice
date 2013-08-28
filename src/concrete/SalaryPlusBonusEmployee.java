/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;


public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private int bonus;

    public SalaryPlusBonusEmployee() {
        super();
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    
}
