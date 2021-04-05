/* * Lógica do Desafio:
        . Paula inventou um pequeno passatempo: 3 CARACTERES (Exemplo de estrutura desejada: NúmeroLetraNúmero);
        . Condições: 1º. Letra maiúscula subtrai o primeiro dígito do segundo (Estrutura: N1AN2 = N1 - N2);
                     2º. Letra minúscula somar o primeiro com o segundo (Estrutura: N1aN2 = N1 + N2);
                     3º. Dígitos iguais deve-se desconsiderar a letra e multiplicar o primeiro com o segundo (Estrutura: N1aN1 | N1AN1 | N2aN2 | N2AN2 = N1 * N2);
        . Objetivo: Encontrar uma solução, em programação, que tenha como resultado a respectiva lógica de entrada;

    * ENTRADA:
        . Primeira linha: número inteiro que respeita a lógica de Paula;
        . Condição da sequência: 1º. Primeira posição um CARACTERE de 0..9;
                                 2º. Segunda posição uma LETRA (maiúsucla ou minúscula) de 1..26;
                                 3º. Teceira posição um CARACTERE de 0..9.

    * SAÍDA:
        . Para CADA CASO DE TESTE (lista/Array/Mutable) DEVE-SE ter um número inteiro como o primerio elemento;
 */

fun main() {
    // Número de testes.
    val n = readLine()!!.toInt()
    // Lista de números.
    val listNumb = mutableListOf<Int>()
    // Lista de String.
    var listStr: List<String>
    // Primeiro número.
    var first:Int
    // Segundo número.
    var second:Int
    // Operação matemática: Somatória.
    var som:Int
    // Operação matemática: Subtração.
    var sub:Int
    // Operação matemática: Multiplicação.
    var prod:Int

    // Controle de fluxo for de contagem dos números testes para formação de listas.
    for (i in 1..n) {
        // Primeira entrada da lista (listStr) com a retirada dos espaços. Ou seja, elemento único.
        listStr = readLine()!!.split(" ")
        // Controle de fluxo interno ao primeiro. Segunda lista (a principal) a partir da Primeira lista (listStr) que dara a saída desejada.
        for (i in listStr){

            first = i.substring(2,3).toInt()
            second = i.substring(0,1).toInt()

            // Controle de Fluxo que representa a Condição das letras serem minúsculas. Ou seja, se for letra minúscula, usar a subtração.
            if (i.contentEquals(i.toLowerCase()) && first != second){

                som = first.plus(second)
                listNumb.add(som)
            }
            // Controle de Fluxo que representa a Condição das letras serem maiúsculas. Ou seja, se for letra maiúscula, usar a somatória;.
            if (i.contentEquals(i.toUpperCase()) && first != second){

                sub = first.minus(second)
                listNumb.add(sub)
            }
            // Controle de Fluxo que representa a Condição dos números serem iguais. Ou seja, se os números forem iguais, usar a multiplicação.
            if (i.substring(0,1) == i.substring(2,3)){

                prod = first.times(second)
                listNumb.add(prod)
            }
        }
    }
    for (s in listNumb){
        println(s)
    }
}