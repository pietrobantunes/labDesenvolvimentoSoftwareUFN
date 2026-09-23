package DAO;

import Beans.Pessoa;
import java.sql.Connection;
import conexao.Conexao;
import java.util.List;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class pessoaDAO {

    public pessoaDAO(Conexao conexao, Connection conn) {
        this.conexao = conexao;
        this.conn = conn;
    }

    private Conexao conexao;
    private Connection conn;

    public void inserir(Pessoa pessoa) {
        try {
            String sql = "INSERT INTO pessoa(nome, sexo, idioma) VALUES (?,?,?)";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa:" + ex.getMessage());
        }
    }
}
