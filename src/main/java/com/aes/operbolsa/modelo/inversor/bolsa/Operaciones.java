/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.modelo.inversor.bolsa;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SALLYESTEFANIA
 */
@XmlRootElement(name = "operaciones")
public class Operaciones implements  Serializable{
    List<Accion> listaAccion;

    @XmlElement(name = "accion")
    public List<Accion> getListaAccion() {
        return listaAccion;
    }

    public void setListaAccion(List<Accion> listaAccion) {
        this.listaAccion = listaAccion;
    }

    
  
    
    
    
}
