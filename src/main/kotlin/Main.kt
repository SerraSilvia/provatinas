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
    return if (num <= 9) 1  //si és < o = a 9, té 1 digit
    else 1 + nombreDigits((num.toString().dropLast(1).toInt()))

    // 1. Convertimos el número a una cadena de texto: num.toString()
    // 2. Eliminamos el último dígito de la cadena: dropLast(1)
    // 3. Convertimos la cadena resultante de nuevo a un número entero: toInt()
    // 4. Llamamos recursivamente a la función con el nuevo número obtenido.

//dropLast te permite obtener una nueva colección que contiene
// todos los elementos de la colección original excepto
// los últimos N elementos especificados.
}
fun numeroInvertit(){

}

fun fibonacci(num:Int):Int{
    return if(num==0)0
    else if(num==1)1
    else fibonacci(num-1+ fibonacci(-2))
}

fun fibonacciAltraMAnera(num1:Int, num2:Int, iteracions:Int){
    println("$num1+$num2=${num2+num1}")
    if (iteracions==0)"Adéu"
    else (fibonacciAltraMAnera(num2, num1+num2,iteracions-1))
}