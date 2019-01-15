

/**
 * The Student class constructs and holds the variables of the employee name, the wage they earned, and the hours of
 * work. 
 * 
 * @author (Janis Chen) 
 * @version (1/27/17)
 */
public class Student
{
    private String name;
    private double wage;
    private double hour;

    /**
     * Constructor for creating the variables that hold the employee name, wage, and hour. 
     */
    public Student(String n, double w, double h)
    {
        name = n;
        wage = w;
        hour = h;
        
    }
    /**
     * The method gets the employee name and returns it. 
     * 
     * @param  y   none
     * @return     the name of the employee
     */
    public String getEmployee()
    {
        return name;
    }
    /**
     * The method gets the employee wage and returns it. 
     * 
     * @param  y   none
     * @return     the amount of wage the employee gets 
     */
    public double getWage()
    {
        return wage;
    }
    /**
     * The method gets the hours the employee works and returns it. 
     * 
     * @param  y   none
     * @return     the amount of hours the employee works
     */
    public double getHour()
    {
        return hour;
    }
    
}
