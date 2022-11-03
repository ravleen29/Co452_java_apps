import java.util.ArrayList;

import helpers.ConsoleColours;
import helpers.InputReader;
public class App 
{
    public static void main(String[] args) 
    { 
        System.out.println("Welcome to musica");

        Songs Compro = new Songs("Compro", "Gurnam", 102000);                
          
        Songs On_Hunt = new Songs("On_hunt", "Shivjot", 6000000);                
         
        Songs High_Five = new Songs("High_Five", "Shivjot", 706000);                
         
        Songs Diljaniya = new Songs("Diljaniya", "Ranjit_bawa", 34000000);                
        
        Songs Dekhya_kite = new Songs("Dekhya_kite", "Gur_sidhu", 420000);                
          
        Songs Yaad = new Songs("Yaad", "Jassa", 4600000);                
          
        Songs Talja = new Songs("Talja", "Jassa", 20600000);                
         
        Songs Zindagi = new Songs("Zindagi", "Joban_dhandra", 1000000);                
         
        Songs Detail = new Songs("Detail", "Amrit_Maan", 240000);                
         
        Songs Psycho = new Songs("Psycho", "Anne_marie", 7200000);                
         
        Songs Bones = new Songs("Bones", "Imagine_Dragons", 1200000);                
        
        Songs Balle_Jatta = new Songs("Balle_Jatta", "Diljit_Dosanjh", 5700000);                
        
        Songs New_Rules = new Songs("New_Rules", "Dua_Lipa", 270000000);                
         
        Songs Calm_Down = new Songs("Calm_Down", "Selena_Gomez", 2800000);                
        
        Songs Ciao_Adios = new Songs("Ciao_Adios", "Anne_Marie", 294000000);                
         
        
        ArrayList<Songs> Song = new ArrayList<Songs>();
        Song.add(Compro);
        Song.add(On_Hunt);
        Song.add(High_Five);
        Song.add(Diljaniya);
        Song.add(Dekhya_kite);
        Song.add(Yaad);
        Song.add(Talja);
        Song.add(Zindagi);
        Song.add(Detail);
        Song.add(Psycho);
        Song.add(Bones);
        Song.add(Balle_Jatta);
        Song.add(New_Rules);
        Song.add(Calm_Down);
        Song.add(Ciao_Adios);

        String name = InputReader.getString("Enter the name of a song to remove.");
        for(Songs current : Song)
        {
            if(name.equals( current.getName())) 
            {
                
                Song.remove(current);
                System.out.println("Successfully removed the song!");
            }
        }


        
        for(Songs song : Song)
        {
            song.print();
        }

        

        

    }
}
