/*
Você deve calcular o consumo médio de um automóvel onde será informada a distância total
percorrida (em Km) e o total de combustível consumido (em litros).
*/

import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    //continue o código
    val x: Int = leitor.nextInt();
    val y: Float = leitor.nextFloat();

    val media:Float = x/y

    println(String.format("%.3f km/l", media));
}