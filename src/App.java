import java.util.ArrayList;

import helpers.ConsoleColours;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        Songs Compro = new Songs("Compro,\t", "Gurnam,\t", 102000);                
          
        Songs On_Hunt = new Songs("On_hunt,\t", "Shivjot,\t", 6000000);                
         
        Songs High_Five = new Songs("High_Five,\t", "Shivjot,\t", 706000);                
         
        Songs Diljaniya = new Songs("Diljaniya,\t", "Ranjit_bawa,\t", 34000000);                
        
        Songs Dekhya_kite = new Songs("Dekhya_kite,\t", "Gur_sidhu,\t", 420000);                
          
        Songs Yaad = new Songs("Yaad,\t", "Jassa,\t", 4600000);                
          
        Songs Talja = new Songs("Talja,\t", "Jassa,\t", 20600000);                
         
        Songs Zindagi = new Songs("Zindagi,\t", "Joban_dhandra,\t", 1000000);                
         
        Songs Detail = new Songs("Detail,\t", "Amrit_Maan,\t", 240000);                
         
        Songs Psycho = new Songs("Psycho,\t", "Anne_marie,\t", 7200000);                
         
        Songs Bones = new Songs("Bones,\t", "Imagine_Dragons,\t", 1200000);                
        
        Songs Balle_Jatta = new Songs("Balle_Jatta,\t", "Diljit_Dosanjh,\t", 5700000);                
        
        Songs New_Rules = new Songs("New_Rules,\t", "Dua_Lipa,\t", 270000000);                
         
        Songs Calm_Down = new Songs("Calm_Down,\t", "Selena_Gomez,\t", 2800000);                
        
        Songs Ciao_Adios = new Songs("Ciao_Adios,\t", "Anne_Marie,\t", 294000000);                
         
        
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
        


        for(Songs song : Song)
        {
            song.print();
        }


        
        

    }
}
