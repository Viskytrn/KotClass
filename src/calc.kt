import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var num = read.nextInt()

    println("Enter operator(+ - * /):")
    var opp = readln()


    println("Enter second number:")
    var numb = read.nextInt()

    var result= when(opp){
        "+"->num+numb
        "-"->num-numb
        "/"->num/numb
        "*"->num*numb

        else-> "Invalid operator"
    }
    println("The answer is $result")
}
