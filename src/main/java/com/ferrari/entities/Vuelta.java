package com.ferrari.entities;

public class Vuelta {
    private String carrera;
    private int piloto;
    private float n_vueltas;
    private String tiempo;

    public Vuelta(String carrera, int piloto, float n_vueltas, String tiempo) {
        this.carrera = carrera;
        this.piloto = piloto;
        this.n_vueltas = n_vueltas;
        this.tiempo = tiempo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getPiloto() {
        return piloto;
    }

    public void setPiloto(int piloto) {
        this.piloto = piloto;
    }

    public float getN_vueltas() {
        return n_vueltas;
    }

    public void setN_vueltas(float n_vueltas) {
        this.n_vueltas = n_vueltas;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Vuelta{" +
                "carrera='" + carrera + '\'' +
                ", piloto=" + piloto +
                ", n_vueltas=" + n_vueltas +
                ", tiempo='" + tiempo + '\'' +
                '}';
    }
}
