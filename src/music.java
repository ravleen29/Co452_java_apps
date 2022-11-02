public class music {
    private String Song;
    private String Artist_Name;
    private int Plays;

    public music(String Song, String Artist_Name, int Plays)
    {
        this.Song = Song;
        this.Artist_Name = Artist_Name;
        this.Plays = Plays;

    }
    public void print()
    {
        System.out.print("Song: " + this.Song );
        System.out.print(" Artist: " + this.Artist_Name );
        System.out.println(" Plays: " + this.Plays);
    
    }
    
}
