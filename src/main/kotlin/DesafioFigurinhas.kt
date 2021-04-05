/*
  Resumo do Desafio 8)
  . Ricardo e Vicente;
  . Jogar "bafo" ou outro jogo com as figurinhas;
  . O normal é trocar figurinhas repetidas com os amigos;
  - Brincadeira Diferente:
                . Todos os amigos;
                . Todos com uma carta na mão;
                . Todos dão uma carta e recebem uma carta (amigo mais próximo);
                . Cada um contava quantas figurinhas tinha;
                . Pilhas do mesmo tamanho e igual para todos os amigos;
                . Cada amigo escolhe a pilha do outro para receber;
  - Entrada: A primeira linha (casos teste) contém 1 número, sendo 1 <= N <= 3000;
             Cada caso (quantidade de figurinhas de cada um) contem 2 números Inteiros F1 e F2 1 <= F1 || F2 <1000;
  - Saída: . Cada caso tem uma saída;
           . Cada caso representa o tamanho máximo da pilha de figurinhas que poderia ser trocada entre dois jogadores;
*/

//
fun main() {
    //Lista alternada.
    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }

        if(input.size == 2){
            val valorMdc = mdc(input[0], input[1])
            lista.add(valorMdc)
        }
    }
    for (i in lista){
        println(i)
    }
}
//Função do máximo divisor comum (ou recursiva).
fun mdc(n1: Int, n2: Int): Int{
    var resto: Int
    var n1 = n1
    var n2 = n2

    do{
        resto = n1 % n2
        n1 = n2
        n2 = resto
    }while (resto != 0)

    return n1
}