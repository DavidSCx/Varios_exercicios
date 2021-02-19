package exercicios;

public class LojaDesconto {

	
	String produto;
	static double desconto;
	double valor;
	double total;
	
	LojaDesconto(){
		 desconto = 25.0/100;
	}
	
	LojaDesconto (String produtoI, double valorI){
	  produto = produtoI;
	  valor = valorI;
			  
	}
	
	double Loja (){	
		desconto = valor * desconto;
		return total = valor - desconto;
	}
}
