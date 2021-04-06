![image](https://user-images.githubusercontent.com/78937585/113632128-f8224180-9640-11eb-92ee-61379b1ff541.png)

# Desafios do Bootcamp everis Kotlin Developer - DIO 📄









## Introdução à Programação em Kotlin:

O objetivo destes desafios de codificação é praticar, através do desenvolvimento de algoritmos, os conceitos de pensamento computacional apresentados nas aulas do Bootcamp everis Kotlin Developer.



| Numeração do Desafio  |          Tema do Desafio           |  Tipo do Desafio   | Nível do Desafio |                   Resposta do Desafio                   |
| :-------------------: | :--------------------------------: | :----------------: | :--------------: | :-----------------------------------------------------: |
| [Desafio 1](#anchor1) | Introdução à Programação em Kotlin | Princípios Básicos |      Básico      |   [Resposta 1](src/main/kotlin/DesafioSomaSimples.kt)   |
| [Desafio 2](#anchor2) | Introdução à Programação em Kotlin | Princípios Básicos |      Básico      | [Resposta 2](src/main/kotlin/DesafioNumerosInpares.kt)  |
| [Desafio 3](#anchor3) | Introdução à Programação em Kotlin | Princípios Básicos |      Básico      | [Resposta 3](src/main/kotlin/DesafioQuadradoEAoCubo.kt) |



### <a id="anchor1"></a>[Desafio 1: Soma Simples](#anchor1)

<img src="https://img.freepik.com/icones-gratis/soma_318-10811.jpg?size=338&ext=jpg" alt="A soma de símbolo matemático | Ícone Gratis" style="zoom:33%;" />

#### Desafio

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de **SOMA**.
A seguir escreva o valor desta variável.

#### Entrada

O arquivo de entrada contém 2 valores inteiros.

#### Saída

Imprima a variável **SOMA** com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|             10              |         SOMA = 40         |
|             30              |                           |

| Segundo Exemplo de Entrada | Segundo Exemplo de Saída |
| :------------------------: | :----------------------: |
|            -30             |        SOMA = -20        |
|             10             |                          |

| Terceiro Exemplo de Entrada | Terceiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              0              |         SOMA = 0          |
|              0              |                           |



### <a id="anchor2"></a>[Desafio 2: Números Ímpares](#anchor2)

<img src="https://www.rpm.org.br/cdrpm/86/images/15.jpg" alt="RPM 86 - N3 como soma de N ímpares consecutivos" style="zoom:33%;" />

#### Desafio

Leia um valor inteiro **X** (1 <= **X** <= 1000). Em seguida mostre os ímpares de 1 até **X**, um valor por linha, inclusive o **X**, se for o caso.

#### Entrada 

O arquivo de entrada contém 1 valor inteiro qualquer.

#### Saída

Imprima todos os valores ímpares de 1 até **X**, inclusive **X**, se for o caso.

| Exemplo de Entrada | Exemplo de Saída |
| :----------------: | :--------------: |
|         8          |        1         |
|                    |        3         |
|                    |        5         |
|                    |        7         |



### <a id="anchor3"></a>[Desafio 3: Quadrado e ao Cubo](#anchor3)

<img src="http://blog.maxieduca.com.br/wp-content/uploads/2017/04/1.jpg" alt="Potências: tudo o que você precisa saber está aqui!" style="zoom: 50%;" />

#### Desafio

Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

#### Entrada 

O arquivo de entrada contém um número inteiro positivo N.

#### Saída

Imprima a saída conforme o exemplo fornecido..

| Exemplo de Entrada | Exemplo de Saída |
| :----------------: | :--------------: |
|         5          |      1 1 1       |
|                    |      2 4 8       |
|                    |      3 9 27      |
|                    |     4 16 64      |
|                    |     5 25 125     |





## Solucionando Problemas em Kotlin:

O objetivo destes desafios de codificação é praticar, através do desenvolvimento de algoritmos, os conceitos de pensamento computacional em Kotlin.

| Numeração do Desafio  |          Tema do Desafio          |  Tipo do Desafio   | Nível do Desafio |                     Resposta do Desafio                      |
| :-------------------: | :-------------------------------: | :----------------: | :--------------: | :----------------------------------------------------------: |
| [Desafio 1](#anchor4) | Solucionando Problemas com Kotlin | Princípios Básicos |      Básico      | [Resposta 1](src/main/kotlin/DesafioTaxaDeImpostoDeRenda.kt) |
| [Desafio 2](#anchor5) | Solucionando Problemas com Kotlin | Princípios Básicos |  Intermediário   |      [Resposta 2](src/main/kotlin/DesafioAreaDoCirculo)      |
| [Desafio 3](#anchor6) | Solucionando Problemas com Kotlin |     Matemática     |  Intermediário   |     [Resposta 3](src/main/kotlin/DesafioPrimoRapido.kt)      |
| [Desafio 4](#anchor7) | Solucionando Problemas com Kotlin | Princípios Básicos |      Básico      | [Resposta 4](src/main/kotlin/DesafioACorridaDeTartarugas.kt) |
| [Desafio 5](#anchor8) | Solucionando Problemas com Kotlin |     Matemática     |      Básico      |      [Resposta 5](src/main/kotlin/DesafioFigurinhas.kt)      |

### <a id="anchor4"></a>[Desafio 1: Desafio Taxa de Imposto de Renda](#anchor4)

![Imposto de renda: acertando as contas com o leão](data:image/jpeg;base64,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)

#### Desafio

Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1051_pt.png)

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

#### Entrada 

A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

#### Saída

Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|         R$ 3002,00          |         R$ 80,36          |

| Segundo Exemplo de Entrada | Segundo Exemplo de Saída |
| :------------------------: | :----------------------: |
|         R$ 1701,12         |          Isento          |

| Terceiro Exemplo de Entrada | Terceiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|         R$ 4520,00          |         R$ 355,60         |



### <a id="anchor5"></a>[Desafio 2: Área do Círculo](#anchor5)

![Blog Professor Ferretto](https://blog.professorferretto.com.br/wp-content/uploads/2019/11/diferenca-entre-circunferencia-e-circulo-300x156.png)

#### Desafio

A fórmula para calcular a área de uma circunferência é: **area = π . raio2**. Considerando para este problema que **π =** 3.14159:

\- Efetue o cálculo da área, elevando o valor de **raio** ao quadrado e multiplicando por **π**.

#### Entrada 

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável **raio**.

#### Saída

Apresentar a mensagem "A=" seguido pelo valor da variável **area**, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|            2.00             |        A = 12.5664        |

| Segundo Exemplo de Entrada | Segundo Exemplo de Saída |
| :------------------------: | :----------------------: |
|           100.64           |      A = 31819.3103      |

| Terceiro Exemplo de Entrada | Terceiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|           150.00            |      A = 70685.7750       |



### <a id="anchor6"></a>[Desafio 3: Primo Rápido](#anchor6)

<img src="https://static.escolakids.uol.com.br/2020/06/numeros-primos.jpg" alt="Números primos: o que são e como encontrá-los? - Escola Kids" style="zoom:33%;" />

#### Desafio

Mariazinha sabe que um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7 sem que haja resto. Então ela pediu para você fazer um programa que aceite diversos valores e diga se cada um destes valores é primo ou não. Acontece que a paciência não é uma das virtudes de Mariazinha, portanto ela quer que a execução de todos os casos de teste que ela selecionar (instâncias) aconteçam no tempo máximo de um segundo, pois ela odeia esperar.

#### Entrada 

A primeira linha da entrada contém um inteiro **N** (1 ≤ **N** ≤ 200), correspondente ao número de casos de teste. Seguem **N** linhas, cada uma contendo um valor inteiro **X** (1 < **X** < 231) que pode ser ou não, um número primo.

#### Saída

Para cada caso de teste imprima a mensagem “Prime” (Primo) ou “Not Prime” (Não Primo), de acordo com o exemplo abaixo.

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              3              |         Not Prime         |
|           123321            |         Not Prime         |
|             123             |           Prime           |
|             103             |                           |



### <a id="anchor7"></a>[Desafio 4: A Corrida de Tartarugas](#anchor7)

<img src="https://i.dlpng.com/static/png/6499753_preview.png" alt="Download Free png Turtle Race- Ticket Sale | Mokena, IL Patch - DLPNG.com" style="zoom: 33%;" />

#### Desafio

A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:



Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

#### Entrada 

A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro **L** (1 ≤ **L** ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém **L** inteiros **Vi** (1 ≤ **Vi** ≤ 50) representando as velocidades de cada tartaruga do grupo.

#### Saída

Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|             10              |             3             |
|   10 10 10 10 15 18 20 15   |             1             |
|            11 10            |             2             |
|             10              |                           |
|     1 5 2 9 5 5 8 4 4 3     |                           |
|             10              |                           |
|    19 9 1 4 5 8 6 11 9 7    |                           |



### <a id="anchor8"></a>[Desafio 5: Figurinhas](#anchor8)

<img src="https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1028.jpg" alt="img" style="zoom: 50%;" />

#### Desafio

Ricardo e Vicente são aficionados por figurinhas. Nas horas vagas, eles arrumam um jeito de jogar um “bafo” ou algum outro jogo que envolva tais figurinhas. Ambos também têm o hábito de trocarem as figuras repetidas com seus amigos e certo dia pensaram em uma brincadeira diferente. Chamaram todos os amigos e propuseram o seguinte: com as figurinhas em mãos, cada um tentava fazer uma troca com o amigo que estava mais perto seguindo a seguinte regra: cada um contava quantas figurinhas tinha. Em seguida, eles tinham que dividir as figurinhas de cada um em pilhas do mesmo tamanho, no maior tamanho que fosse possível para ambos. Então, cada um escolhia uma das pilhas de figurinhas do amigo para receber. Por exemplo, se Ricardo e Vicente fossem trocar as figurinhas e tivessem respectivamente 8 e 12 figuras, ambos dividiam todas as suas figuras em pilhas de 4 figuras (Ricardo teria 2 pilhas e Vicente teria 3 pilhas) e ambos escolhiam uma pilha do amigo para receber.

#### Entrada 

A primeira linha da entrada contém um único inteiro **N** (1 ≤ **N** ≤ 3000), indicando o número de casos de teste. Cada caso de teste contém 2 inteiros **F1** (1 ≤ **F1** ≤ 1000) e **F2** (1 ≤ **F2** ≤ 1000) indicando, respectivamente, a quantidade de figurinhas que Ricardo e Vicente têm para trocar.

#### Saída

Para cada caso de teste de entrada haverá um valor na saída, representando o tamanho máximo da pilha de figurinhas que poderia ser trocada entre dois jogadores.

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              3              |             4             |
|            8 12             |             9             |
|            9 27             |            37             |
|           259 111           |                           |





## Praticando Programação em Kotlin:

O objetivo destes desafios de codificação é praticar, através do desenvolvimento de algoritmos, os conceitos de pensamento computacional apresentados nas aulas e desafios anteriores.

|  Numeração do Desafio  |         Tema do Desafio          |  Tipo do Desafio   | Nível do Desafio |                     Resposta do Desafio                      |
| :--------------------: | :------------------------------: | :----------------: | :--------------: | :----------------------------------------------------------: |
| [Desafio 1](#anchor9)  | Praticando Programação em Kotlin |       Ad-Hoc       |      Básico      | [Resposta 1](src/main/kotlin/DesafioOJogoMatematicoDePaula.kt) |
| [Desafio 2](#anchor10) | Praticando Programação em Kotlin |     Matemática     |  Intermediário   | [Resposta 2](src/main/kotlin/DesafioConversaoSimplesDeBase.kt) |
| [Desafio 3](#anchor11) | Praticando Programação em Kotlin | Princípios Básicos |      Básico      |     [Resposta 3](src/main/kotlin/DesafioBobConduite.kt)      |

### <a id="anchor9"></a>[Desafio 1: O jogo de Matemática de Paula](#anchor9)

<img src="https://live.staticflickr.com/4814/46139556412_13f382d866_b.jpg" alt="Jogos educacionais no ensino de Matemática | Foto: Viktor … | Flickr" style="zoom:25%;" />

#### Desafio

Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.

Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.

#### Entrada 

A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere de '0' a '9'.

#### Saída

Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência proposta por Paula.

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              5              |             1             |
|             4A5             |             9             |
|             3A3             |             6             |
|             4f2             |             2             |
|             2G4             |            -6             |
|             7Z1             |                           |



### <a id="anchor10"></a>[Desafio 2: Conversão Simples de Base](#anchor10)

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1199.gif)

#### Desafio

Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

#### Entrada 

A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

#### Saída

Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todo número hexadecimal deve ser precedido na saída por '0x' (zero xis).

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              4              |            0x4            |
|              7              |            0x7            |
|             44              |           0x2C            |
|           0x80685           |          525957           |
|             -1              |                           |



### <a id="anchor11"></a>[Desafio 3: Bob Conduite](#anchor11)

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1589.jpg)

#### Desafio

Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem acima que ilustra um conduite) de maneira a passar os dois cabos por dentro dele.

Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?

#### Entrada 

Na primeira linha teremos um inteiro **T** (**T** ≤ 10000), indicando o número de casos de teste.

Na única linha de cada caso teremos dois números inteiros **R1** e **R2**, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.

#### Saída

Em cada caso, imprima o menor raio possível em uma única linha

| Primeiro Exemplo de Entrada | Primeiro Exemplo de Saída |
| :-------------------------: | :-----------------------: |
|              4              |             2             |
|             1 1             |            10             |
|             2 8             |            10             |
|             8 2             |                           |











