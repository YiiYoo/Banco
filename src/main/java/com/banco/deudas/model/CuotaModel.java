package com.banco.deudas.model;

public class CuotaModel {
    private String nombreEntidad;
    private int cantidadCuotas;
    private int valorCuota;

    public CuotaModel(String nombreEntidad, int cantidadCuotas, int valorCuota) {
        this.nombreEntidad = nombreEntidad;
        this.cantidadCuotas = cantidadCuotas;
        this.valorCuota = valorCuota;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }
}
