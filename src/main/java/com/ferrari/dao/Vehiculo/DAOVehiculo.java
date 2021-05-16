package com.ferrari.dao.Vehiculo;

import com.ferrari.entities.Piloto;
import com.ferrari.entities.Vehiculo;

import java.sql.SQLException;
import java.util.List;

public interface DAOVehiculo {

    public Vehiculo get(int id) throws SQLException;
    public void insertarVehiculo(Vehiculo vehiculo);
    public void actualizarVehiculo(Vehiculo vehiculo);
    public List<Vehiculo> listaVehiculo();
    public void clear();
}
