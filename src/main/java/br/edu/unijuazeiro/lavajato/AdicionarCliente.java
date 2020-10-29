package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.ClienteDAO;
import br.edu.unijuazeiro.lavajato.model.Cliente;


public class AdicionarCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        Cliente c = new Cliente();
        c.setNome("Wellisson");
        c.setCpf("000.000.000-00");
        dao.persist(c);
    }
}






 