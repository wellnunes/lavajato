package br.edu.unijuazeiro.lavajato.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.lavajato.model.Cliente;

public class ClienteDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lava-Jato");
    EntityManager em = emf.createEntityManager();
    
    public List<Cliente> listAll() {
        return em.createQuery("from Cliente", Cliente.class).getResultList();
    }

    public Cliente findId(int id) {
        return em.find(Cliente.class, id);
    }

    public void persist(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void merge(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void remove(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
