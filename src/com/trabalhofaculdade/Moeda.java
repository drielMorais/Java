package com.trabalhofaculdade;

import java.util.Objects;

//-----------CRIAÇÃO DE UMA CLASS ABSTRATA------------
//-----ESSA É A CLASS MÃE DAS Dolar, Euro e Real------
public abstract class Moeda {

//-----------CRIAÇÃO DE UMA CLASS PROTECTED-----------
//------PERMITE QUE SEJA USADA NAS OUTRAS CLASSES-----
	protected double valor;
	

//-----------CRIAÇÃO DE UM CONSTRUTOR-----------------
	public Moeda(double valor) {
		this.valor = valor;
	
}
//CRIAÇÃO DE UMA CLASS ABSTRATA PARA SER USADA NAS CLASS FILHAS
//SERÁ USADA PARA DAR INFORMAÇÃO DE CADA MOEDA COMO: Nome + Valor
	public abstract void info();
	
//AQUI CADA MOEDA PASSARÁ INFORMAÇÕES DO SEU VALOR	
	public abstract double converter();


//---------------IMPLEMENTO DO HASHCODE---------------
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	
//--------------IMPLEMENTAÇÃO DO EQUALS--------------
//Aqui o Equals vai verificar se o conteúdo das 3 moedas são identicos
//para que o Java não se confunda.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	

	
}
	
	
