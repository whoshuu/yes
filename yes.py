import sys

arg_count = len(sys.argv)

repeat_this = sys.argv[1] if arg_count > 1 else 'y'

while True:
    print repeat_this