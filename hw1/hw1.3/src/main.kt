fun numberOfEntries(set : String, setLength : Int, subset : String, subsetLength : Int) : Int
{
    var count = 0
    for (i in 0..(setLength - subsetLength))
    {
        if (set[i] == subset[0])
        {
            for (j in 0..(subsetLength - 1))
            {
                if (set[i + j] != subset[j])
                {
                    break
                }
                else if (j == subsetLength - 1)
                {
                    ++count
                }
            }
        }
    }
    return count
}

val scan = java.util.Scanner(System.`in`)
fun main()
{
    print("Insert set\n")
    var set = scan.nextLine()
    print("Insert subset\n")
    var subset = scan.nextLine()
    val setLength = set.length
    val subsetLength = subset.length
    print("Number of entries subset in set is " + numberOfEntries(set, setLength, subset, subsetLength))
}