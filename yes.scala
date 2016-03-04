import sun.misc.Signal
import sun.misc.SignalHandler

object yes
{
    def main(args: Array[String])
    {
        val signal = new Signal("PIPE");
        val handler = new SignalHandler {
            def handle(signal: Signal): Unit = {
                sys.exit(13)
            }
        }

        Signal.handle(signal, handler)

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
