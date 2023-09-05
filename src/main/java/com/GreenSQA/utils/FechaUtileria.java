package com.GreenSQA.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class FechaUtileria {

    public static int obtenerPosicionAnio(List<WebElementFacade> listaElementos, int anioAComparar) {
        int posicion = -1;
        for (int i = 1; i < listaElementos.size() - 1; i++) {
            String text = listaElementos.get(i).getText();
            int anio = Integer.parseInt(text.split(" ")[1].trim());
            if (anio == anioAComparar) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public static int obtenerPosicionMes(List<WebElementFacade> listaElementos, String mesAComparar) {
        int posicion = -1;
        for (int i = 1; i < listaElementos.size() - 1; i++) {
            String text = listaElementos.get(i).getText();
            String mes = text.split(" ")[0];
            if (mes.trim().equalsIgnoreCase(mesAComparar.trim())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public static int obtenerPosicionDia(List<WebElementFacade> listaElementos, int diaAComparar) {
        int posicion = -1;
        for (int i = 0; i < listaElementos.size(); i++) {
            String text = listaElementos.get(i).getText();
            if (!text.isEmpty()) {
                int dia = Integer.parseInt(text.split(" ")[0].trim());
                if (dia == diaAComparar) {
                    posicion = i;
                    break;
                }
            }
        }
        return posicion;
    }


    public static int obtenerDia(String atrFechaIda) {
        return Integer.parseInt(atrFechaIda.split(" ")[0]);
    }

    public static String obtenerMes(String atrFechaIda) {
        return atrFechaIda.split(" ")[1];
    }

    public static int obtenerAnio(String atrFechaIda) {
        return Integer.parseInt(atrFechaIda.split(" ")[2]);
    }
}
