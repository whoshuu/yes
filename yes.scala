object yes
{
    def main(args: Array[String])
    {
        if (args.length == 0)
        {
            while(true)
            {
                println('y');
            }
        }
        else
        {
            while(true)
            {
                println(args(0));
            }
        }
    }
}
