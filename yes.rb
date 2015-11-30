Signal.trap("PIPE", "EXIT")

if ARGV.length == 0
    while true
        puts "y"
    end
else
    while true
        puts ARGV[0]
    end
end
