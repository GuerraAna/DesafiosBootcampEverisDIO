/* Resumo do Desafio 7:
  . Observar os níveis das tartarugas na tabela apresentada;
  . N1 v < 10cm/h;
  . N2 10cm/h < v < 20cm/h;
  . N3 v >= 20cm/h;
  . Objetivo: Identificar qual tartaruga é a mais veloz.
  - Entrada:. Múltiplos casos de teste;
            . Cada entrada tem duas linhas;
            . linha1) Número de tartarugas -> 1 <= L <= 500 (OBS: L: Int);
            . Linha2) Velocidade de cada tartaruga -> 1 <= Vi <= 50.
  - Saída: . 1 teste tem L tartarugas e v velocidade indicada como a maior;
*/

fun main() {
    // Controlador de fluxo para indicar a tartaruga rápida e lerda;
    while (true) {
        try {
            // Valor de entrada sentro revertido para um número primo;
            readLine()!!.toInt()
            // Objeto que defini a velocidade da tartaruga;
            val v = readLine()!!.split(" ").run { map { it.toInt() } }
            val sorted = v.toTypedArray()
            sorted.sort()
            // Controlador de fluxo que indica a velocidade da tartaruga;
            when (sorted.last()) {
                in 0 .. 9 -> {
                    println(1)
                }
                in 10 .. 19 -> {
                    println(2)
                }else -> {
                println(3)
            }
            }
        } catch (f: Exception) {
            break
        } catch (n: Exception) {
            break
        } catch (e: Exception) {
            break
        }
    }
}