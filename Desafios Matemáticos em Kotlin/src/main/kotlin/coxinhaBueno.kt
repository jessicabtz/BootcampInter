/*Em 2015 um novo record foi alcançado na competição de Coxinhas de Bueno de Andrada,
onde Mônica mandou pra dentro 43 coxinhas em apenas 10 minutos, passando se antecessor
que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014.
O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada, interior
de São Paulo, organiza essa competição todos os anos, mas nunca conseguiram entrar para o
livro dos recordes, o Guinness Book. Para isso, o restaurante precisa preencher informações
sobre a competição, como o número de coxinhas consumidas pelos competidores durante o evento.
Porém, como jó foi informado, a especialidade deles é coxinha, não matemática, então será
que você pode ajudá-los? Com base no número total de coxinhas consumidas e o número de
participantes na competição, o dono do restaurante precisa que você desenvolva um programa
para saber a quantidade média de coxinha que os participantes da competição conseguem devorar.
Ah, lembre que, em troca da sua ajuda, você poderá comer quantas coxinhas conseguir.
A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) indicando
respectivamente o número total de coxinhas consumidas e o número total de participantes na competição.
*/

import java.util.Scanner;

fun main(args: Array<String>) {
    //continue o codigo
    val leitor = Scanner(System.`in`);
    val s      = leitor.nextLine();
    val len    = s.length
    var x      = ""
    val i      = s.indexOf(" ")

    for (k in 0 until i){
        x  += s.get(k)
    }
    val H = x.toDouble()

    x = ""

    for (k in i+1 until len){
        x += s.get(k)
    }

    val P = x.toDouble()

    val media: Double = H / P;
    println(String.format("%.2f", media));
}