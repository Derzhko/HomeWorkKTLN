    fun myReverse(numbers : IntArray, nose : Int, tail : Int)
{
    var halfLength = nose + ((tail - nose + 1) / 2) - 1
    for (i in nose..halfLength)
    {
        var temp = tail - i + nose
        numbers[i] += numbers[temp]
        numbers[temp] = numbers[i] - numbers[temp]
        numbers[i] = numbers[i] - numbers[temp]
    }
}

val scan = java.util.Scanner(System.`in`)
fun main()
{
    print("Insert nose length\n")
    var noseLength = scan.nextInt()
    print("Insert tail length\n")
    var tailLength = scan.nextInt()
    val length = noseLength + tailLength
    print("Insert numbers\n")
    var numbers = IntArray(length)
    for (i in 0..(length - 1))
    {
        numbers[i] = scan.nextInt()
    }
    myReverse(numbers, 0, noseLength - 1);
    myReverse(numbers, noseLength, length - 1)
    myReverse(numbers, 0, length - 1)
    print("Modified aray\n")
    for (i in numbers)
    {
        print("$i ")
    }
    return
}