package com.cr.examen.Dao;

import java.util.List;

import com.cr.examen.Entity.Cliente;

public interface IDaoCliente {
	public List<Cliente> listar();
	public Cliente crear (Cliente cliente);
	public Cliente actualizar(Cliente cliente);
	public Cliente listarPorId(int id);
}
