
@FunctionalInterface
interface A 
{
    void show();
}

public class fuintf {
    public static void main(String[] args) {
        A obj = () -> System.out.println("In show"); 
        
        obj.show();
    } 
}
