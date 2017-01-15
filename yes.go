package main

import (
  "fmt"
  "os"
  "os/signal"
  "syscall"
)

func main() {
  signal.Ignore(syscall.SIGPIPE)
  for {
    if len(os.Args) > 1 {
      var test = os.Args[1]
      fmt.Println(test)
    } else {
      fmt.Println("y")
    }
  }
}
