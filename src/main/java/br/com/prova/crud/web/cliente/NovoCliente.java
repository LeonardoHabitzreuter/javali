package br.com.prova.crud.web.cliente;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.prova.crud.dao.ClienteDAO;
import br.com.prova.crud.db.ConnectionDB;
import br.com.prova.crud.modelo.Cliente;

@WebServlet(urlPatterns = "/novoCliente")
public class NovoCliente extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String senha = req.getParameter("senha");
		
		Cliente cliente = new Cliente(nome, cpf, senha);
		
		try (Connection con = ConnectionDB.getConnetion()) {
			ClienteDAO dao = new ClienteDAO(con);
				dao.inserir(cliente);
				req.setAttribute("cliente", cliente);
				req.getRequestDispatcher("/WEB-INF/views/cliente/novoCliente.jsp").forward(req,
						resp);
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
