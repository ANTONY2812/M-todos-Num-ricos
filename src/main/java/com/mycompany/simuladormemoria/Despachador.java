package com.mycompany.simuladormemoria;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

class Despachador {
    
    static void despacha(Proceso p, ArrayList<Bloque> memoria) {
        if (p.getPsize()<gv.totalMemoria) {
            int mpintada=0;
            for (Bloque bloque : memoria) {
                if (bloque.isOcupado()==false) {
                    bloque.setBackground(p.getColor());
                    bloque.setText(""+p.getPtime());
                    bloque.setOcupado(true);
                    bloque.setPid(p.getPid());
                    gv.totalMemoria--;
                    mpintada++;
                    if (mpintada>=p.getPsize()) {
                        break;
                    }
                }
            }
            p.setPstate("Ejecutandose");
        }
    }

    static void cambiaContextoProceso(Bloque b, ArrayList<Proceso> procesos) {
        String pid=b.getPid();
        b.setPid("0");
        b.setBackground(gv.colordefaultmemoria);
        b.setText("");
        gv.totalMemoria++;
        b.setOcupado(false);
        for (Proceso p : procesos) {
            if (p.getPid().equals(pid)) {
                p.setPstate("TERMINADO");
                break;
            }
        }
    }
}
