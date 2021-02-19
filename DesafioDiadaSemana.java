package exercicios;

import javax.swing.JOptionPane;

public class DesafioDiadaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double resultado;
		
		resultado = Double.parseDouble(JOptionPane.showInputDialog("Digite o Numero do dia da Semana"));
		
		if (resultado <= 0 || resultado >= 8)
			System.out.println("Não Confere com nenhum Dia");
		else if (resultado == 2) {
			System.out.println("Segunda");
		}
		else if (resultado == 3) {
			System.out.println("Terça");
		}
		else if (resultado == 4) {
			System.out.println("Quarta");
		}
		else if (resultado == 5) {
			System.out.println("Quinta");
		}
		else if (resultado == 6) {
			System.out.println("Sexta");
		}
		else if (resultado == 7) {
			System.out.println("Sabado");
		}
		else if (resultado == 1 ) {
			System.out.println("O dia é Domingo");
		}
		
}
}
