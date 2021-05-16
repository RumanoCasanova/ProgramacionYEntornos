package com.ferrari.entities;

public class Vehiculo {

    private String nombre;
    private float velocidad;
    private float peso;
    private float potencia;
    private String piloto;

    public Vehiculo(String nombre, float velocidad, float peso, float potencia, String piloto) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.peso = peso;
        this.potencia = potencia;
        this.piloto = piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                ", peso=" + peso +
                ", potencia=" + potencia +
                ", piloto='" + piloto + '\'' +
                '}';
    }
}
