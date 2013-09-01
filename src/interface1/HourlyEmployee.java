/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;


public class HourlyEmployee extends Employee {
  private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(double hoursWorked, double hourlyWage) {
        super();
        this.hoursWorked=hoursWorked;
        this.hourlyWage=hourlyWage;
        
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
  @Override
    public double weeklyPay(){
        double weeklyPay;
        if (hoursWorked<=40){
        weeklyPay = hourlyWage*hoursWorked;
        }
        else{
        weeklyPay = (hourlyWage*40)+((hourlyWage*OVERTIME_RATE)*(hoursWorked-40));
        }
    return weeklyPay;
    }  
}
