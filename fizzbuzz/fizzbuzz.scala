@main def fizzbuzz() =
    val n = 100

    for
        i <- 1 to n
    do
        var output = ""
        if i % 3 == 0 then
            output += "Fizz"

        if i % 5 == 0 then
            output += "Buzz"

        if output != "" then
            println(output)
        else
            println(i)