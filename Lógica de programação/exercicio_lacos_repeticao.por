programa
{
	
	funcao inicio()
	{
		inteiro numero, limite, contador, resultado
		escreva("Seja bem-vindo ao Tabuadas")
		escreva("\nVocê quer ver a tabuada de qual número? ")
		leia(numero)

		contador = 0
		limite = 10

		faca{
			resultado = numero * contador
			escreva(numero + " X " + contador + " = " + resultado + "\n")
			contador ++
		}enquanto(contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */