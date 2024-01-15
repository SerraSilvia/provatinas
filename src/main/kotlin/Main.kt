package org.example

fun main() {
    println("El factorial de 4 és: ${factorial(4)}")
    println("El doble factorial de 4 és: ${dobleFactorial(4)}")
    bucle(10)
}

fun factorial(num:Int):Int{
    return if (num==1)1
    else num*factorial(num-1)
}

fun bucle(num:Int):Int{
    if (num ==0) return 0
    else{
        println(num)
        return bucle(num-1)
    }

}

fun dobleFactorial(num:Int){
    return if (num==1)1
    else (num*num)*(dobleFactorial*dobleFactorial)(num-1)
}

