/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.seresvivos.abstractas;

/**
 *
 * @author USUARIO
 */
public abstract class Rvegetal {
    private String tipovegetal;

    public Rvegetal(String tipovegetal) {
        this.tipovegetal = tipovegetal;
    }

    public String getTipovegetal() {
        return tipovegetal;
    }

    public void setTipovegetal(String tipovegetal) {
        this.tipovegetal = tipovegetal;
    }

    @Override
    public String toString() {
        return "Rvegetal{" + "tipovegetal=" + tipovegetal + '}';
    }

    }
    
    //getters and setters

  
