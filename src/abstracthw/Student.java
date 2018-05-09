
package abstracthw;

/**
 *
 * @author Volan Nnanpalle
 */
public abstract class Student {

    
    private String name;
    private int credits;
    private double gpa;
    private String major;
    
    protected Student()
      {
        name ="";
        credits = 0;
        gpa = 0;
        major = "";
                 
      }
    protected Student(String n, int c, double GPA,String m)
      {
        name = n;
        credits = c;
        gpa = GPA;
        major =m;
      }
    public String getName()
      {
        return name;
       
      }
    public int getCredits()
      {
        return credits;
      }
    public double getGPA()
      {
        return gpa;
      }
    public String getMajor()
      {
        return major;
      }
    public void setName(String n)
      {
        name =n;
      }
    public void setCredits(int c)
      {
        credits =c;
      }
    public void setGPA(double GPA)
      {
        if(GPA < 0 || GPA >4)
              System.out.println("Invalid GPA");
        else
            gpa =GPA;
      }
    public void setMajor(String m)
      {
        major = m;
      }
    public boolean canGraduate()
      {
          return false;
      }
    public boolean checkRequirements()
      {
        return false;
      }
    @Override
    public String toString()
      {
        return "Student Name: "+ name+"\nCredits: "+credits +
                 "\nGPA: "+gpa+"\nMajor: "+major;
      }
}
