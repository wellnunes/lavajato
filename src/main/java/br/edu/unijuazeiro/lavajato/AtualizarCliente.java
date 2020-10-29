package br.edu.unijuazeiro.lavajato;


import br.edu.unijuazeiro.lavajato.DAO.ClienteDAO;
import br.edu.unijuazeiro.lavajato.model.Cliente;

public class AtualizarCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();
        
        Cliente c = dao.findId(4);
        c.setNome("");
        c.setCpf("");
        dao.merge(c);
    }
}