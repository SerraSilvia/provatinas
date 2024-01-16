package org.example
fun main() {
    println("El factorial de 4 és: ${factorial(4)}")
    println("El doble factorial de 4 és: ${dobleFactorial(4)}")
    bucle(10)
    println("${nombreDigits(300)}")
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
fun dobleFactorial(num:Int):Int{
    return if (num==1)1
    else (num*num)*dobleFactorial(num-1)
}
fun nombreDigits(num:Int):Int {
    return if (num <= 9) 1
    else 1 + nombreDigits((num.toString().dropLast(1).toInt()))
//dropLast te permite obtener una nueva colección que contiene
// todos los elementos de la colección original excepto
// los últimos N elementos especificados.
}
