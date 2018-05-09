package abstracthw;

import java.util.Scanner;

/**
 *
 * @author Volan Nnanpalle
 */
public class AbstractHW
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Undergraduate");
        System.out.println("2. Graduate");
        System.out.println("3. Doctorate");
        System.out.println("Enter the number of which you are: ");
        int term=scan.nextInt();
        switch(term)
        {
            case 1:
            {
                Student s=new Undergraduate(50, 50, 20);
                s.setName("Volan Nnanpalle");

                s.setGPA(3.0);
                s.setMajor("Computer Science");
                displayStudent(s);
                s.canGraduate();
                break;
            }
            case 2:
            {

                Student s=new Graduate(29, 30);
                s.setName("Maria Garcia");
                s.setGPA(3.5);
                s.setMajor("Biology");
                displayStudent(s);
                s.canGraduate();
                break;
            }
            case 3:
            {
                Student s=new Doctorate(30);
                s.setName("George Parks");
                s.setGPA(3.1);
                s.setMajor("Mathematics");
                displayStudent(s);
                s.canGraduate();
                break;
            }
            default:
                break;
        }
    }

    public static void displayStudent(Student student)
    {
        System.out.println();
        System.out.println("The area is "+student.toString());
    }

}
