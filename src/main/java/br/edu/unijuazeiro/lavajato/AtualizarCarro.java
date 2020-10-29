package br.edu.unijuazeiro.lavajato;

import br.edu.unijuazeiro.lavajato.DAO.CarroDAO;
import br.edu.unijuazeiro.lavajato.model.Carro;


public class AtualizarCarro {
    public static void main(String[] args) {
        CarroDAO dao = new CarroDAO();
        
        Carro a = dao.findId(2);
        a.setNome("");
        a.setMarca("");
        dao.merge(a);
    }
}