/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package abstracthw;

/**

 @author Volan Nnanpalle
 */
public class Graduate extends Student
{
    private int credits;
    private int courseC;
    private int electiveC;

    Graduate ()
    {
    }

    Graduate (  int cc, int ec )
    {
        super.setCredits ( cc+ec );
        courseC=cc;
        electiveC=ec;
    }
   
    public int getCourseC ()
    {
        return courseC;
    }

    public int getElectiveC ()
    {
        return electiveC;
    }

    public void setCourseC ( int cc )
    {
        courseC=cc;
    }

    public void setElectiveC ( int ec )
    {
        electiveC=ec;
    }

    public boolean fieldExperience ()
    {
        boolean b=false;
        if ( b==true )
        {
            System.out.println ( "Field experience acquired" );
        }else
        {
            System.out.println ( "Field experience not acquired" );
        }
        return b;
    }

    public boolean canGraduate ()
    {
        if ( getCredits ()<60 )
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
        return courseC>=30&&electiveC>=30&&fieldExperience ();
    }

}
