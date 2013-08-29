
package abstract1;

/**
 *
 * @author Michele
 */
public abstract class Employee {
    
    private String lastName;
    private String firstName;
    private String department;
    private int employeeID;
    
    
    public Employee(String lName, String fName,String dept,int ID){
        
    lastName=lName;
    firstName=fName;
    department=dept;
    employeeID=ID;
    
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
       
    public abstract double weeklyPay();
}
