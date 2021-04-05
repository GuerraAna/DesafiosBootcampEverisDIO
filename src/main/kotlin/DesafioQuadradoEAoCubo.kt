// Função Principal com a propriedade de um array (tabela);
fun main(args: Array<String>) {
    // Objeto representando a contagem inicial;
    var r = 0
    // Controlador de fluxo for com a entrada sendo "transformada" em um número inteiro;
    for (i in 1..readLine()!!.toInt()) {
        // Saída com a lógica exigida pelo exercício;
        println("$i ${ i * i } ${ i * i * i }")
    }
}