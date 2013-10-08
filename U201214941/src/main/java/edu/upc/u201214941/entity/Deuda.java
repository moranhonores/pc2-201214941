/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201214941.entity;

import java.io.Serializable;

/**
 *
 * @author Alfonso
 */
public class Deuda implements Serializable {
    
    private int idDeuda;
    private String ruc;
    private String motivo;
    private String periodo_tributo;
    private String resulucion;
    private String cod_tributo;
    private String importe;

    /**
     * @return the idDeuda
     */
    public int getIdDeuda() {
        return idDeuda;
    }

    /**
     * @param idDeuda the idDeuda to set
     */
    public void setIdDeuda(int idDeuda) {
        this.idDeuda = idDeuda;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the periodo_tributo
     */
    public String getPeriodo_tributo() {
        return periodo_tributo;
    }

    /**
     * @param periodo_tributo the periodo_tributo to set
     */
    public void setPeriodo_tributo(String periodo_tributo) {
        this.periodo_tributo = periodo_tributo;
    }

    /**
     * @return the resulucion
     */
    public String getResulucion() {
        return resulucion;
    }

    /**
     * @param resulucion the resulucion to set
     */
    public void setResulucion(String resulucion) {
        this.resulucion = resulucion;
    }

    /**
     * @return the cod_tributo
     */
    public String getCod_tributo() {
        return cod_tributo;
    }

    /**
     * @param cod_tributo the cod_tributo to set
     */
    public void setCod_tributo(String cod_tributo) {
        this.cod_tributo = cod_tributo;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }
    
}
