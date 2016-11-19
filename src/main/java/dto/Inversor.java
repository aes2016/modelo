/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SALLYESTEFANIA
 */
@XmlRootElement(name = "inversor")
public class Inversor implements Serializable{
   private Integer efectivo;
   private Acciones acciones;
   private String operacion;
   private String empresa;
   private Integer cantidad;
   private Integer valor;

    @XmlElement(name = "efectivo")
    public Integer getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Integer efectivo) {
        this.efectivo = efectivo;
    }
   
     
    public Acciones getAcciones() {
        return acciones;
    }
    @XmlElement(name = "acciones")
    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

    public String getOperacion() {
        return operacion;
    }

    @XmlTransient
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    
    
    
    
    
    //Transient
    
    
    
    @XmlTransient
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @XmlTransient
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    @XmlTransient
    public void setValor(Integer valor) {
        this.valor = valor;
    }



    

}
