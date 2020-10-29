package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.CarroDAO;
import br.edu.unijuazeiro.lavajato.model.Carro;

public class RemoverCarro {
    public static void main(String[] args) {

        CarroDAO dao = new CarroDAO();
        Carro p = dao.findId(2);
        System.out.println("Id: " + p.getCodigo());
        System.out.println("Nome: " +p.getNome());
        System.out.println("Marca: " + p.getMarca());
        dao.remove(p);
    }
}