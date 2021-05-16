package com.ferrari.dao.Piloto;

import com.ferrari.dao.DAOSerializable;
import com.ferrari.entities.Piloto;

import java.sql.SQLException;
import java.util.List;

public class DAOPilotoSerializable extends DAOSerializable implements DAOpiloto{
    Piloto piloto;
    public DAOPilotoSerializable(){
        super("pilotos.txt");
        Object obj = this.load();
        piloto =(Piloto) obj;
    }
    public DAOPilotoSerializable(String file) {
        super(file);
    }
    @Override
    public Piloto get(int id) throws SQLException {
        return null;
    }
    @Override
    public void insertarPiloto(Piloto piloto) {

    }
    @Override
    public void actualizarPiloto(Piloto piloto) {

    }

    @Override
    public List<Piloto> listaPilotos() {
        return null;
    }

    @Override
    public void clear() {

    }
}
