package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

//		Pessoa p1 = new Pessoa(null, "Leonardo Fronza", "lfronza@email.com");
//		Pessoa p2 = new Pessoa(null, "Jo?o da Silva", "jsilva@email.com");
//		Pessoa p3 = new Pessoa(null, "Pedro de Oliveira", "poliveira@email.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa");

		EntityManager em = emf.createEntityManager();

//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();

//		Pessoa p = em.find(Pessoa.class, 1);
//
//		System.out.println(p);
		
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		

		System.out.println("OK!");
		
		em.clear();
		emf.close();

	}

}
