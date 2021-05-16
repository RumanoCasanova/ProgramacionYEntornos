package com.ferrari.dao.Piloto;

import com.ferrari.entities.Circuito;
import com.ferrari.entities.Piloto;

import java.sql.SQLException;
import java.util.List;

public interface DAOpiloto {
    public Piloto get(int id) throws SQLException;
    public void insertarPiloto(Piloto piloto);
    public void actualizarPiloto(Piloto piloto);
    public List<Piloto> listaPilotos();
    public void clear();
}
