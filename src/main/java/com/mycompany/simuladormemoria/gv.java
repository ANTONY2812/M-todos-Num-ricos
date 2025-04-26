package com.mycompany.simuladormemoria;

import java.awt.Color;

public class gv {
    public static Color colordefaultmemoria=Color.cyan;
    
    public static int totalMemoria=1324;
    
    public static int aleatorio(int inf, int sup){
        int n;
        do {
            n = (int) (Math.random()*10000);            //<--- Convertir a entero
        } while (n<inf || n>sup);
        return n;
    }
    
}
