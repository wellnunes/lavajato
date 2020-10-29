package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.ClienteDAO;
import br.edu.unijuazeiro.lavajato.model.Cliente;

import java.util.List;


public final class ListarTodosClientes {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

         List<Cliente> clientes = dao.listAll();
         for (Cliente cliente : clientes) {
            System.out.println("Id: " + cliente.getCodigo());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        }
    }
}