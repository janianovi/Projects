import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * The PayrollRunner creates an Arraylist called studentRoll that reads data until a sentinel value, and calls upon a 
 * method that calcuates the income, taxes, and final amount for each employee. 
 * 
 * @author (Janis Chen) 
 * @version (1/27/17)
 */
public class PayrollRunner
{
    
   
    public static void main(String[] args)
    {
        Payroll studentRoll = new Payroll();
        // Creates a new Arraylist named studentRoll
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter names of employee, wage, and hour: ");
        String info = in.nextLine();
        // Inputs the scanner information into a variable info

        while(true)
        {
            
            //Breaks when Scanner input is -1
            if (info.equals("-1"))
            {
                break;
            }
            
            //Splits up the string at each space
            StringTokenizer str = new StringTokenizer(info, " ");

            String name = str.nextToken();
            double wage = Double.parseDouble(str.nextToken());
            double hour = Double.parseDouble(str.nextToken());
            
            studentRoll.addEmployee(name, wage, hour);
            
            info = in.nextLine();

        }
        
        //Calls the method on each object in the Arraylist studentRoll
        studentRoll.calculatePayroll();
     }
}
