public class Credentials 
{
    String name,Id;
    Credentials(String a, String b)
    {
        this.name=a;
        this.Id=b;
    }

    public String toString()
    {
        return this.name+"#"+this.Id;
    }
    public static void main(String[] args) 
    {
        Credentials cr = new Credentials("Ator","Agau");
    }
}
