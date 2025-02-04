def factorial(n: Int): Int = 
    var output = 1
    if n > 1 then
        output = n * factorial(n-1)
    return output

@main def main() =
    println(factorial(6))