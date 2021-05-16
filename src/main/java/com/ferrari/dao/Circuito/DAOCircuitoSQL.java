package com.ferrari.dao.Circuito;

import com.ferrari.db.DBConnectionSQL;
import com.ferrari.entities.Circuito;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOCircuitoSQL implements  DAOCircuito{

    @Override
    public Circuito get(int id) throws SQLException {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from circuito where nombre = " + id + "");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                String longitud = resultSet.getNString("longitud");
                String ubicaccion = resultSet.getNString("ubicaccion");
                String vehiculo = resultSet.getNString("vehiculo");
                Circuito circuito = new Circuito();
                return circuito;
            }
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error en la lista de circuitos");
            } else {
                System.err.println(exception.getMessage());
            }
        }
        return null;
    }

    @Override
    public void insertarCircuito(Circuito circuito) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("insert into circuitos(nombre,longitud,ubiccacion,vehiculo) values ('" + circuito.getNombre()+ "','"+circuito.getLongitud()+ "','"+ circuito.getUbicacion()+ "','"+circuito.getVehiculo() +"')");
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar circuito");
            } else {
                System.err.println(exception.getMessage());
            }
        }
    }

    @Override
    public void actualizarCircuito(Circuito circuito) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("update circuitos set nombre = '"+ circuito.getVehiculo() + circuito.getNombre()+circuito.getUbicacion()+circuito.getLongitud());
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar circuito");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }

    @Override
    public List<Circuito> listaCircuitos() {
        List<Circuito> circuitos = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select * from circuitos");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                String longitud = resultSet.getNString("longitud");
                String ubicaccion = resultSet.getNString("ubicaccion");
                String vehiculo = resultSet.getNString("vehiculo");
                circuitos.add(new Circuito());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return circuitos;
    }

    @Override
    public void clear() {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from circuitos");
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error lista de circuito");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }
}
