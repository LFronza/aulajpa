package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Leonardo Fronza", "lfronza@email.com");
		Pessoa p2 = new Pessoa(2, "Jo?o da Silva", "jsilva@email.com");
		Pessoa p3 = new Pessoa(3, "Pedro de Oliveira", "poliveira@email.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
