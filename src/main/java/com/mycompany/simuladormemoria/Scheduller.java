package com.mycompany.simuladormemoria;

import java.util.ArrayList;

public class Scheduller {

    public static Proceso elijeProceso(String algoritmo, ArrayList<Proceso> procesos) {
        if (algoritmo.equals("FCFS")) {
            for (Proceso proceso : procesos) {
                if (proceso.getPstate().equals("Listo")) {
                    return proceso;
                }
            }
        }else if (algoritmo.equals("JSF")) {
                
            }
        return null;
    }
    
}
