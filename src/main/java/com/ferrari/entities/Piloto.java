package com.ferrari.entities;

import java.util.Date;

public class Piloto {
    private int codigo;
    private String nombre;
    private Date fechanacimiento;
    private String nacionalidad;
    private int modalidades;

    public Piloto(int codigo, String nombre, Date fechanacimiento, String nacionalidad, int modalidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.modalidades = modalidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getModalidades() {
        return modalidades;
    }

    public void setModalidades(int modalidades) {
        this.modalidades = modalidades;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", modalidades=" + modalidades +
                '}';
    }
}
