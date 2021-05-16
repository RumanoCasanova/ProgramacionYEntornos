package com.ferrari.dao.Vehiculo;

import com.ferrari.db.DBConnectionSQL;
import com.ferrari.entities.Circuito;
import com.ferrari.entities.Vehiculo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOVehiculoSQL implements DAOVehiculo {
    @Override
    public Vehiculo get(int id) throws SQLException {

        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from vehiculo where nombre = " + id + "");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                Float velocidad = resultSet.getFloat("velocidad");
                Float peso = resultSet.getFloat("peso");
                Float potencia = resultSet.getFloat("potencia");
                String piloto = resultSet.getNString("piloto");
                Vehiculo vehiculo = new Vehiculo(nombre,velocidad,peso,potencia,piloto);
                return vehiculo;
            }
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error en la lista de vehiculos");
            } else {
                System.err.println(exception.getMessage());
            }
        }
        return null;
    }

    @Override
    public void insertarVehiculo(Vehiculo vehiculo) {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("insert into vehiculos(nombre,velocidad,peso,potencia,piloto) values ('" + vehiculo.getNombre()+ "','"+vehiculo.getVelocidad()+ "','"+ vehiculo.getPeso()+ "','"+vehiculo.getPotencia() +"','"+vehiculo.getPiloto()+"')");
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar vehiculo");
            } else {
                System.err.println(exception.getMessage());
            }
        }
    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {

        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("update circuitos set nombre = '"+ vehiculo.getNombre() + vehiculo.getVelocidad()+vehiculo.getPeso()+vehiculo.getPotencia()+vehiculo.getPiloto());
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar circuito");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }

    @Override
    public List<Vehiculo> listaVehiculo() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from vehiculos");
            while (resultSet.next()){
                String nombre = resultSet.getNString("nombre");
                Float velocidad = resultSet.getFloat("velocidad");
                Float peso = resultSet.getFloat("peso");
                Float potencia = resultSet.getFloat("potencia");
                String piloto = resultSet.getNString("piloto");
                Vehiculo vehiculo = new Vehiculo(nombre,velocidad,peso,potencia,piloto);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return vehiculos;
    }

    @Override
    public void clear() {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from vehiculos");
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error lista de vehiculo");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }
}
