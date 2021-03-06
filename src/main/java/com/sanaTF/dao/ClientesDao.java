package com.sanaTF.dao;

import java.util.List;
import com.sanaTF.model.Clientes;

public interface ClientesDao {
	public void add(Clientes clientes);
	public void edit(Clientes clientes);
	public void delete(int idClientes);
	public Clientes getClientes(int idClientes);
	public List getAllClientes();
}