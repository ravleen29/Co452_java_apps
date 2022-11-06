import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import helpers.InputReader;
public class App 
{
     public static void main(String[] args) 
{
    { 
        System.out.println("Welcome to musica");
        System.out.println("Songs added into the list.");

        Songs r1 = new Songs("Compro", "Gurnam", 102000);                
        r1.print();
        Songs r2 = new Songs("On_hunt", "Shivjot", 6000000);                
        r2.print();
        Songs r3 = new Songs("High_Five", "Shivjot", 706000);                
        r3.print();
        Songs r4 = new Songs("Diljaniya", "Ranjit_bawa", 34000000);                
        r4.print();
        Songs r5 = new Songs("Dekhya_kite", "Gur_sidhu", 420000);                
        r5.print();
        Songs r6 = new Songs("Yaad", "Jassa", 4600000);                
        r6.print();
        Songs r7 = new Songs("Talja", "Jassa", 20600000);                
        r7.print();
        Songs r8 = new Songs("Zindagi", "Joban_dhandra", 1000000);                
        r8.print();
        Songs r9 = new Songs("Detail", "Amrit_Maan", 240000);                
        r9.print();
        Songs Psycho = new Songs("Psycho", "Anne_marie", 7200000);                
        Psycho.print();
        Songs r10 = new Songs("Bones", "Imagine_Dragons", 1200000);                
        r10.print();
        Songs r11 = new Songs("Balle_Jatta", "Diljit_Dosanjh", 5700000);                
        r11.print();
        Songs r12 = new Songs("New_Rules", "Dua_Lipa", 270000000);                
        r12.print();
        Songs r13 = new Songs("Calm_Down", "Selena_Gomez", 2800000);                
        r13.print();
                       
        
        ArrayList<Songs> Song = new ArrayList<Songs>(20);
        Song.add(r1);
        Song.add(r2);
        Song.add(r3);
        Song.add(r4);
        Song.add(r5);
        Song.add(r5);
        Song.add(r6);
        Song.add(r7);
        Song.add(r8);
        Song.add(r9);
        Song.add(r10);
        Song.add(r11);
        Song.add(r12);
        Song.add(r13);
        
        
        //String name = InputReader.getString("Enter the name of a song to remove.");
        //for(Songs current : Song)
        {
            //if(name.equals( current.getName())) 
            {
                
              //  Song.remove(current);
               // System.out.println("Successfully removed the song!");
                
            }
        }
        System.out.println(Song.get(1));
        Song.remove(r1);
        System.out.println("Song removed!");
        System.out.println("The list of songs stored after removing a song.");
        
        for(Songs song : Song)
        {
            song.print();
        }

        Scanner music = new Scanner(System.in);
        System.out.println("Enter playcount to find a song.");

        int Plays = music.nextInt();
        System.out.println("Here is the song you were looking for!");

        for(Songs song : Song)
        {if(Plays == song.getPlays())
        {
            song.print();
        }}

        

        
    

        

        
        
        
            
        
        
    }
}
}


