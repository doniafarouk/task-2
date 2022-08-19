import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("enter the size of array")
    var iteration = scanner.nextInt()
    scanner.nextLine()
    val myList: MutableList<String> = mutableListOf<String>()

    while (iteration > 0) {
        print("enter name")
        val input = scanner.nextLine()
        myList.add(input)
        iteration--
        }
    val filteredList = myList.filter{
        it.contains("b" , true)
                || it.contains("m" , true)
    }
    filteredList.forEach{
        println(it.uppercase())
    }
}
