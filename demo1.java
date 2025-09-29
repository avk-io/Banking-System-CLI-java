




public class demo1 {
    public static void main(String[] args) {
         

        int i = 20;
        int j = 0;


        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("j has become zero..");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.." + e );
        }

        System.out.println(j);
        System.out.println("Program ends here..");
    }
} 
