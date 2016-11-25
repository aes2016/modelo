/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.utilidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LBVP
 */
public abstract class Comandos <T> {

    protected String host;
    protected String puerto;
    protected List<String> posiblesComandosRegex = new ArrayList<String>() ;
    protected String comando;
    protected String comandoConexion;
    protected boolean comandoValido;
    protected T entidadOperaciones;

    protected Comandos(String comandoConexion) {
        this.comandoConexion = comandoConexion;
        cargarListaPosiblesComandos();
    }
    
    public abstract boolean validarComando(String strComando);
    
    public abstract T getComandoConexion();
    
    public abstract T getComandoOperacion();
    
    public abstract void cargarListaPosiblesComandos();

    
    
    public String getHost() {
        return host == null ? "" : host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto == null ? "" : puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public List<String> getPosiblesComandosRegex() {
        return posiblesComandosRegex ;
    }

    public void setComandoConexion(String comandoConexion) {
        this.comandoConexion = comandoConexion;
    } 
    

}
