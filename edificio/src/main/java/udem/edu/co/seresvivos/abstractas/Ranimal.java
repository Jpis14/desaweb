/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.seresvivos.abstractas;

/**
 *
 * @author USUARIO
 */
public abstract class Ranimal {
    private String tipoanimal;
   //se define el tipo de animal
          
    public Ranimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    public String getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    @Override
    public String toString() {
        return "Ranimal{" + "tipoanimal=" + tipoanimal + '}';
    }
    
    }
    
    