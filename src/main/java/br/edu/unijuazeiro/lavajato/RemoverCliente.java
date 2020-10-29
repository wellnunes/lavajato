package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.ClienteDAO;
import br.edu.unijuazeiro.lavajato.model.Cliente;

public class RemoverCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        Cliente c = dao.findId(5);
        System.out.println("Id: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());
        dao.remove(c);
    }
}