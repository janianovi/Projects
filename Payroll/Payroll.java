import java.util.ArrayList;

/**
 * The Payroll class constructs an ArrayList of Students and calculates the income, federal tax, social security tax, 
 * and the final amount for each employee. 
 * 
 * @author (Janis Chen) 
 * @version (1/27/17)
 */
public class Payroll
{

    private ArrayList<Student> employees;
    
    /**
     * Constructs an Arraylist named employees to hold the employees. 
     */
    public Payroll()
    {
        employees = new ArrayList<Student>();

    }
    
    /**
     * The method adds the employee information from the Scanner into the Arraylist. 
     * 
     * @param  y   parameters initialize the employee name, wage and hour
     * @return     none 
     */
    public void addEmployee(String name, double wage, double hour)
    {

        employees.add(new Student(name, wage, hour));

    }
    
    /**
     * The method calculates the income, federal tax, social security, and final income of each employee and lists them. 
     * 
     * @param  y   none
     * @return     none 
     */
    public void calculatePayroll()
    {
        double fedTax;
        double socTax;
        double income;
        double checkAmount;

        for (Student person: employees)
        {
            //Calculates the income
            income = person.getWage() * person.getHour();
            
            //Calculates federal tax
            if (income <= 32000 && income > 0)
            {
                fedTax = income * 0.1;

            }
            else 
            {
                fedTax = (income - 32000);
                fedTax = fedTax + 3200 + (income - 32000) * 0.25;

            }
            
            //Calculates social security tax
            if (income >= 118500)
            {

                socTax = 118500 * 0.0765;

            }
            else 
            {
                socTax = income * 0.0765;
            }
            
            //Calculates the final amount
            checkAmount = income - fedTax - socTax;
            
            System.out.printf("Income for " +person.getEmployee() + ":  %.2f" , + income);
            System.out.println(" ");
            System.out.printf("Federal Tax for " + person.getEmployee() + ":  %.2f", + fedTax);
            System.out.println(" ");
            System.out.printf("Social Security Tax for " + person.getEmployee() + ":  %.2f", + socTax);
            System.out.println(" ");
            System.out.printf("Check Amount for " + person.getEmployee() + ":  %.2f", + checkAmount);
            System.out.println(" ");
            System.out.println(" ");

        }

       


    }
}
