programa
{ 	inclua biblioteca Matematica
	inclua biblioteca Util
	
  	inteiro estoque [] = {10,10,10,10,10,10,10,10,10,10} 
  	cadeia codigo[] = {"GRP0X-01","GRP0X-02","GRP0X-03","GRP0X-04","GRP0X-05","GRP0X-06","GRP0X-07","GRP0X-08","GRP0X-09","GRP0X-10"} 
     cadeia produto[] = {"BONÉ             ","CALÇA             ","BERMUDA         ","BATA             ","CAMISA             ","SAIA RODADA        ","SAIA STYLE       ","MACACÃO AFRO    ","CAMISETA TEMATICA","CALÇA SOCIAL AFRO"} 
     real valor [] = {100.00,150.00,90.00,140.00,150.00,90.00,90.00,150.00,100.00,95.50}   
     inteiro carrinho[] = {0,0,0,0,0,0,0,0,0,0,0,0}
     logico bugestranho = falso
         funcao inicio() 
         {
                 cadeia input 
  			  espaco(25)
                 escreva ("FomyStore \n\n")
                 espaco(26)
                 escreva ("Alberto \n")
                 linhas(60)
                 escreva ("\nDeseja comprar algo?: ") 
                 leia (input) 
  
                 se (input == "S" ou input == "s" ou input == "sim" ou input == "Sim"){
                 		limpa()
                         telaprimaria() 
                 }senao{ 
                 	pula(5)
                         escreva ("Obrigado por utilizar nosso programa!\n") 
                         linhas(60)
                         bugestranho = verdadeiro
                 } 
  
  
         } 
         funcao telaprimaria (){ 
                 espaco(36)
                 escreva ("FomyStore \n\n")
                 espaco(37)
                 escreva ("Alberto \n")
                 linhas(85)
                 pula(2)
                 
                 cadeia cod 
                 inteiro qntd 
                 cadeia conti = ""
                 inteiro qntdpos 
  
                 para(inteiro j = 0; j < 10; j++){ 
                         escreva(codigo[j], "\t") 
                         escreva(produto[j], "\t" ) 
                         escreva("Valor: ", valor[j], "\t") 
                         escreva("Estoque: ", estoque[j], "\t") 
                         escreva("Carrinho: ",carrinho[j], "\t") 
                         escreva("\n") 
                 }
                 linhas(85)
                 pula(1)
  
                 escreva ("\nSelecione o codigo do produto: ") 
                 leia(cod)
                 
          	  inteiro y = 0 
                 logico manoparalogo = falso
                 enquanto(manoparalogo == falso){
                 		y++
                 		logico passouseporaq = falso
                 	 
                         se(codigo[y] == cod) 
                         {
                         pula(1)
                         linhas(68)
                          escreva("\nCodigo:   ",codigo[y],"    Produto:   ",produto[y],"    Estoque:   ",estoque[y], "\n")
                         linhas(68)
                         pula(1)
                          escreva ("Qual a quantidade que deseja comprar?: ")
                          leia(qntd)
                          	se((qntd + carrinho[y]) > estoque[y]){
                          		escreva("\n\nVocê está excedendo o estoque! Escreva um número válido!!!\n\n")
                          		
                          		
                          	}
                          	senao se(qntd + carrinho[y] <= 0){
                          		limpa()
                          		escreva("\n\nNúmero inválido, ou você tirou esse item do carrinho.\n\n")
                          		telaprimaria()
                          	}
                          senao{
                          passouseporaq = verdadeiro
                          carrinho[y] += qntd
                          escreva ("\n\nQuer continuar sua compra?:\n")
                          leia(conti)
                          }
                         }
                         se(codigo[y] != cod e y == 9){
                         	y = 0
                         	se(cod == "GRP0X-01"){
                         pula(1)
                         linhas(68)
                          escreva("\nCodigo:   ",codigo[y],"    Produto:   ",produto[y],"    Estoque:   ",estoque[y], "\n")
                         linhas(68)
                         pula(1)
                          escreva ("Qual a quantidade que deseja comprar?: ")
                          leia(qntd)
                          	se((qntd + carrinho[y]) > estoque[y]){
                          		escreva("\n\nVocê está excedendo o estoque! Escreva um número válido!!!\n\n")
                          		
                          		
                          	}
                          	senao se(qntd + carrinho[y] <= 0){
                          		limpa()
                          		escreva("\n\nNúmero inválido, ou você tirou esse item do carrinho.\n\n")
                          		telaprimaria()
                          	}
                          senao{
                          
                          carrinho[y] += qntd
                          escreva ("\n\nQuer continuar sua compra?:\n")
                          leia(conti)
                          passouseporaq = verdadeiro
                          }
                         }
                         senao se(bugestranho == falso){
                         	escreva ("Desculpe, mas não consegui encontrar seu produto, digite novamente:\n")
                         	leia(cod)}
                         	
                         	
                         	
                         }
                         se (conti == "S" ou conti == "s" ou conti == "sim" ou conti == "Sim"){
                         	telaprimaria()
                         }
                         senao se(conti == "N" ou conti == "n" ou conti == "não" ou conti == "Não" ou conti == "nao" ou conti == "Nao"){
                         	carrinhos()
                     		manoparalogo = verdadeiro
                 
                         }
                         senao se(passouseporaq == verdadeiro){
                         	enquanto(conti != "S" e conti != "s" e conti != "sim" e conti != "Sim" e conti != "N" e conti != "n" e conti != "não" e conti != "Não" e conti != "nao" e conti != "Nao"){
                         	escreva ("\nDesculpe, mas não entendi, digite novamente:\n")
                          	leia(conti)}
                         }
                    
                         se(y + 1 == 10){
                         	y = 0
                         }
  					
                 
                 }

  
         } 
  		funcao carrinhos (){
  			limpa()
  			espaco(32)
  			escreva("CARRINHO DE COMPRAS\n")
  			linhas(84)
  			real valorTotal = 0.00
  			para(inteiro r = 0; r <= 9; r++){
  				se(carrinho[r] > 0){
  					escreva("\n",codigo[r], "\t") 
                         escreva(produto[r], "\t" ) 
                         escreva("Valor: ", valor[r], "\t") 
                         escreva("Estoque: ", estoque[r], "\t") 
                         escreva("Carrinho: ",carrinho[r], "\t")
                         escreva("\n")
                         valorTotal += (carrinho[r] * valor[r])
  				}
  			}
  			linhas(84)
  			
  			cadeia carrinhocerto
  			escreva("\nO valor total dos produtos: ",Matematica.arredondar((valorTotal * 1.09), 2),", sendo ",Matematica.arredondar((valorTotal * 0.09), 2)," de imposto.")
  			pula(2)
  			escreva("\nDeseja confirmar a compra?\n")
  			leia(carrinhocerto)
  			se(carrinhocerto == "S" ou carrinhocerto == "s" ou carrinhocerto == "Sim" ou carrinhocerto == "sim"){
  				inteiro escolhagamer = 0
  				escreva("\n\nOPÇÕES DE PAGAMENTO\n\n1 - A VISTA COM 10% DESCONTO: ",Matematica.arredondar((valorTotal * 0.9), 2))
  				escreva("\n2 - NO CARTÃO COM 10% DE JUROS: ",Matematica.arredondar((valorTotal * 1.10), 2))
  				real parcela1 = ((valorTotal / 2) * 1.15)
  				real parcela2 = parcela1 * 1.15
  				escreva("\n3 - NO CARTÃO EM DUAS VEZES COM 15% DE JUROS\n\n")
  				escreva("Digite o número da opção que deseja utilizar:\n")
  				leia(escolhagamer)
  				se(escolhagamer == 1){
  					cadeia RESPOSTAGAMER
  					escreva("\nValor total com 10% de desconto: ",Matematica.arredondar((valorTotal * 0.9), 2))
  					escreva("\nConfirmar?\n")
  					leia(RESPOSTAGAMER)
  					se(RESPOSTAGAMER == "S" ou RESPOSTAGAMER == "s"){
						limpa()
  						pula(1)
  						pula(3)
  						espaco(34)
						escreva("Obrigado pela compra!!!")
						pula(3)
  						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------.........---------------------------")pula(1)
						espaco(11)escreva("---------------------------------.     .    .--------------------------")pula(1)
						espaco(11)escreva("--------------------------------.     .    .    .----------------------")pula(1)
						espaco(11)escreva("------------------------------- .    .    .   .    .-------------------")pula(1)
						espaco(11)escreva("---------------------------------.  .    .   .       .-----------------")pula(1)
						espaco(11)escreva("----------------------------------....      .         .----------------")pula(1)
						espaco(11)escreva("--------------------------------      '''''....      .-----------------")pula(1)
						espaco(11)escreva("------------------------------- ///////////   ........-----------------")pula(1)
						espaco(11)escreva("-------------------------------/////////////.........------------------")pula(1)
						espaco(11)escreva("------------------------------///......////#..-------------------------")pula(1)
						espaco(11)escreva("-----------------------------//..@....@..///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------///...\\_/....///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------(///........///###-------------------------")pula(1)
						espaco(11)escreva("-----------------------------(////////////##&--------------------------")pula(1)
						espaco(11)escreva("-------------------------------(////////(#-----------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(4)
  						linhas(100)
						pula(1)
  						espaco(40)
  						escreva("NOTA FISCAL\n")
  						linhas(100)
  						pula(1)
  						para(inteiro r = 0; r <= 9; r++){
  						se(carrinho[r] > 0){
  						escreva("\n",codigo[r], "\t") 
                         	escreva(produto[r], "\t" ) 
                         	escreva("Valor: ", valor[r], "\t") 
                         	escreva("Quantidade ",carrinho[r], "\t")
                         	escreva("\n")
                         	estoque[r] -= carrinho[r]
                         	carrinho[r] = 0
                         	
  					}
  				}
  						pula(1)
  						valorTotal *= 0.9
                         	escreva("\nValor total + imposto: ",Matematica.arredondar((valorTotal * 1.09), 2),"\n\nImposto: ",Matematica.arredondar((valorTotal * 0.09), 2),"\n")
						
						linhas(100)
						pula(7)
						
                         	
                         	inicio()
  					}
  					senao
  					{
  						carrinhos()
  					}
  					
  				}
  				se(escolhagamer == 2){
  					cadeia RESPOSTAGAMER
  					escreva("\nValor total com 10% de juros: ",Matematica.arredondar((valorTotal * 1.1), 2))
  					escreva("\nConfirmar?\n")
  					leia(RESPOSTAGAMER)
  					se(RESPOSTAGAMER == "S" ou RESPOSTAGAMER == "s"){
  						limpa()
  						pula(1)
  						pula(3)
  						espaco(34)
						escreva("Obrigado pela compra!!!")
						pula(3)
  						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------.........---------------------------")pula(1)
						espaco(11)escreva("---------------------------------.     .    .--------------------------")pula(1)
						espaco(11)escreva("--------------------------------.     .    .    .----------------------")pula(1)
						espaco(11)escreva("------------------------------- .    .    .   .    .-------------------")pula(1)
						espaco(11)escreva("---------------------------------.  .    .   .       .-----------------")pula(1)
						espaco(11)escreva("----------------------------------....      .         .----------------")pula(1)
						espaco(11)escreva("--------------------------------      '''''....      .-----------------")pula(1)
						espaco(11)escreva("------------------------------- ///////////   ........-----------------")pula(1)
						espaco(11)escreva("-------------------------------/////////////.........------------------")pula(1)
						espaco(11)escreva("------------------------------///......////#..-------------------------")pula(1)
						espaco(11)escreva("-----------------------------//..@....@..///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------///...\\_/....///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------(///........///###-------------------------")pula(1)
						espaco(11)escreva("-----------------------------(////////////##&--------------------------")pula(1)
						espaco(11)escreva("-------------------------------(////////(#-----------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(4)
  						linhas(100)
						pula(1)
  						espaco(40)
  						escreva("NOTA FISCAL\n")
  						linhas(100)
  						pula(1)
  						para(inteiro r = 0; r <= 9; r++){
  						se(carrinho[r] > 0){
  						escreva("\n",codigo[r], "\t") 
                         	escreva(produto[r], "\t" ) 
                         	escreva("Valor: ", valor[r], "\t")  
                         	escreva("Quantidade ",carrinho[r], "\t")
                         	escreva("\n")
                         	estoque[r] -= carrinho[r]
                         	carrinho[r] = 0
                         	
  					}
  				}
  						valorTotal *= 1.1
                         	escreva("\nValor total + imposto: ",Matematica.arredondar((valorTotal * 1.09), 2),"\n\nImposto: ",Matematica.arredondar((valorTotal * 0.09), 2),"\n")
						linhas(100)
						pula(7)
                         	
                         	inicio()
  					}
  					senao
  					{
  						carrinhos()
  					}
  					
  				}
  				se(escolhagamer == 3){
  					cadeia RESPOSTAGAMER
  					escreva("\nParcela 1: ",Matematica.arredondar(parcela1, 2),"\nParcela 2: ",Matematica.arredondar(parcela2, 2),"\nValor total: ",Matematica.arredondar((parcela1 + parcela2), 2))
  					escreva("\nConfirmar?\n")
  					leia(RESPOSTAGAMER)
  					se(RESPOSTAGAMER == "S" ou RESPOSTAGAMER == "s"){
  						limpa()
  						pula(1)
  						pula(3)
  						espaco(34)
						escreva("Obrigado pela compra!!!")
						pula(3)
  						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------.........---------------------------")pula(1)
						espaco(11)escreva("---------------------------------.     .    .--------------------------")pula(1)
						espaco(11)escreva("--------------------------------.     .    .    .----------------------")pula(1)
						espaco(11)escreva("------------------------------- .    .    .   .    .-------------------")pula(1)
						espaco(11)escreva("---------------------------------.  .    .   .       .-----------------")pula(1)
						espaco(11)escreva("----------------------------------....      .         .----------------")pula(1)
						espaco(11)escreva("--------------------------------      '''''....      .-----------------")pula(1)
						espaco(11)escreva("------------------------------- ///////////   ........-----------------")pula(1)
						espaco(11)escreva("-------------------------------/////////////.........------------------")pula(1)
						espaco(11)escreva("------------------------------///......////#..-------------------------")pula(1)
						espaco(11)escreva("-----------------------------//..@....@..///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------///...\\_/....///##-------------------------")pula(1)
						espaco(11)escreva("----------------------------(///........///###-------------------------")pula(1)
						espaco(11)escreva("-----------------------------(////////////##&--------------------------")pula(1)
						espaco(11)escreva("-------------------------------(////////(#-----------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(1)
						espaco(11)escreva("-----------------------------------------------------------------------")pula(4)
  						linhas(100)
						pula(1)
  						espaco(40)
  						escreva("NOTA FISCAL\n")
  						linhas(100)
  						pula(1)
  						para(inteiro r = 0; r <= 9; r++){
  						se(carrinho[r] > 0){
  						escreva("\n",codigo[r], "\t") 
                         	escreva(produto[r], "\t" ) 
                         	escreva("Valor: ", valor[r], "\t")  
                         	escreva("Quantidade ",carrinho[r], "\t")
                         	escreva("\n")
                         	estoque[r] -= carrinho[r]
                         	carrinho[r] = 0
                         	
  					}
  				}
                         	escreva("\nValor total + imposto: ",Matematica.arredondar(((parcela1 + parcela2) * 1.09), 2),"\n\nImposto: ",Matematica.arredondar(((parcela1 + parcela2) * 0.09), 2),"\n")
                         	
						linhas(100)
						pula(7)
                         	
                         	inicio()
  					
  					}
  					senao
  					{
  						carrinhos()
  					}
  					
  				}
  				
  				
  			}
  			senao se (bugestranho == falso){
  					inteiro escolhaimportante
  					escreva("\n\nVocê deseja:\n1 - Remover algo do carrinho?\n2 - Continuar comprando?\n3 - Voltar ao carrinho?")
  					escreva("\nDigite o número da opção que você deseja escolher:\n")
  					leia(escolhaimportante)
  					
	  					se(escolhaimportante == 1){
	  						cadeia conti = ""
	  						cadeia cod2 = ""
	  						inteiro qntd2 = 0
	  						escreva ("\nSelecione o codigo do produto que deseja remover: ") 
	                 			leia(cod2)
	                 
	          	 			 inteiro y = 0 
	                 			logico manoparalogo = falso
	                 		enquanto(manoparalogo == falso){
	                 		y++
	                 		logico passouseporaq = falso
	                 	 
	                         se(codigo[y] == cod2) 
	                         {
	                         	se(carrinho[y] == 0){
	                         		escreva("\nHmm... parece que você não tem esse item em seu carrinho\nDigite o código novamente:")
	                         		leia(cod2)
	                         	}
	                         	senao{
	                         
	                         pula(1)
	                         linhas(68)
	                          escreva("\nCodigo:   ",codigo[y],"    Produto:   ",produto[y],"    Estoque:   ",estoque[y],"    Carrinho:   ",carrinho[y], "\n")
	                         linhas(68)
	                         pula(1)
	                          escreva ("Qual a quantidade que deseja remover?: ")
	                          leia(qntd2)
	                          qntd2 = -qntd2
	                          	se(qntd2 >= 0){
	                          		escreva("\n\nOcorreu um erro.\n\n")
	                          		carrinhos()
	                          		
	                          		
	                          	}
	                          	senao se(qntd2 + carrinho[y] == 0){
	                          		limpa()
	                          		carrinho[y] += qntd2
	                          		escreva("\n\nVocê tirou completamente esse item do carrinho.\n\n")
	                          		escreva ("\n\nDeseja voltar ao carrinho??:\n")
	                          		leia(conti)
	                          	}
	                          	senao se(qntd2 + carrinho[y] < 0){
	                          		escreva("\n\nOcorreu um erro.\n\n")
	                          		carrinhos()
	                          	}
	                          senao{
	                          passouseporaq = verdadeiro
	                          carrinho[y] += qntd2
	                          escreva ("\n\nDeseja voltar ao seu carrinho??:\n")
	                          leia(conti)
	                          }
	                         }}
	                         se(codigo[y] != cod2 e y == 9){
                         	y = 0
                         	se(cod2 == "GRP0X-01"){
	                         
	                         pula(1)
	                         linhas(68)
	                          escreva("\nCodigo:   ",codigo[y],"    Produto:   ",produto[y],"    Estoque:   ",estoque[y],"    Carrinho:   ",carrinho[y], "\n")
	                         linhas(68)
	                         pula(1)
	                          escreva ("Qual a quantidade que deseja remover?: ")
	                          leia(qntd2)
	                          qntd2 = -qntd2
	                          	se(qntd2 >= 0){
	                          		escreva("\n\nOcorreu um erro.\n\n")
	                          		carrinhos()
	                          		
	                          		
	                          	}
	                          	senao se(qntd2 + carrinho[y] == 0){
	                          		limpa()
	                          		carrinho[y] += qntd2
	                          		escreva("\n\nVocê tirou completamente esse item do carrinho.\n\n")
	                          		escreva ("\n\nDeseja voltar ao carrinho??:\n")
	                          		leia(conti)
	                          	}
	                          	senao se(qntd2 + carrinho[y] < 0){
	                          		escreva("\n\nOcorreu um erro.\n\n")
	                          		carrinhos()
	                          	}
	                          senao{
	                          passouseporaq = verdadeiro
	                          carrinho[y] += qntd2
	                          escreva ("\n\nDeseja voltar ao seu carrinho??:\n")
	                          leia(conti)
	                          }
	                         }
                         senao se(bugestranho == falso){
                         	escreva ("Desculpe, mas não consegui encontrar seu produto, digite novamente:\n")
                         	leia(cod2)}
                         	
                         	
                         	
                         }
	                         se (conti == "S" ou conti == "s" ou conti == "sim" ou conti == "Sim"){
	                         	inteiro valorTotal2 = 0
	                         	para(inteiro r = 0; r <= 9; r++){
			  				se(carrinho[r] > 0){
			                    valorTotal2 += (carrinho[r] * valor[r])
  				}
  							
  			}
  							se(valorTotal2 <= 0){
  								pula(5)
                         			escreva ("Desculpe, mas parece que você não tem nenhum item no carrinho\nVoltando ao menu de compras...\n") 
                         			Util.aguarde(5000)
                         			limpa()
                         			telaprimaria()
                         			
  								
  							}
  							senao{
	                         	carrinhos()
	                     		manoparalogo = verdadeiro
	                     		}
	                         }
	                         senao se(conti == "N" ou conti == "n" ou conti == "não" ou conti == "Não" ou conti == "nao" ou conti == "Nao"){
	                         	limpa()
	                         	escreva ("\n\nObrigado por utilizar nosso programa!\n")
	                         	manoparalogo = verdadeiro
	                         	linhas(60)
	                 
	                         }
	                         senao se(passouseporaq == verdadeiro){
	                         	enquanto(conti != "S" e conti != "s" e conti != "sim" e conti != "Sim" e conti != "N" e conti != "n" e conti != "não" e conti != "Não" e conti != "nao" e conti != "Nao"){
	                         	escreva ("\nDesculpe, mas não entendi, digite novamente:\n")
	                          	leia(conti)}
	                         }
	                    
	                         se(y + 1 == 10){
	                         	y = 0
	                         }
	  					
                 
                 }
  						
  					}
  					se(escolhaimportante == 2){
  						telaprimaria()
  					}
  					se(escolhaimportante == 3){
  						carrinhos()
  					}
  			}
  		}
  		
  		funcao linhas(inteiro tamanho){
  			para(inteiro z = 1; z <= tamanho; z++){
  				escreva("-")
  			}
  		}
  		funcao espaco(inteiro tamanho){
              para(inteiro z = 1; z <= tamanho; z++){
                  escreva(" ")
              }
          }
		funcao pula(inteiro tamanho){
              para(inteiro z = 1; z <= tamanho; z++){
                  escreva("\n")
              }
          }
}

  	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 19913; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */