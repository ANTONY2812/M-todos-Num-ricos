package com.mycompany.simuladormemoria;

import javax.swing.JLabel;

public class Bloque extends JLabel{
    
    private boolean ocupado=false;
    private String  pid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public Bloque(){ }
    
    public Bloque(int x, int y, int ancho, int alto){
        this.setBounds(x, y, ancho, alto);
        this.setBackground(gv.colordefaultmemoria);
        this.setOpaque(true);
        this.setText("");
    }
    
    public void setDefault(){
        this.setText("");
        this.setBackground(gv.colordefaultmemoria);
    }
    
}
