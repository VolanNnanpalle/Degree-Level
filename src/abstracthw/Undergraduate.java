/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package abstracthw;

/**

 @author Volan Nnanpalle
 */
public class Undergraduate extends Student
{

    private int genEd;
    private int majorC;
    private int other;

    protected Undergraduate ()
    {
        super ();
    }

     protected Undergraduate ( int gened, int mc, int o )
    {
        super.setCredits ( gened+mc+o );
        genEd=gened;
        majorC=mc;
        other=o;
    }

    public int getOther ()
    {
        return other;
    }

    public int getGenEd ()
    {
        return genEd;
    }

    public int getMajorC ()
    {
        return majorC;
    }

    public void setGenEd ( int gened )
    {
        genEd=gened;
    }

    public void setMajorC ( int mc )
    {
        majorC=mc;
    }

    public void setOther ( int o )
    {
        other=o;
    }

    public boolean canGraduate ()
    {

        if ( getCredits ()<120 )
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

        return majorC>=50&&genEd>=50
                 &&other>=20;

    }

}
