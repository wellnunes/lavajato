package br.edu.unijuazeiro.lavajato.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.lavajato.model.Carro;

public class CarroDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lava-Jato");
    EntityManager em = emf.createEntityManager();

    public List<Carro> listAll() {
        return em.createQuery("from Carro", Carro.class).getResultList();
    }

    public Carro findId(int id) {
        return em.find(Carro.class, id);
    }

    public void persist(Carro carro) {
        try {
            em.getTransaction().begin();
            em.persist(carro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void merge(Carro carro) {
        try {
            em.getTransaction().begin();
            em.merge(carro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void remove(Carro carro) {
        try {
            em.getTransaction().begin();
            em.remove(carro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
