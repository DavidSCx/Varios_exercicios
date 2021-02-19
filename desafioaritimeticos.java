package exercicios;

public class desafioaritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 3+2;
		double mult = 6 * soma;
		double pon = Math.pow(mult, 2);
		double mult2 = 3 *2;
		double resultadoa = 0;
		
		resultadoa = pon / mult2;
		
		System.out.println(resultadoa);
		
		int sub = 1-5;
		int sub1 = 2-7;
		double re = (double) sub * sub1;
		double re2 = re / 2;
		double re3 = Math.pow(re2, 2);
		double total1 = 0;
		System.out.println(re3);
		
		total1 = resultadoa - re3;
		total1 = Math.pow(total1, 3);
		
		double total2 = 0;
		total2 = total1 / (Math.pow(10, 3));
		
		System.out.println("O Resultado do Desafio é " + total2);
		
 	}

}
