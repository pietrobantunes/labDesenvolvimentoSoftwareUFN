package Principal;

import Beans.Pessoa;
import DAO.pessoaDAO;
import conexao.Conexao;

public class Principal {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        java.sql.Connection conexaoPronta = c.getConexao();

        Pessoa p = new Pessoa();
        p.setNome("Pietro Brum Antunes");
        p.setIdioma("Português");
        p.setSexo("M");

        pessoaDAO pdao = new pessoaDAO(c, conexaoPronta);
        pdao.inserir(p);
    }
}
