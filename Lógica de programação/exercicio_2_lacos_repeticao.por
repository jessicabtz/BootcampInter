programa
{
	
	funcao inicio()
	{
		inteiro numero, limite, contador, resultado
		
		escreva("Seja bem-vindo ao Tabuadas")
		//pede pro usuário o número da tabuada
		escreva("\nVocê quer ver a tabuada de qual número? ")
		leia(numero)
		//pede pro usuário o limite
		escreva("\n E qual o limite você quer para essa tabuada?")
		leia(limite)

		contador = 0

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
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */