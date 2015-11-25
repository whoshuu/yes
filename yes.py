from signal import signal, SIGPIPE, SIG_DFL 
from sys import argv

# Ignore SIGPIPE and don't throw exceptions on it
# (http://docs.python.org/library/signal.html)
signal(SIGPIPE, SIG_DFL)

arg_count = len(argv)

repeat_this = argv[1] if arg_count > 1 else 'y'

while True:
    print repeat_this