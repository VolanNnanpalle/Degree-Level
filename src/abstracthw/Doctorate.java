/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package abstracthw;

/**

 @author Volan Nnanpalle
 */
public class Doctorate extends Student
{

    Doctorate ()
    {
        super ();
    }

    Doctorate ( int c )
    {
        super.setCredits ( c );
    }

    public boolean Thesis ()
    {
        boolean b=false;
        if ( b==true )
        {
            System.out.println ( "Completed" );
        }else
        {
            System.out.println ( "Not completed" );
        }
        return b;
    }

    public boolean DefenseExam ()
    {
        boolean b=false;
        if ( b==true )
        {
            System.out.println ( "Pass" );
        }else
        {
            System.out.println ( "Fail" );
        }

        return b;
    }

    @Override
    public boolean canGraduate ()
    {
        if ( getCredits ()<30 )
        {
            System.out.println ( "Not Eligible for graduation" );
            return false;
        }else
        {
            System.out.println ( "Eligible for graduation" );
            return true;
        }
    }

    public boolean checkRequirements ()
    {
        return canGraduate ()&& Thesis ()&& DefenseExam ();
    }

}
