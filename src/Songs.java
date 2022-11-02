public class Songs {
    private String Song_Name;
    private String Artist_Name;
    private int Plays;

    public Songs(String Song_Name, String Artist_Name, int Plays)
    {
        this.Song_Name = Song_Name;
        this.Artist_Name = Artist_Name;
        this.Plays = Plays;
    }
    public void print()
    {
        System.out.print("Song: " + this.Song_Name);
        System.out.print(" Artist: " + this.Artist_Name );
        System.out.println(" Plays: " + this.Plays);
    
    }
    
}
