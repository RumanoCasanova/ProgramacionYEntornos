package com.Ferrari.dao.Circuito;

import com.ferrari.dao.DAOFactory;
import com.ferrari.entities.Circuito;
import com.ferrari.entities.Piloto;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DAOPilotoTest {
    @BeforeAll
    @AfterAll
    static void clearDatabase(){
        DAOFactory.getInstance().getDaoPiloto().clear();
    }
    {DAOFactory.getInstance().getDaoCircuito().clear();
    }
    @Test
    void noGuardarPiloto(){
        List<Piloto> pilotoesperado = DAOFactory.getInstance().getDaoPiloto().listaPilotos();
        assertEquals(null,pilotoesperado);
    }
    @Test
    void GuarrdarPiloto(){
        List<Piloto> pilotoesperado = DAOFactory.getInstance().getDaoPiloto().listaPilotos();
        assertEquals(null,pilotoesperado);
    }
    @Test
    void get() throws SQLException {
        Circuito circuito = new Circuito();
        DAOFactory.getInstance().getDaoCircuito().get(0);
        List<Circuito> circuitos = (List<Circuito>) DAOFactory.getInstance().getDaoCircuito().get(0);
        assertEquals(1,circuitos.size());
    }
    @Test
    public void asignarPiloto(){
        Circuito circuito = new Circuito();
        String circuitoesperado = "1";
        circuito.setNombre(circuitoesperado);
        circuitoesperado = "España";
        assertEquals(circuitoesperado,circuito.getUbicacion());
    }

}
