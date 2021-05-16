package com.ferrari.dao.Vehiculo;

import com.ferrari.dao.DAOSerializable;
import com.ferrari.entities.Vehiculo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DAOVehiculoSerializable extends DAOSerializable implements DAOVehiculo{

public DAOVehiculoSerializable(){
    super("vehiculos.txt");
    Object obj = this.load();
    List<Vehiculo> vehiculos;
    if (obj == null){
        vehiculos = new ArrayList<>();
    }
    else {
        vehiculos = (List<Vehiculo>) obj;
    }
}
    public DAOVehiculoSerializable(String file) {
        super(file);
    }

    @Override
    public Vehiculo get(int id) throws SQLException {
        return null;
    }

    @Override
    public void insertarVehiculo(Vehiculo vehiculo) {
    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {

    }

    @Override
    public List<Vehiculo> listaVehiculo() {
        return null;
    }

    @Override
    public void clear() {

    }
}
