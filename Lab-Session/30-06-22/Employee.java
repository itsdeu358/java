package corejava;

public class Employee {
	private long employeeId,employeephone; 
    private String employeeName,employeeAddress; 
    private double basicSalary,specialAllowance,Hra;
//method
    Employee() 
    {
        employeeId = 0; 
        employeephone = 0; 
        employeeName = ""; 
        employeeAddress=""; 
        basicSalary=0.0; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    } 
 //declaring variable
    Employee(long id,String n,String a,long p,double s) 
    {
        employeeId = id; 
        employeephone = p; 
        employeeName = n; 
        employeeAddress=a; 
        basicSalary=s; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    }
//get method to get salary
    public double getBasicSalary()
    {
        return basicSalary;
    }
//calculating salary
    public double calculateSalary()
    {
        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
        return salary;
    }
//calculating transport allowance
    public double calculateTransportAllowance()
    {
        return 0.01*basicSalary;
    }
}
//extending class to print variable
class Manager extends Employee
{
    Manager(long id,String n,String a,long p,double s) 
    { 
        super(id,n,a,p,s);
    }
    
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getBasicSalary();
    } 
}

 