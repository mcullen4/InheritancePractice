/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

import java.util.Scanner;

/**
 *
 * @author Michele
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idNumber;
        String input;
        String fName;
        String lName;
        String dept;
        int typeEmployee;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter Employee ID Number");
        idNumber=keyboard.nextInt();
       
        System.out.println("Enter Employee First Name");
        fName=keyboard.next();
      
        System.out.println("Enter Employee Last Name");
        lName=keyboard.next();
        
        System.out.println("Enter department");
        dept=keyboard.next();
        
        
        
        do{
        System.out.println("Enter the number of the type of employee -"
                + " 1=Hourly,2=Salary,3=Salary with Bonus");
        typeEmployee=keyboard.nextInt();
        }while(typeEmployee < 1 || typeEmployee>3);
        
        if(typeEmployee==1){
            double hours;
            double hrWage;
            System.out.println("What is the hourly wage?");
            hrWage=keyboard.nextDouble();
            System.out.println("How many hours worked this week?");
            hours=keyboard.nextDouble();
            HourlyEmployee e1 = new HourlyEmployee(lName,fName,dept,idNumber);
            e1.setHourlyWage(hrWage);
            e1.setHoursWorked(hours);
            System.out.println("The weekly pay for "+ e1.getFirstName() + " "
                    + e1.getLastName()+" is "+ e1.weeklyPay()+".");
        }
        else if(typeEmployee==2){
            int yrSalary;
            System.out.println("What is the annual salary?");
            yrSalary=keyboard.nextInt();
            SalariedEmployee e1 = new SalariedEmployee(lName,fName,dept,idNumber);
            e1.setAnnualSalary(yrSalary);
            System.out.println("The weekly pay for "+ e1.getFirstName() + " "
                    + e1.getLastName()+" is "+ e1.weeklyPay()+".");
        }
        else{
            int yrSalary;
            int bonus;
            System.out.println("What is the annual salary?");
            yrSalary=keyboard.nextInt();
            System.out.println("What is the annual bonus?");
            bonus=keyboard.nextInt();
            SalaryPlusBonusEmployee e1 = new SalaryPlusBonusEmployee(lName,fName
                    ,dept,idNumber);
            e1.setAnnualSalary(yrSalary);
            e1.setBonus(bonus);
            System.out.println("The weekly pay for "+ e1.getFirstName() + " "
                    + e1.getLastName()+" is "+ e1.weeklyPay()+".");
        }
        
        
        
       
    } 
    }
