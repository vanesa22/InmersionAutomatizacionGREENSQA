package com.GreenSQA.model;

import com.GreenSQA.utils.FechaUtileria;

public class DatosVuelo {

    private String atrOrigen;
    private String atrDestino;
    private String atrFechaIda;
    private int atrDiaIda;
    private String atrMesIda;
    private int atrAnioIda;
    private String atrFechaVuelta;
    private int atrDiaVuelta;
    private String atrMesVuelta;
    private int atrAnioVuelta;
    private Integer atrPasajero;


    public DatosVuelo(String atrOrigen, String atrDestino, String atrFechaIda, String atrFechaVuelta, Integer atrPasajero) {
        this.atrOrigen = atrOrigen;
        this.atrDestino = atrDestino;
        this.atrFechaIda = atrFechaIda;
        this.atrFechaVuelta = atrFechaVuelta;
        this.atrPasajero = atrPasajero;
        this.atrDiaIda = FechaUtileria.obtenerDia(atrFechaIda);
        this.atrMesIda = FechaUtileria.obtenerMes(atrFechaIda);
        this.atrAnioIda = FechaUtileria.obtenerAnio(atrFechaIda);
        this.atrDiaVuelta = FechaUtileria.obtenerDia(atrFechaVuelta);
        this.atrMesVuelta = FechaUtileria.obtenerMes(atrFechaVuelta);
        this.atrAnioVuelta = FechaUtileria.obtenerAnio(atrFechaVuelta);
    }

    public String getAtrOrigen() {
        return atrOrigen;
    }

    public void setAtrOrigen(String atrOrigen) {
        this.atrOrigen = atrOrigen;
    }

    public String getAtrDestino() {
        return atrDestino;
    }

    public void setAtrDestino(String atrDestino) {
        this.atrDestino = atrDestino;
    }

    public String getAtrFechaIda() {
        return atrFechaIda;
    }

    public void setAtrFechaIda(String atrFechaIda) {
        this.atrFechaIda = atrFechaIda;
    }

    public int getAtrDiaIda() {
        return atrDiaIda;
    }

    public void setAtrDiaIda(int atrDiaIda) {
        this.atrDiaIda = atrDiaIda;
    }

    public String getAtrMesIda() {
        return atrMesIda;
    }

    public void setAtrMesIda(String atrMesIda) {
        this.atrMesIda = atrMesIda;
    }

    public int getAtrAnioIda() {
        return atrAnioIda;
    }

    public void setAtrAnioIda(int atrAnioIda) {
        this.atrAnioIda = atrAnioIda;
    }

    public String getAtrFechaVuelta() {
        return atrFechaVuelta;
    }

    public void setAtrFechaVuelta(String atrFechaVuelta) {
        this.atrFechaVuelta = atrFechaVuelta;
    }

    public int getAtrDiaVuelta() {
        return atrDiaVuelta;
    }

    public void setAtrDiaVuelta(int atrDiaVuelta) {
        this.atrDiaVuelta = atrDiaVuelta;
    }

    public String getAtrMesVuelta() {
        return atrMesVuelta;
    }

    public void setAtrMesVuelta(String atrMesVuelta) {
        this.atrMesVuelta = atrMesVuelta;
    }

    public int getAtrAnioVuelta() {
        return atrAnioVuelta;
    }

    public void setAtrAnioVuelta(int atrAnioVuelta) {
        this.atrAnioVuelta = atrAnioVuelta;
    }

    public Integer getAtrPasajero() {
        return atrPasajero;
    }

    public void setAtrPasajero(Integer atrPasajero) {
        this.atrPasajero = atrPasajero;
    }
}
