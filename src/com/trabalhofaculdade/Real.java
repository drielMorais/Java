package com.trabalhofaculdade;

//---------------CLASS FILHA DE Moeda ------------------
public class Real extends Moeda {


//-------CONSTRUTOR OBRIGATÓRIO VINDO DA CLASS MÃE------	
	public Real(double valor) {
		super(valor);
		
	}

//------------MÉTODO OBRIGATÓRIO VINDO DE Moeda---------
//--É NECESSÁRIO PARA QUE HAJA UM CÂMBIO DE CONVERSÃO---
	@Override
	public double converter() {
		
		return valor;
	}

//------------------INTERFACE PARA O PROGRAMA DAR AS INFORMAÇÕES SOBRE A QUANTIA DA MOEDA---------	
	@Override
	public void info() {
		System.out.println("|______________________________________________|");
		System.out.println("|                                              |");
		System.out.println("|               REAIS: " + valor + "                   |");
		System.out.println("|______________________________________________|");
	}
		
}
	
	
	
	
	

