interface Computer
{
     void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code,Compile,Run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code,compile,run: faster");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Demo
{
    public static void main(String[] args) {
    //    Computer lap = new Laptop();
    //    Computer desk = new Desktop();


       Desktop Jack = new Desktop();
       Jack.code();
       
   }
}