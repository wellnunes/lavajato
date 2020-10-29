package br.edu.unijuazeiro.lavajato;

import java.util.List;

import br.edu.unijuazeiro.lavajato.DAO.CarroDAO;
import br.edu.unijuazeiro.lavajato.model.Carro;

public class ListarTodosCarros {
    public static void main(String[] args) {

        CarroDAO dao = new CarroDAO();
        List<Carro> carros = dao.listAll();
        for (Carro carro : carros) {
            System.out.println("Id: " + carro.getCodigo());
            System.out.println("Nome: " + carro.getNome());
            System.out.println("Marca: " + carro.getMarca());
        }
    }
}