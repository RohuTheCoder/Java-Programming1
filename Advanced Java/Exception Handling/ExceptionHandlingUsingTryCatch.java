public class ExceptionHandlingUsingTryCatch
{
    public static void main(String[] args) {
        int i = 0;
        int j = 4;
        try
        {
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
