package com.aes.operbolsa.modelo.inversor.comandos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.aes.operbolsa.modelo.inversor.DatosInversor;
import com.aes.utilidades.Comandos;
import com.aes.utilidades.Utilidades;


/**
 *
 * @author SALLYESTEFANIA
 */
public class ComandosInversor extends Comandos<DatosInversor> {

    public ComandosInversor(String comando) {
        super(comando);

    }

    @Override
    public void cargarListaPosiblesComandos() {
        String[] listaExpresionesRegulares = {
            "^(inversor -n )([a-zA-Z]+?)( -p )[0-9]+ -h([1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])){2}(\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]))( -a)(\\w+)?(\\.)(xml)$",
            "^(compra )([A-Z]{3} )([0-9]+ )([0-9]+)$",
            "^(nocompra )([A-Z]{3} )([0-9]+ )([0-9]+)$",
            "^(venta )([A-Z]{3} )([0-9]+ )([0-9]+)$",
            "^(noventa )([A-Z]{3} )([0-9]+ )([0-9]+)$",
            "^(consulta )([A-Z]{3})$",
            "^(Portafolio)$"
        };
        posiblesComandosRegex = java.util.Arrays.asList(listaExpresionesRegulares);
    }

    @Override
    public boolean validarComando(String strComando) {
        comandoValido = false;
        if (posiblesComandosRegex != null && !posiblesComandosRegex.isEmpty() && strComando != null) {
            for (String expresion : posiblesComandosRegex) {
                if (Utilidades.evaluarExpresionRegular(expresion, strComando)) {
                    comandoValido = true; 
                    break;
                }
            }

        }
        if (!comandoValido) {
            System.out.println("Comando invalido: "+comando);
        }

        return comandoValido;
    }

    @Override
    public DatosInversor getComandoConexion() {
        entidadOperaciones = null;
        if (!validarComando(comandoConexion)) {
            return null;
        }
        String comandoStr = comandoConexion.replace(" ", "");
        String nombreInversor = comandoStr.substring(comandoStr.indexOf("-n") + 2, comandoStr.indexOf("-p")).trim();
        puerto = comandoStr.substring(comandoStr.indexOf("-p") + 2, comandoStr.indexOf("-h"));
        host = comandoStr.substring(comandoStr.indexOf("-h") + 2, comandoStr.indexOf("-a"));
        String archivo = comandoStr.substring(comandoStr.indexOf("-a") + 2, comandoStr.length() - 1);
        entidadOperaciones = new DatosInversor(nombreInversor, puerto, host, archivo);
        return entidadOperaciones;
    }

    @Override
    public DatosInversor getComandoOperacion() {
        entidadOperaciones = null;
        if (!validarComando(comando)) {
            return null;
        }
        String inputComando = comando.replaceAll(" +", ",");
        String[] splitComando = inputComando.split(",");
        DatosInversor datosInversor = new DatosInversor(
                splitComando[0],
                splitComando[1],
                Integer.parseInt(splitComando[2]),
                Integer.parseInt(splitComando[3]),
                host,
                puerto
        );
        return datosInversor;
    }

    /* 
 
    public   DatosInversor obtenerDatosInversor(String inputComando){
        
          //  getComandoConexion;
    }
     */
 /*    public static DatosInversor obtenerOperacionesClienteInversor(String comando) {
    inversor = null;
    
    //comandoOperacion
    }*/

 /*    public static void main(String[] args) {
    String comando = "inversor -n andres -p 23234 -h24234 -ainversor";
    //System.out.println("xxx "+comando);
    //  System.out.println("----> "+comando.indexOf("-p"));
    System.out.println("----> " + obtenerDatosInversor(comando).getPuertoCorredor());
    String com = "compra     AAA       20       20000";
    
    System.out.println("-----" + obtenerOperacionesClienteInversor(com).getValor());
    
    }*/
}
