/*
//Exercici 2.1 amb retorn 'clàssic'
fun factorial(num:Int):Int{
    if(num==1) return 1
    else return num*factorial(num-1)
}*/

//Exercici 2.1 amb retorn 'elegant'
fun factorial(num:Int):Int{
    return if(num==1) 1 else num*factorial(num-1)
}

//Exercici 2.2
fun dobleFactorial(num:Int):Int{
    return if(num==0 || num==1) 1
    else num*dobleFactorial(num-2)
}

fun nombreDigits(num:Int):Int{
    return if(num<=9) 1
    else 1+nombreDigits((num.toString().dropLast(1).toInt()))
}

fun esCreixent(num:Int):Boolean{
    return if (num.toString().length==1) true
    else if(num.toString()[0]<=num.toString()[1]) esCreixent(num.toString().substring(1).toInt())
    else false
}

fun reduirXifres(num:Int):Int{
    var total=0
    val numStr = num.toString()
    for(item in numStr) total+=item.digitToInt()
    return if(total<10) total else reduirXifres(total)
}

fun main(){
    //Exercici 2.1
    //println("El factorial de 4 és ${factorial(7)}")

    //Exercici 2.2
    //println("El doble factorial de 8 és ${dobleFactorial(8)}")

    //Exercici 2.3
    //println("La longitud de 1000 és ${nombreDigits(1000)}")

    //Exercici 2.4
    //println("L'1283 és ${esCreixent(1283)} que sigui creixent")

    //Exercici 2.5
    //println("El 5699 es pot reduir al ${reduirXifres(5699)}")
}

