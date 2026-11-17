package com.trabalhofaculdade;
import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	
//----------CRIAÇÃO DA LISTA QUE ARMAZENARÁ AS CÉDULAS DO COFRE------------	
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	
	public Cofrinho() {
		
		super();
		//this.listaMoedas = new ArrayList<>();
	}
//----------------------MÉTODO QUE ADICIONA MOEDAS-------------------------
	public void adicionar(Moeda cedula) {
		this.listaMoedas.add(cedula);
		System.out.println("Moeda adicionada com sucesso");
		
	}
//---------------------MÉTODO QUE REMOVE MOEDAS----------------------------
	public void remover(Moeda removerCedula) {
		this.listaMoedas.remove(removerCedula);
		
	}
//---------------------MÉTODO QUE LISTA MOEDAS-----------------------------	
	public void listagemMoedas() {
	
		for(Moeda listarMoeda : this.listaMoedas)
		listarMoeda.info();
	}

//--------------MÉTODO QUE CONVERTE TODAS AS MOEDAS PARA REAI--------------	
	public double totalConvertido() {
		double total = 0;
		
		for(Moeda totalConversao : this.listaMoedas) {
		total += totalConversao.converter();
	}
		return total;
	
	}
//---------------MÉTODO QUE CONTA A QUANTIDADE DE CÉDULAS------------------
/*Obs: Essa contagem que foi adicionada serve para que o programa consiga identificar
 * na listagem de moedas se há alguma cédula no cofrinho, cao não haja, ela não printa*/
//-------------------------------------------------------------------------------------	
//-------------------------CONTA QUANTAS CÉDULAS DE DOLAR EXISTEM----------------------
	public int contarDolares() {
		int qtdDolares = 0;
		
		for(Moeda totalDolar : listaMoedas) {
			if(totalDolar instanceof Dolar) {
				qtdDolares++;
			}
			
		}
		return qtdDolares;
	}
//-------------------------CONTA QUANTAS CÉDULAS DE EURO EXISTEM----------------------
		public int contarEuro() {
			int qtdDolares = 0;
			
			for(Moeda totalDolar : listaMoedas) {
				if(totalDolar instanceof Euro) {
					qtdDolares++;
				}
				
			}
			return qtdDolares;
		}
//------------------------CONTA QUANTAS CÉDULAS DE REAIS EXISTEM NO COFRE------------
		public int contarReal() {
			int qtdDolares = 0;
			
			for(Moeda totalDolar : listaMoedas) {
				if(totalDolar instanceof Real) {
					qtdDolares++;
				}
				
			}
			return qtdDolares;
//-----------------------FIM DOS MÉTODOS DE CONTAGEM DE CÉDULA----------------------
		}
//--------MÉTODO QUE VERIFICA SE A REMOÇÃO DA CÉDULA É EXATA OU INFERIOR------------
		public boolean existeMoeda (Moeda moeda) {
			return listaMoedas.contains(moeda);
			
		}

}
		

	

