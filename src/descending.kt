fun main() {
    var num = 5
    while (num >= 1){
        println("NUmber is $num")
    num--
    }

    //Do while loop

    var count=100
    do{
    println("Number is $count")
        count ++
    }
        while (count<=90)

        //For loop
        for (x in 35..40)
            println("Number:$x")

    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

    for (a in 1..5){
        if (a==3){
            break
        }
        println("NUmber is $a")
    }

    for(myletter in 'd'..'f'){
        if (myletter=='f'){
            continue
        }
        println("My letter is $myletter")
    }

}





