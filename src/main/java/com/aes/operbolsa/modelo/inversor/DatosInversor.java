/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.modelo.inversor;

import java.io.Serializable;

/**
 *
 * @author SALLYESTEFANIA
 */
public class DatosInversor implements Serializable {
    private String nombre;
    private String puertoCorredor;
    private String hostCorredor;
    private String nombreArchivoInicial;
    private String operacion;
    private String empresa;
    private Integer cantidad;
    private Integer valor;

    public DatosInversor(String nombre, String puertoCorredor, String hostCorredor, String nombreArchivoInicial) {
        this.nombre = nombre;
        this.puertoCorredor = puertoCorredor;
        this.hostCorredor = hostCorredor;
        this.nombreArchivoInicial = nombreArchivoInicial;
    }
    
    /*  public DatosInversor(String operacion, String empresa,Integer cantidad,Integer valor ){
    this.operacion= operacion;
    this.empresa = empresa;
    this.cantidad = cantidad;
    this.valor = valor;
    }*/
    public DatosInversor(String operacion, String empresa,Integer cantidad,Integer valor , String host , String puerto){
        this.operacion= operacion;
        this.empresa = empresa;
        this.cantidad = cantidad;
        this.valor = valor;
        this.hostCorredor = host;
        this.puertoCorredor = puerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuertoCorredor() {
        return puertoCorredor;
    }

    public void setPuertoCorredor(String puertoCorredor) {
        this.puertoCorredor = puertoCorredor;
    }

    public String getHostCorredor() {
        return hostCorredor;
    }

    public void setHostCorredor(String hostCorredor) {
        this.hostCorredor = hostCorredor;
    }

    public String getNombreArchivoInicial() {
        return nombreArchivoInicial;
    }

    public void setNombreArchivoInicial(String nombreArchivoInicial) {
        this.nombreArchivoInicial = nombreArchivoInicial;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    
    
}
