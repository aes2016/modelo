/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.operbolsa.modelo.inversor;

import com.aes.operbolsa.modelo.bolsa.Accion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SALLYESTEFANIA
 */
@XmlRootElement(name = "acciones")
public class Acciones implements Serializable{    
   private List<Accion> listaAccion= new ArrayList<>();

     @XmlElement(name = "accion")
    public List<Accion> getListaAccion() {
        return listaAccion;
    }

    public void setListaAccion(List<Accion> listaAccion) {
        this.listaAccion = listaAccion;
    }
    
    

    
}
