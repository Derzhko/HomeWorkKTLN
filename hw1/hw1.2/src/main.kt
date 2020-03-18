fun recursiveFactorial(number : Int) : Int
{
    if (number == 0)
    {
        return 1
    }
    return number * recursiveFactorial(number - 1)
}

fun iterativeFactorial(number : Int) : Int
{
    var factorialIteration = 1
    for (i in 1..number)
    {
        factorialIteration *= i
    }
    return factorialIteration
}

var scan = java.util.Scanner(System.`in`)
fun main()
{
    print("Insert number\n")
    var number = scan.nextInt()
    var iterative = iterativeFactorial(number)
    var recursive = recursiveFactorial(number)
    print("Iterative factorial of a number $number is $iterative\nRecursion factorial of a number $number is $recursive")
}
