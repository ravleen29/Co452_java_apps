package Week3;

import java.util.ArrayList;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Student ravleen = new Student(22045363,"ravleen");
        

        Student Simran = new Student(22045890, "Simran");
        Simran.print();
        
        Student Aashish = new Student(22014533, "Aashish");
        Aashish.print();

        Course Computing = new Course("BTCG,", "Computing");
        Computing.print();
        

        ArrayList<Student> Students = new ArrayList<Student>();
        Students.add(Aashish);
        Students.add(Simran);
        Students.add(ravleen);

        for(Student student : Students)
        {
            student.print();
        }

    }     

    
}
