package com.mycompany.simuladormemoria;

import java.util.ArrayList;

public class Procesador {

    static void procesa(ArrayList<Bloque> memoria,ArrayList <Proceso> procesos) {
        for (Bloque b : memoria) {
            if (!b.getText().equals("")) {
                String val=b.getText();
                int val2=Integer.parseInt(val)-1;
                b.setText(""+val2);
                if (val2<=0) {
                    Despachador.cambiaContextoProceso(b,procesos);
                    
                }
            }
        }
    }
    
}
