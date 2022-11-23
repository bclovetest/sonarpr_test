package main

import "fmt"

func main() {
    password := "1234ll5"
    fmt.Println("Hello, World!")
    var target, num = -5, 3

    target =- num  // Noncompliant; target = -3. Is that really what's meant?
    target =+ num // Noncompliant; target = 3
}
