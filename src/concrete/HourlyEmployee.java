/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;


public class HourlyEmployee extends Employee {
    
    private double hourlyWage;

    public HourlyEmployee() {
        super();
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    
}
