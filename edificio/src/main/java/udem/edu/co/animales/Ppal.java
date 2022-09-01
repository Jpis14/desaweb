/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udem.edu.co.animales;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.seresvivos.model.Brocoli;
import udem.edu.co.seresvivos.model.Perro;
import udem.edu.co.seresvivos.interfaz.SerVivito;

/**
 *
 * @author USUARIO
 */
public class Ppal {

    public static void main(String[] args) {
        List<SerVivito> seresvivos= new ArrayList<>();
        Perro perro1= new Perro("clifor","blanco", 2, "carnivoro");
        Perro perro2= new Perro("matias","cafe", 7, "carnivoro");
        Brocoli brocoli1= new Brocoli("brocoli","verde", 1, "verdura");
        seresvivos.add(perro1);
        seresvivos.add(perro2);
        seresvivos.add((SerVivito) brocoli1);
        System.out.println("HOLA");
        System.out.println(seresvivos);
    }
}

