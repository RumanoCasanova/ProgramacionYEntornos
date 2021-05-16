package com.Ferrari.dao.Circuito;

import com.ferrari.dao.DAOFactory;
import com.ferrari.entities.Circuito;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DAOCircuitoTest {

    @BeforeAll
    @AfterAll
    static void clearDatabase(){DAOFactory.getInstance().getDaoCircuito().clear();
    }
    @Test
    void noGuardarCircuito(){
        List<Circuito> circuitoesperado = DAOFactory.getInstance().getDaoCircuito().listaCircuitos();
        assertEquals(null,circuitoesperado);
    }
    @Test
    void GuarrdarCircuito(){
        List<Circuito> circuitoesperado = DAOFactory.getInstance().getDaoCircuito().listaCircuitos();
        assertEquals(null,circuitoesperado);
    }
    @Test
    void get() throws SQLException {
        Circuito circuito = new Circuito();
        DAOFactory.getInstance().getDaoCircuito().get(0);
        List<Circuito> circuitos = (List<Circuito>) DAOFactory.getInstance().getDaoCircuito().get(0);
        assertEquals(1,circuitos.size());
    }
    @Test
    public void asignarCircuito(){
        Circuito circuito = new Circuito();
        String circuitoesperado = "1";
        circuito.setNombre(circuitoesperado);
        circuitoesperado = "España";
        assertEquals(circuitoesperado,circuito.getUbicacion());
    }
}
