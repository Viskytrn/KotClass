fun main() {
    //Standard library functions//Predefined functions
    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x")

    var y = Math.round(45.45)
    println("The output is $y")

    school() //Calling a functions
    student(name = "Joseph", age = 21) //
    student(name = "Ian", age = 19) //
    employee("Peter",40000,false)
    employee("John",60000,false)

}

//User-defined Functions

fun school(){
    println("eMobilis")
}

//Parameters/Variable and Arguments/Value

fun student(name:String,age:Int){
    println("$name is $age years old")

}

fun employee(name: String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Disability: $disability")

}