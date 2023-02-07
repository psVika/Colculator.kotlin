import kotlin.system.exitProcess

fun main() {
    println("Enter names using conma (,) as separator")
    val names = readLine().orEmpty()

    val namesArray = names.split(",")

    println("Enter salaries using conma (,) as separator")
    val salaries = readLine().orEmpty()

    val salariesArray = salaries.split(",")

    if (namesArray.size != salariesArray.size) {
        println("Names list must be the same as salaris list")
        exitProcess(0)
    }

    validateLenght(namesArray, 10, "Name")
    validateLenght(salariesArray, 6, "Salary")

    printTable(namesArray, salariesArray)

}

fun printTable(namesArray: List<String>, salariesArray: List<String>) {
    println("-".repeat(23))

    for (name in namesArray){
        val index = namesArray.indexOf(name)
        val salary = salariesArray[index]
        val f1 = (12 - name.length) / 2
        val f2 = 12 - name.length - f1
        val s1 = (8 - salary.length) / 2
        val s2 = 8 - salary.length - s1

        println("|" + " ".repeat(f1) + name + " ".repeat(f2) + "|" + " ".repeat(s1) + salary + " ".repeat(s2) + "|")
    }

    println("-".repeat(23))

}

fun validateLenght(namesArray: List<String>, maxSise: Int, entyti: String) {
    for (name in namesArray) {
        if (name.length > maxSise) println("$entyti must be up to $maxSise characters")
        exitProcess(0)
    }
}
