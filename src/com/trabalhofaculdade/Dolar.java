	package com.trabalhofaculdade;

//---------------CLASS FILHA DE Moeda ------------------
	public class Dolar extends Moeda {

//-------CONSTRUTOR OBRIGATÓRIO VINDO DA CLASS MÃE------		
		public Dolar(double valor) {
			super(valor);
	
		}
		
//------------MÉTODO OBRIGATÓRIO VINDO DE Moeda---------
//--É NECESSÁRIO PARA QUE HAJA UM CÂMBIO DE CONVERSÃO---
		@Override
		public double converter() {
//----------TRANSFORMA DOLAR PARA REAL------------------
			
			return this.valor * 5.29;
			
			
		}

//------------------INTERFACE PARA O PROGRAMA DAR AS INFORMAÇÕES SOBRE A QUANTIA DA MOEDA---------		
		@Override
		public void info() {
			System.out.println("|______________________________________________|");
			System.out.println("|                                              |");
			System.out.println("|             DÓLARES: " + valor + "                   |");
			System.out.println("|______________________________________________|");
		}
		
		
		
	}
		
		
		
	
		

