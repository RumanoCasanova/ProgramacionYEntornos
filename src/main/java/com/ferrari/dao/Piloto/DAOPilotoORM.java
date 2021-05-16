package com.ferrari.dao.Piloto;

import com.ferrari.db.DBConnectionORM;
import com.ferrari.entities.Piloto;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;
import java.util.List;

public class DAOPilotoORM implements DAOpiloto {
    Dao<Piloto, String> daoPilotoORM;

    public DAOPilotoORM() throws SQLException {
        this.daoPilotoORM = DaoManager.createDao(
                DBConnectionORM.getInstance(),
                Piloto.class
        );
        DaoManager.registerDao(
                DBConnectionORM.getInstance(),
                daoPilotoORM);
    }

    @Override
    public Piloto get(int id) throws SQLException {
        try {
            daoPilotoORM.queryForAll();
        } catch (SQLException throwables) {

        } return null;
    }
    @Override
    public void insertarPiloto(Piloto piloto) {

    }

    @Override
    public void actualizarPiloto(Piloto piloto) {

    }

    @Override
    public List<Piloto> listaPilotos() {
        try {
            return daoPilotoORM.queryForAll();
        } catch (SQLException throwables) {
            return null;
        }
    }

    @Override
    public void clear() {
        try {
            daoPilotoORM.delete(daoPilotoORM.queryForAll());
        } catch (SQLException throwables) {

        }
    }
}
