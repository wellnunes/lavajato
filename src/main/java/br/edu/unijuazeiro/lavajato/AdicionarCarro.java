package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.CarroDAO;
import br.edu.unijuazeiro.lavajato.model.Cliente;
import br.edu.unijuazeiro.lavajato.model.Carro;

public class AdicionarCarro {
    public static void main(String[] args) {
        CarroDAO dao = new CarroDAO();

        Cliente c = new Cliente();
        c.setCodigo(1);

        Carro a = new Carro();
        a.setNome("Celta");
        a.setMarca("Chevrolet");
        a.setCliente(c);
        dao.persist(a);
    }   
}