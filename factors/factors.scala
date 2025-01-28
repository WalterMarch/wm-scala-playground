import scala.collection.immutable.TreeSet

@main def factors() = 
    val number = 100

    var factors = TreeSet(1, number)

    for
        i <- 2 to number - 1
    do
        if number %i == 0 then {
            factors += i
            factors += number / i
        }

    println(factors)