// Exercício de se-senao
//Jéssica Beatriz

programa
{
	
	funcao inicio()
	{
		real janeiro, fevereiro, marco, abril, media, total
		cadeia nome
		
		escreva("Digite o seu nome: ")
		leia(nome)
		
		escreva("Digite o valor das suas vendas de janeiro: ")
		leia(janeiro)
		
		escreva("Digite o valor das suas vendas de fevereiro: ")
		leia(fevereiro)
		
		escreva("Digite o valor das suas vendas de março: ")
		leia(marco)
		
		escreva("Digite o valor das suas vendas de abril: ")
		leia(abril)

		total = janeiro + fevereiro + marco + abril
		media = total/4

		escreva(nome + ", seu total de vendas foi " + total + " e sua média de vendas foi:" + media)

		se (media>=7000){
			escreva( "\n" + "Parabéns," + nome + "!! Você receberá um bônus")
		}
		senao{
			escreva("\n" + "Você está no caminho certo," + nome + "! Continue se esforçando para receber bonificações")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */