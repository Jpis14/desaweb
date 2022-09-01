/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.seresvivos.model;

import udem.edu.co.seresvivos.abstractas.Ranimal;
import udem.edu.co.seresvivos.abstractas.Rvegetal;
import udem.edu.co.seresvivos.interfaz.SerVivito;

/**
 *
 * @author USUARIO
 */
public class Perro extends Ranimal implements SerVivito{
    private String nombre;
    private String promedad;
    private String color;

    public Perro(String nombre, String promedad, String color, String tipo) {
        super(tipo);
        this.nombre = nombre;
        this.promedad = promedad;
        this.color = color;
    }

    @Override
    public int finEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    }
    

    
    
    
