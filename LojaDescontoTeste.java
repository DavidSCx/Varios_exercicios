package exercicios;

import javax.swing.JOptionPane;

public class LojaDescontoTeste {

	public static void main(String[] args) {
		
		
		LojaDesconto ld1 = new LojaDesconto();
		
		ld1.produto = JOptionPane.showInputDialog("Digite o Nome do produto");
		ld1.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto"));
		LojaDesconto.desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Desconto"));
		
		if (LojaDesconto.desconto == 0) {
			LojaDesconto.desconto = 25.0/100;
			System.out.println("O valor do produto " + ld1.produto + " com Desconto é " + ld1.Loja());
			System.out.println("O valor do desconto da " + ld1.produto + " é " + LojaDesconto.desconto);
		}
			else {
		System.out.println("O valor do produto " + ld1.produto + " com Desconto é " + ld1.Loja());
		System.out.println("O valor do desconto da " + ld1.produto + " é " + LojaDesconto.desconto);
		
	}

}
}
