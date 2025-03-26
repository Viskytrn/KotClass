fun main() {
    var dog1=Dog("Bosco","Chihuahua","Brown")
    println(dog1.breed)


    var dog2=Dog("Rufus","German shepherd","Black")
    println(dog2.name)



    var dog3=Dog("Simba","Spree","White")
    println(dog3.color)



    var dog4=Dog("Lil Mbwa","Siberian husky","White")
    println(dog4.color)



}

class Dog(var name:String,var breed:String,var color:String){


}