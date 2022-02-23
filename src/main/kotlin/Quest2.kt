fun main() {
    /* Quest2
    Faça um programa que entre com três números e coloque em ordem crescente.
     */
    val cres = 0
    println("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro numerous: ")
    val num3 = readLine()!!.toInt()

    if(num2 in num1..num3){
        println("Está é a ordem crescente: $num1 - $num2 - $num3")

    }else if (num3 in num1..num2){
        println("Está é a ordem crescente: $num1 - $num3 - $num2")

    }else if (num2 <= num1 && num1 <= num3){
        println("Está é a ordem crescente: $num2 - $num1 - $num3")

    }else if (num2 <= num3 && num3 <= num1){
        println("Está é a ordem crescente: $num2 - $num3 - $num1")

    }else if (num3 <= num1 && num1 <= num2){
        println("Está é a ordem crescente: $num3 - $num1 - $num2")

    }else{
        println("Está é a ordem crescente: $num3 - $num2 - $num1")
    }

}