import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter operator where 1(+) 2(-) 3(*) 4(/) (number):")
    var opp = read.nextInt()

    println("Enter first number:")
    var num = read.nextInt()

    println("Enter second number:")
    var numb = read.nextInt()

    var result= when(opp){
        1->num+numb
        2->num-numb
        3->num*numb
        4->num/numb

        else-> "Invalid operator"
    }
    println("The day is $result")
}