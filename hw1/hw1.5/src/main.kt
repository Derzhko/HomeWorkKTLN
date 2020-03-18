import java.io.File
fun main()
{
    var numberOfLines = 0
    var isFirstNonSpaceChar = false;
    for (lines in File("whenIUnderstoodTheEndingOfEvangelion.txt").readLines())
    {
        if (lines.isNotEmpty())
        {
            for (charInLine in lines)
            {
                if (charInLine != '\t' && charInLine != ' ' && charInLine != '\n')
                {
                    isFirstNonSpaceChar = true
                }
                if (isFirstNonSpaceChar)
                {
                    ++numberOfLines
                    break
                }
            }
        }
        isFirstNonSpaceChar = false
    }
    print("Number of non-empty lines in file: $numberOfLines")
}