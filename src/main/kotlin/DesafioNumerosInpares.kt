// Função principal;
fun main() {
    // Controlador de Fluxo for que é, basicamente, a lógica do exercício. Além disso, o limite do valor de entrada;
    for (i in 1.rangeTo(readLine()!!.toInt()).step(2)) {
        // Saída de um número primo e inteiro. Ou seja, o resultado da operação;
        println(i)
    }
}