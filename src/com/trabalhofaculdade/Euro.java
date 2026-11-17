package com.trabalhofaculdade;


//---------------CLASS FILHA DE Moeda ------------------
public class Euro extends Moeda {

	
//-------CONSTRUTOR OBRIGATÓRIO VINDO DA CLASS MÃE------	
	public Euro(double valor) {
		super(valor);
		
	}

//------------MÉTODO OBRIGATÓRIO VINDO DE Moeda---------
//--É NECESSÁRIO PARA QUE HAJA UM CÂMBIO DE CONVERSÃO---
	@Override
	public double converter() {
		return this.valor * 6.14;
		
	}

//------------------INTERFACE PARA O PROGRAMA DAR AS INFORMAÇÕES SOBRE A QUANTIA DA MOEDA---------
	@Override
	public void info() {
		System.out.println("|______________________________________________|");
		System.out.println("|                                              |");
		System.out.println("|                EURO: " + valor + "                   |");
		System.out.println("|______________________________________________|");
	}
		
	}

