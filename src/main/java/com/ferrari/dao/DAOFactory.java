package com.ferrari.dao;

import com.ferrari.dao.Circuito.DAOCircuito;
import com.ferrari.dao.Circuito.DAOCircuitoSQL;
import com.ferrari.dao.Piloto.DAOPilotoSQL;
import com.ferrari.dao.Piloto.DAOpiloto;
import com.ferrari.dao.Vehiculo.DAOVehiculo;
import com.ferrari.dao.Vehiculo.DAOVehiculoSQL;
import com.ferrari.dao.Vuelta.DAOVuelta;
import com.ferrari.dao.Vuelta.DAOVueltaSQL;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOCircuito daoCircuito;
    private DAOpiloto daoPiloto;
    private DAOVehiculo daoVehiculo;
    private DAOVuelta daoVuelta;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOCircuito getDaoCircuito(){
        if (daoCircuito == null){
            daoCircuito = new DAOCircuitoSQL();
        }
        return daoCircuito;}

    public DAOpiloto getDaoPiloto(){
        if (daoPiloto == null){
            daoPiloto = new DAOPilotoSQL();
        }
        return daoPiloto;
    }
    public DAOVehiculo getDaoVehiculo(){
        if (daoVehiculo == null){
            daoVehiculo = new DAOVehiculoSQL();
        }
        return daoVehiculo;
    }
    public DAOVuelta getDaoVuelta(){
        if (daoVuelta == null){
            daoVuelta = new DAOVueltaSQL();
        }
        return daoVuelta;
    }
}

