import java.util.Vector;

public class Employee implements java.io.Serializable
{

	private static final long serialVersionUID = 1L;
public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name + " " + address);
      Vector<Employee> emp = new Vector<Employee>() ;
      Employee emp1 = new Employee() ;
      emp1.name = "masih";
      emp.addElement(emp1);
      System.out.println("First element: " + emp.firstElement().name);
      
   }
}