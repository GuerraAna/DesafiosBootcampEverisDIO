/*
  Explicação do desafio 6:
  . Número Primo é aque dividido por 1 e por ele mesmo (Ex: 11);
  . Fazer um programa que aceite DIVERSOS VALORES (entrada "readLine()") e diga se cada um deles é PRIMO ou NÃO (use controle de fluco- if, when, while);
  . Ocorrência de conta, em um segundo;
  . Entrada: números (X) de casos de teste 1 <= Número Int <= 200;
  . Seguindo as linhas (N) 1 < N < 231 e as duas condições, é um PRIMO ou NÃO.
  . Saída: Use Prime para representar os números primos existentes e Not Prime para os números não primos;
*/
// Invocar o sqrt da biblioteca math do Kotlin.
import kotlin.math.sqrt

fun main() {
    //Entrada de um número qualquer.
    val n = readLine()!!.toInt()
    //Contagem em ordem crescente, do zero ao n.
    for (i in 0 until n) {
        val x = readLine()!!.toDouble()
        val prime = isPrime(x)
            print(prime)
    }
}
//Função de saída do resultado com Boolean para achar o True && False do Controle de Fluxo da fun isPrime.
fun print(prime:Boolean) {
    if (prime) {
            print("Prime\n")
    } else print("Not Prime\n")
}
//Função do Controle de Fluxo para encontrar as condições desejadas (Prime or Not Prime).
fun isPrime(num:Double):Boolean {
    //Resultado número 1 imprime na fun print o false (Not Prime)
    if (num < 2) return false
    //Resultado de resto 2 (pares): False (Not Prime)
    if (num % 2 == 0.0) return num == 2.0
    val root = sqrt(num).toInt()
    var i = 3
    //Resultado menor ou igual a raiz do if de cima: False (Not Prime).
    while (i <= root) {
        if (num % i == 0.0) return false
        i += 2
    }
    //Saída contraditória as condições: True (Prime).
    return true
}