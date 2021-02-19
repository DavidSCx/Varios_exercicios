package exercicios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean trabalho1 = true; 
		boolean trabalho2 = true;
		boolean sorvete = false;
		
		if (trabalho1 == true && trabalho2 == true || sorvete == !false) {
		
			
		System.out.println("Vamos comprar TV 50 polegadas e Tomar Sorvete no Shopping");
		}
		else if(trabalho1 == true || trabalho2 == false || sorvete == !false){
		
		System.out.println("Vamos comprar TV 32 polegadas e Tomar Sorvete no Shopping");
		}
		
		else {
		System.out.println("A Familia fica em casa com fome mas com saude porque nao comeu sorvete");	
		}
}
	}

