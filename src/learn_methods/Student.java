package learn_methods;

public class Student
{
    String firstName;
    String lastName;
    int idNumber;
    String gender;

    public String getFullName ()
    {
        String fullName = firstName+" "+lastName ;
        return fullName;

    }
    public boolean isFemale ()
    {
        if (gender == "female")
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public static void main(String[] args)
    {
        Student student1 = new Student ();
        student1.firstName ="Soraya";
        student1.lastName = "Aitsaidi";
        student1.idNumber = 44;
        student1.gender = "female";
        String fullName = student1.getFullName();
        System.out.println( "the student full name is: " + fullName  );
        boolean isWoman = student1.isFemale();
        System.out.println(" the gender of student1 is female ? " + isWoman);

        Student student2 = new Student();
        student2.firstName = "Hence";
        student2.lastName = "Hamidouche";
        student2.idNumber = 33;
        student2.gender = "male";
        String fullName2 = student2.getFullName();
        System.out.println("the student full name is: " + fullName2);
        boolean isMan = student2.isFemale();
        System.out.println(" the gender of student2 is female ? " + isMan);


    }



}
