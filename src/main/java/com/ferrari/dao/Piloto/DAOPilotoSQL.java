package com.ferrari.dao.Piloto;

import com.ferrari.db.DBConnectionSQL;
import com.ferrari.entities.Circuito;
import com.ferrari.entities.Piloto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOPilotoSQL implements DAOpiloto {
    @Override
    public Piloto get(int id) throws SQLException {
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from piloto where nombre = " + id + "");
            while (resultSet.next()){
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getNString("nombre");
                Date fechanacimiento = resultSet.getDate("fechanacimiento");
                String nacionalidad = resultSet.getNString("nacionalidad");
                int modalidades = resultSet.getInt("modalidades");
                Piloto piloto = new Piloto(codigo,nombre,fechanacimiento,nacionalidad,modalidades);
                return piloto;
            }

        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error en la lista de pilotos");
            } else {
                System.err.println(exception.getMessage());
            }
        }

        return null;
    }

    @Override
    public void insertarPiloto(Piloto piloto) {
        try {

            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("insert into pilotos(codigo,nombre,fechanacimiento,nacionalidad,modalidades) values ('" + piloto.getCodigo()+ "','"+piloto.getNombre()+ "','"+ piloto.getFechanacimiento()+ "','"+piloto.getNacionalidad() +"','"+piloto.getModalidades()+"')");
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar piloto");
            } else {
                System.err.println(exception.getMessage());
            }
        }
    }


    @Override
    public void actualizarPiloto(Piloto piloto) {

        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("update pilotos set codigo = '"+ piloto.getCodigo() + piloto.getNombre()+piloto.getFechanacimiento()+piloto.getNacionalidad()+piloto.getModalidades());
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error insertar piloto");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }

    @Override
    public List<Piloto> listaPilotos() {
        List<Piloto> pilotos = new ArrayList<>();
        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select * from pilotos");
            while (resultSet.next()){
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getNString("nombre");
                Date fechanacimiento = resultSet.getDate("fechanacimiento");
                String nacionalidad = resultSet.getNString("nacionalidad");
                int modalidades = resultSet.getInt("modalidades");
                pilotos.add(new Piloto(codigo,nombre,fechanacimiento,nacionalidad,modalidades));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pilotos;
    }

    @Override
    public void clear() {

        try {
            Statement statement = DBConnectionSQL.getInstance().createStatement();
            statement.execute("delete from pilotos");
        }catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                System.err.println("error lista de piloto");
            } else {
                System.err.println(exception.getMessage());
            }
        }

    }
}
