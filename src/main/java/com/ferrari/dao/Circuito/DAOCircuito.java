package com.ferrari.dao.Circuito;

import com.ferrari.entities.Circuito;

import java.sql.SQLException;
import java.util.List;

public interface DAOCircuito {
    public Circuito get(int id) throws SQLException;
    public void insertarCircuito(Circuito circuito);
    public void actualizarCircuito(Circuito circuito);
    public List<Circuito> listaCircuitos();
    public void clear();


}
