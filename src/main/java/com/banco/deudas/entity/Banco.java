package com.banco.deudas.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banco {


    @Id
    private String nombreBanco;

    @NotNull
    private String tipoDeuda;

    @NotNull
    private int valorCuota;

    @NotNull
    private int cuotasDebe;

    @NotNull
    private int cuotasPagas;

    @NotNull
    private int cuotasTotales;

    @NotNull
    private int dineroTotalPago;

    @NotNull
    private int deudaPaga;

    @NotNull
    private int saldo;




}
