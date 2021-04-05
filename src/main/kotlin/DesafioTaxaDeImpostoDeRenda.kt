/*
Resumo do Desafio 4)
  .A moeda Loli é representada por R$;
  .Ler um valor flutuante (salário) com duas casas decimais (Float);
  .Imposto de Renda da tabela (Usar controle de fluxo, pode ser o "if" ou "when");
  .Ideia do Imposto de renda:
    1-> 0.0..2000.0 Imposto de Renda será nulo;
    2-> 2000.01..3000.00 Imposto de Renda é aplicado 8% em cima de 1/3 do salário que é 1000.00;
    3-> 3000.01..4500.00 Imposto de Renda é aplicado 8% em 1000.00 (valor "acumulativo") + 18% do restante.
    ...
*/
fun main() {
    //Entrada da Solução:
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val salario = readLine()!!.toFloat()
    val imposto: Float

    when {
        //Imposto de Renda Isento.
        salario in 0.0..2000.0 ->{
            println("Isento")
        }
        //8% de Imposto de Renda.
        salario in 2000.01..3000.00 ->{
            imposto = (salario - 2000) * 0.08.toFloat()
            println("R$ ${imposto.format(2)}")
        }
        //18% de Imposto de Renda.
        //Pense no exemplo dado, na questão: de R$3002.00. Uma parte do imposto fora cobrado 0,08 sobre R$1000,00 loli's e do restante tire R$3000,00 para sobrar R$2,00 e poder fazer 18% sobre ele;
        salario in 3000.01..4500.00 ->{
            imposto = (salario - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
            println("R$ ${imposto.format(2)}")
        }
        //28% de Imposto de Renda.
        //Se tivesse aumentado mais R$1000,00 o valor para subtrair seria 4000, como aumentou 1500, temos que multiplicar o valor por 0,18%.
        salario > 4500 ->{
            imposto = ((salario - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
            println("R$ ${imposto.format(2)}")
        }
    }
}