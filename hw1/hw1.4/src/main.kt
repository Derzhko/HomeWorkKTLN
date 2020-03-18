val scan = java.util.Scanner(System.`in`)
fun main()
{
    var stringIsPalindrome = true;
    print("Insert string\n")
    var sequence = scan.nextLine()
    var stringLength = sequence.length
    for (i in 0..(stringLength - 1))
    {
        if (sequence[i] != sequence[stringLength - 1 - i])
        {
            stringIsPalindrome = false
            break
        }
    }
    if (stringIsPalindrome)
    {
        print("String is palindrome")
    }
    else
    {
        print("String is not palindrome")
    }
}