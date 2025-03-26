fun main() {
    var doctor1=person()
    println(doctor1.name)
    doctor1.speak()

}

class person{
    var name="Jane"
    var age="35"
    var dep="Dep1"

    fun speak(){
        println("Doctor is speaking")
    }

}