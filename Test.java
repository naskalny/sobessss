public class Test
{
    static public void main(String[] args)
    {
        try
        {
            int k = Integer.parseInt(args[1]);
            System.out.println(args[k]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
