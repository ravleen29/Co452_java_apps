package Week3;

public class Course {
    private String Code;
    private String Name;

    public Course(String Code, String Name)
    {
        this.Code = Code;
        this.Name = Name;

    }
    public void print()
    {
        System.out.println("Code: " + this.Code);
        System.out.println("Name: " + this.Name);
    }

}
