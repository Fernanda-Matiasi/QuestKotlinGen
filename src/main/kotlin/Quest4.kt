import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    /* Quest4
    Faça um programa em que permita a entrada de um número qualquer e exiba se
    este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
    se for ímpar exiba o número elevado ao quadrado.
     */
    print("Digite um número: ")
    val num = readLine()!!.toDouble()

    if(num % 2 == 0.0 ){
        val raiz = sqrt(num)
        print("Este número $num é par, e sua raiz quadrada é ${"%.2f".format(raiz)}")

    }else{
        val calc = num.pow(2)
        print("Este número $num é ímpar, e ele elevado ao quadrado é $calc " )
    }

}