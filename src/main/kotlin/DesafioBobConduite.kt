/* * Dados do Desafio:
       1º Cabo: raio = R1 (Dim1 = 2R1);
       2º Cabo: raio = R2 (Dim2 = 2R2);
       1º Espaço à esquerda = E;
       2º Espaço no meio = M;
       3º Espaço à direita = D;
       Conduite (Cabo Total MAX): 2*R1 + 2*R2 + E + M + D.

   * Lógica do Desafio:
       . O Conduite precisa estar no seu MENOR RAIO, com o objetivo de caber os dois cabos no seu interior no "máximo";
       . Obs.: Devemos manter o tamanho do raio de cada cabo, o que reduzira são os espaços da esquerda, meio e direita;

   * Entrada:
       . Número de casos de testes = T, estará na primeira linha;
       . O número de casos de testes deve assumir a regra (T<=10000);
       . Os números serão inteiros e positivos;
       . Os números caberão em um inteiro normal de 32 bits;

    * Saída: Impressão dos valores possíveis para o R1 e R2

 */

import java.util.Scanner

fun main() {
    // Representação de uma lista mutável.
    val t = mutableListOf<Int>()
    // Operação matemática de soma que espera números ainda não definidos.
    var sum: Int
    // Controle de fluxo da primeira entrada de um valor que inicia a modificação da lista mutável.
    for (i in 1..readLine()!!.toInt()) {
        // Objetificando uma lista com a segunda entrada.
        val list = readLine()!!.split(" ").map { it.toInt() }
        // O objeto lista com o seu tamanho determinado
        if (list.size == 2){
            // A operação matemática soma com a somatória dos elementos da lista;
            sum = list[0] + list[1]
            // A lista estabelecida no início dos códigos com a soma inserida.
            t.add(sum)
        }
    }
    // Movimentação da lista mutável com os valores listados um por um em i.
    for (i in t) {
        println(i)
    }
}