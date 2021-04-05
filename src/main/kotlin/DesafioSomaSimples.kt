// Operação matemática: somatória.
fun soma(a:Int,b:Int) = a.plus(b)
// Função principal que contém a lógica para a resolução do exercício.
fun main() {
    // Primeira entrada a;
    val a = readLine()!!.toInt()
    // Segunda entrada b;
    val b = readLine()!!.toInt()
    // Saída do resuldado da fun soma utilizando as entradas a,b.
    println("SOMA = " + soma(a,b))
}