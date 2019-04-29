package br.com.prova.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prova.crud.modelo.Cliente;

public class ClienteDAO {

	private Connection con;

	public ClienteDAO(Connection con) {
		this.con = con;

	}

	public void inserir(Cliente cliente) {
		String sql = "INSERT INTO cliente (nome, cpf, senha) VALUES (?, ?, ?)";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getSenha());
			stmt.execute();
			stmt.close();
			this.con.close();
			System.out.println("Dados inseridos com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Cliente> listar() throws SQLException {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "SELECT * FROM cliente";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String cpf = rs.getString("cpf");
					String senha = rs.getString("senha");
					Cliente cliente = new Cliente(nome, cpf, senha);
					cliente.setId(id);
					clientes.add(cliente);

				}
				rs.close();
			}
			stmt.close();
			this.con.close();
		}
		return clientes;
	}

	public void atualizar(Cliente cliente) throws SQLException {
		String sql = "UPDATE cliente SET nome = ?, cpf = ?, senha = ? WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getSenha());
			stmt.setInt(4, cliente.getId());
			stmt.execute();
			stmt.close();
			this.con.close();
			System.out.println("Atualizado com Sucesso!");
		}
	}

	public Cliente listarPorCpf(String queryCpf) throws SQLException {
		Cliente cliente = null;
		String sql = "SELECT * FROM cliente WHERE cpf = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, queryCpf);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				rs.next();
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String senha = rs.getString("senha");
				cliente = new Cliente(nome, cpf, senha);
				cliente.setId(id);
				rs.close();
			}
			stmt.close();
			this.con.close();
		}
		return cliente;
	}

	public void excluir(int id) throws SQLException {
		if (id == 0) {
			throw new IllegalStateException("Id da conta nao deve ser nula.");
		}

		String sql = "DELETE FROM cliente WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
			this.con.close();
			System.out.println("Excluido com sucesso!");
		}

	}

}
