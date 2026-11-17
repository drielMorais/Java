package com.trabalhofaculdade;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//-----------------IMPLEMENTAÇÃO DO OBJETO-------------------
		Cofrinho meuCofre = new Cofrinho();
		MoedaEscolha opcao1 = new MoedaEscolha();
		
//------SCANNER PARA ENTRADA DE TECLADO E INTERAÇÃO COM O MENU-------
		Scanner escolhaMenu = new Scanner(System.in);

		
		
		
//----------IMPLEMENTAÇÃO DO MENU PRINCIPAL--------------	
		
/*Foi implementado um Menu na class "MoedaEscolha" que cria uma interface
* para que o usuário possa interagir melhor, lá foi criado as 4 opções
* que permitem add moedas, removê-las, listá-las e converté-las*/
		
		opcao1.escolha1();
//-------------------------------------------------------
		
		
//-----------IMPLEMENTAÇÃO DA LÓGICA DO MENU-------------
		while (true) {	

//--ENTRADA DE TECLADO PARA ESCOLHA DAS OPÇÕES DO MENU---
				System.out.printf("DIGITE UM NÚMERO: >>>");
				int opcaoCofre1 = escolhaMenu.nextInt();
//-------------------------------------------------------					

				
				
//---------------LÓGICA DE ESCOLHA DAS OPÇÕES------------
//---LÓGICA DE ESCOLHA PARA A OPÇÃO "Adicionar Moedas"---
				if(opcaoCofre1 == 1) {
					
//----------------MENU DA ESCOLHA DAS MOEDAS-------------
					opcao1.escolhaMoeda();
//-------------------------------------------------------
					

//----------------------------ESCOLHA DO TIPO DE MOEDA------------------------------ 					
					System.out.println("ESCOLHA QUAL TIPO DE MOEDA: >>>");
					int opcaoMoedaTipo = escolhaMenu.nextInt();
	
					switch(opcaoMoedaTipo) {

//----------------------------OPÇÃO DE ADICIONAR DÓLAR------------------------------					
					case 1:
						System.out.println("DIGITE A QUANTIDADE: >>>");
						int qtdDolar = escolhaMenu.nextInt();
						meuCofre.adicionar(new Dolar(qtdDolar));
						System.out.println(">>> " + qtdDolar + " Dólar(es) adicionado(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno1 = escolhaMenu.nextInt();
							if(opcaoRetorno1 == 0) {
								opcao1.escolha1();	
							}	
									break;
//----------------------------OPÇÃO DE ADICIONAR EURO-------------------------------
					case 2: 
						System.out.println("DIGITE A QUANTIDADE: >>>");
						int qtdEuro = escolhaMenu.nextInt();
						//ADICAO DE EURO ADICIONADO COM SUCESSO
						meuCofre.adicionar(new Euro(qtdEuro));
						System.out.println(">>> " + qtdEuro + " Euro(es) adicionado(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno2 = escolhaMenu.nextInt();
							if(opcaoRetorno2 == 0) {
								opcao1.escolha1();	
							}	
									break;
//----------------------------OPÇÃO DE ADICIONAR REAL------------------------------					
					case 3: //Real
						System.out.println("DIGITE A QUANTIDADE: >>>");
						int qtdReal = escolhaMenu.nextInt();
						//ADICAO DE EURO ADICIONADO COM SUCESSO
						meuCofre.adicionar(new Real(qtdReal));
						System.out.println(">>> " + qtdReal + " Real(Reais) adicionado(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno3 = escolhaMenu.nextInt();
							if(opcaoRetorno3 == 0) {
								opcao1.escolha1();	
							}	
									break;
//--------------------------CASO A ENTRADA SEJA INVÁLIDA---------------------------									
					default: 
						System.out.println("Opção Inválida de Moeda");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno4 = escolhaMenu.nextInt();
							if(opcaoRetorno4 == 0) {
								opcao1.escolha1();	
							}			
					}

				}//---------------FIM DO MENU "Adicionar Moeda"--------------------

	
//------------------------INÍCIO DO MENU REMOVER MOEDA-----------------------------				
				else if(opcaoCofre1 == 2) {

					
//----------INSERÇÃO DO INPUT QUE DECIDE QUE TIPO DE MOEDA SERÁ REMOVIDA-----------
					opcao1.escolhaMoeda();
					System.out.println("ESCOLHA QUAL TIPO DE MOEDA: >>>");
					int opcaoMoedaRemover = escolhaMenu.nextInt();
				
//-----------------------ESCOLHA DE QUAL MOEDA PARA REMOVER------------------------					
				switch(opcaoMoedaRemover) {
//---------------------------------------------------------------------------------
				
//-------------------------BLOCO DE REMOÇÃO DE DÓLAR-------------------------------
				case 1:
					meuCofre.listagemMoedas();
					
/*O Cofre somente permitirá a remoção de cédulas exatas, isto é, não é possível remover uma cédula
* sem ser seu valor exato, você, simplesmente, não poderá remover 50 DÓLARES se só houver uma cédula
* de 100 DÓLARES*/
					System.out.println("DIGITE A QUANTIDADE ***EXATA*** DE DÓLARES: >>>");
					int qtdRemoveDolar = escolhaMenu.nextInt();
					Dolar dolarParaRemover = new Dolar(qtdRemoveDolar);
					//int contarMoedas = meuCofre.contarDolares();
					if(!meuCofre.existeMoeda(dolarParaRemover)) {
						System.out.println("OPS...VOCÊ NÃO POSSUI UMA CÉDULA EXATA DE " + qtdRemoveDolar + 
								" dólares");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno4 = escolhaMenu.nextInt();
							if(opcaoRetorno4 == 0) {
								opcao1.escolha1();
						}
					else {
						meuCofre.remover(new Dolar(qtdRemoveDolar));
						System.out.println(">>> " + qtdRemoveDolar + " Dólar(es) Removido(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno5 = escolhaMenu.nextInt();
							if(opcaoRetorno5 == 0) {
								opcao1.escolha1();	
							}
					}	
					break;
					}
						
//------------------------------FIM DO BLOCO DO DÓLAR------------------------------					
								
								
//-------------------------BLOCO DE REMOÇÃO DE EURO--------------------------------								
				case 2:
					meuCofre.listagemMoedas();
					
/*O Cofre somente permitirá a remoção de cédulas exatas, isto é, não é possível remover uma cédula
 * sem ser seu valor exato, você, simplesmente, não poderá remover 50 EUROS se só houver uma cédula
 * de 100 EUROS*/
					System.out.println("DIGITE A QUANTIDADE ***EXATA*** DE EURO: >>>");
					int qtdRemoveEuro = escolhaMenu.nextInt();
					Euro euroParaRemover = new Euro(qtdRemoveEuro); 
					if(!meuCofre.existeMoeda(euroParaRemover)) {
						System.out.println("OPS...VOCÊ NÃO POSSUI UMA CÉDULA EXATA DE " + qtdRemoveEuro + 
								" euros");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno4 = escolhaMenu.nextInt();
							if(opcaoRetorno4 == 0) {
								opcao1.escolha1();
						}
							}	
					else {
						meuCofre.remover(new Euro(qtdRemoveEuro));
						System.out.println(">>> " + qtdRemoveEuro + " Euro(s) Removido(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno5 = escolhaMenu.nextInt();
							if(opcaoRetorno5 == 0) {
								opcao1.escolha1();	
							}
					}
				
								break;
//------------------------------FIM DO BLOCO DO EURO-------------------------------								
								
								
//-------------------------BLOCO DE REMOÇÃO DE REAL--------------------------------								
				case 3:
					meuCofre.listagemMoedas();

/*O Cofre somente permitirá a remoção de cédulas exatas, isto é, não é possível remover uma cédula
* sem ser seu valor exato, você, simplesmente, não poderá remover 50 REAIS se só houver uma cédula
* de 100 REAIS*/
					System.out.println("DIGITE A QUANTIDADE ***EXATA*** DE REAL: >>>");
					int qtdRemoveReal = escolhaMenu.nextInt();
					Real realParaRemover = new Real(qtdRemoveReal);
					if(!meuCofre.existeMoeda(realParaRemover)) {
						System.out.println("OPS...VOCÊ NÃO POSSUI UMA CÉDULA EXATA DE " + qtdRemoveReal + 
								" reais");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno4 = escolhaMenu.nextInt();
							if(opcaoRetorno4 == 0) {
								opcao1.escolha1();
						}
							}	
					else {
						meuCofre.remover(new Real(qtdRemoveReal));
						System.out.println(">>> " + qtdRemoveReal + " Real(Reais) Removido(s)"
								+ "com sucesso");
//---------------------OPÇÃO PARA VOLTAR AO MENU PRINCIPAL-------------------------					
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno5 = escolhaMenu.nextInt();
							if(opcaoRetorno5 == 0) {
								opcao1.escolha1();	
							}
					}	
								break;

//-------------------CASO SEJA INVÁLIDO A ESCOLHA DA MOEDA-------------------------								
				default: 
					System.out.println("Opção Inválida de Moeda");
//-------------------OPÇÃO DE RETORNAR AO MENU PRINCIPAL---------------------------				
					System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
					int opcaoRetorno2 = escolhaMenu.nextInt();
						if(opcaoRetorno2 == 0) {
							opcao1.escolha1();
					}		
				}//--------------------------FIM DO SWITCH-------------------------
				

}//----------------------FIM DO MENU "Remover Moeda"-------------------------------
				
				
//-----------------------INÍCIO DO BLOCO LISTAR MOEDAS-----------------------------
//--------------ENTRADA PARA CASO SEJA ESCOLHIDO A OPÇÃO "Listar Moedas"-----------
				else if(opcaoCofre1 == 3) {
					int totalDolar = meuCofre.contarDolares();
					int totalEuro = meuCofre.contarEuro();
					int totalReal = meuCofre.contarReal();
					if(totalDolar == 0 && totalEuro == 0 && totalReal == 0) {
						System.out.println("OPS...NÃO HÁ CÉDULAS/MOEDAS AQUI");
					}
					else {
					meuCofre.listagemMoedas();
					}
					System.out.println();
//--------------------------OPÇÃO DE RETORNAR AO MENU PRINCIPAL--------------------				
					System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
					int opcaoRetorno3 = escolhaMenu.nextInt();
						if(opcaoRetorno3 == 0) {
							opcao1.escolha1();
				}

				}
				
				
//-------------------INÍCIO DO BLOCO PARA CONVERTER MOEDAS--------------------------
					else if(opcaoCofre1 == 4) {
						double totalConvertido = meuCofre.totalConvertido();
						System.out.println("|______________________________________________|");
						System.out.println("|                                              |");
						System.out.printf("|        TOTAL EM REAIS: R$ %.2f       %n", totalConvertido);
						System.out.println("|______________________________________________|");	
						System.out.println("");
						System.out.println("DIGITE 0(ZERO) PARA VOLTAR AO MENU PRINCIPAL: >>>");
						int opcaoRetorno4 = escolhaMenu.nextInt();
							if(opcaoRetorno4 == 0) {
								opcao1.escolha1();
							}
									
}//------------------------FIM DO BLOCO "Remover Moedas"----------------------------
				
				
//-------------BLOCO PARA CASO SEJA ACIONADA A OPÇÃO FECHAR COFRE-------------------
					else if(opcaoCofre1 == 0) {
						System.out.println("AGRADEÇO SUA PRESENÇA, TRAGA MAIS MOEDAS (rsrs), ENCERRANDO PROGRAMA");
						return;
}//----------------------------FIM DO BLOCO DE ENCERRAMENTO-------------------------
				
				
//---------------------INÍCIO DO BLOCO PARA OPÇÕES INEXISTENTES---------------------				
					else if(opcaoCofre1 < 0 || opcaoCofre1 >4) {
						System.out.println("OPS...A OPÇÃO SELECIONADA NÃO EXISTE.");
						System.out.println();
						opcao1.escolha1();
}//---------------------------FIM DO BLOCO DE OPÇÕES INEXISTENTES-------------------
		}//-----------------FIM DO BLOCO DE CÓDIGOS DO WHILE (true)-----------------		
			}//-----------------FIM DO BLOCO DA CLASS Principal---------------------		
					}//-------------------------------------------------------------
