package br.com.prova.crud.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.prova.crud.dao.ClienteDAO;
import br.com.prova.crud.db.ConnectionDB;
import br.com.prova.crud.modelo.Cliente;

public class TestaInsersaoClienteDAO {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("prova", "Barros", "provabarros.df@gmail.com");

		try (Connection con = ConnectionDB.getConnetion()) {
			ClienteDAO dao = new ClienteDAO(con);
			dao.inserir(cliente);

		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel fazer conexão com banco! Message: " + e.getMessage());
		}

	}
}
