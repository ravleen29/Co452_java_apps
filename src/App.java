import helpers.ConsoleColours;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_PURPLE);
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_YELLOW);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        music Compro = new music("Compro", "Gurnam", 102000);                
        Compro.print();  
        music On_Hunt = new music("On_hunt", "Shivjot", 6000000);                
        On_Hunt.print();  
        music High_Five = new music("High_Five", "Shivjot", 706000);                
        High_Five.print();  
        music Diljaniya = new music("Diljaniya", "Ranjit_bawa", 34000000);                
        Diljaniya.print();  
        music Dekhya_kite = new music("Dekhya_kite", "Gur_sidhu", 420000);                
        Dekhya_kite.print();  
        music Yaad = new music("Yaad", "Jassa", 4600000);                
        Yaad.print();  
        music Talja = new music("Talja", "Jassa", 20600000);                
        Talja.print();  
        music Zindagi = new music("Zindagi", "Joban_dhandra", 1000000);                
        Zindagi.print();  
        music Detail = new music("Detail", "Amrit_Maan", 240000);                
        Detail.print();  

        
        

    }
}
