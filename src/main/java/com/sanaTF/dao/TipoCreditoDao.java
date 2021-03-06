

package com.sanaTF.dao;

import java.util.List;
import com.sanaTF.model.TipoCredito;

public interface TipoCreditoDao {
	public void add(TipoCredito tipocredito);
	public void edit(TipoCredito tipocredito);
	public void delete(int idTipoCredito);
	public TipoCredito getTipoCredito(int idTipoCredito);
	public List getAllTipoCredito();
}
