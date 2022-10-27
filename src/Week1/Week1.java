package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("Module");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

       
        
        int length = InputReader.getInt("enter the length: ");
        int height = InputReader.getInt("enter the height: ");

        int perimeter = (length + height)*2;
        System.out.println(perimeter); 

        int num1 = InputReader.getInt("enter number");
        int num2 = InputReader.getInt("enter number");
        System.out.println(num1 + num2);

        int num3 = InputReader.getInt("enter number");
        int num4 = InputReader.getInt("enter number");
        System.out.println(num3 * num4);
        


       
        


}
    } 

