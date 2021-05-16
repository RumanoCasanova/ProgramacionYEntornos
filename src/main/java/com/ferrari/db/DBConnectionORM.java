package com.ferrari.db;

import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;


public class DBConnectionORM {

    private static DBConnectionORM dbConnection = null;
    private ConnectionSource connection = null;

    public DBConnectionORM() throws SQLException {
        String user = "admin";
        String password = "admin";
        String host = "192.168.1.44";
        String port = "33069";
        String database = "ProyectoProgramacion";
        connection = new JdbcConnectionSource("jdbc:mysql://"+ host +":"+port+"/"+database+"?"+"user="+user+"&password="+password,user,password);
    }

    public static ConnectionSource getInstance() throws SQLException{
        if(dbConnection == null){
            dbConnection = new DBConnectionORM();
        }
        return dbConnection.connection;
    }
}
