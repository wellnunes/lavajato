package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.CarroDAO;
import br.edu.unijuazeiro.lavajato.model.Carro;

public class BuscarCarro {

    public static void main(String[] args) {
    
        CarroDAO dao = new CarroDAO();

        Carro a = dao.findId(1);
        System.out.println("Id: " + a.getCodigo());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Marca: " + a.getMarca());
    }
}
