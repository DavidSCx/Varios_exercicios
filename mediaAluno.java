package exercicios;

import javax.swing.JOptionPane;

public class mediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double media = 0, nota = 0, total = 0;
	int quantidadedenotas = 0;
	
	while (nota !=-1){
		nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota"));
		
		if (nota >=0 && nota <=10) {
		total +=nota;
		quantidadedenotas++;
	} else if (nota != -1) {
		System.out.println("Nota Invalida");
	}
		
	}
	
	media = total / quantidadedenotas;
System.out.println("A media da nota da turma é: " + media);
		
				
}
} 