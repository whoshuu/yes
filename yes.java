public class yes
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    { 
      while(true)
      {
        System.out.println('y');
      } 
    }
    else
    { 
      while(true)  
      {
        System.out.println(args[0]);
      }
    }
  }
}
