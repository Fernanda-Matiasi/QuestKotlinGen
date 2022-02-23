fun main() {
    /* Quest1
    Faça um programa que receba três inteiros e diga qual deles é o maior.
     */
    println("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    if (num1 >= num2 && num1 >= num3){
        println("O número maior é: $num1")

    }else if(num2 >= num1 && num2 >= num3){
        println("O número maior é: $num2")

    }else {
        println("O número maior é: $num3")
    }

}