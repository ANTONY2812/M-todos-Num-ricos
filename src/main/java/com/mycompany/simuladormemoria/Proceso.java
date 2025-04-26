package com.mycompany.simuladormemoria;

import java.awt.Color;
import java.util.ArrayList;

public class Proceso {
    private String pid;
    private String pname;
    private String pstate="nuevo";
    private int psize;
    private int ptime;
    private Color color;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }

    public int getPsize() {
        return psize;
    }

    public void setPsize(int psize) {
        this.psize = psize;
    }

    public int getPtime() {
        return ptime;
    }

    public void setPtime(int ptime) {
        this.ptime = ptime;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    
    @Override
    public String toString() {
        return "pid=" + pid + ", nombre del proceso=" + pname + ", estado=" + pstate + ", tamaño en memoria=" + psize + ", tiempo en memoria=" + ptime;
    }

    
    public Proceso(){
        ArrayList <String>nom = new ArrayList<String>();
        nom.add("Word");
        nom.add("Excel");
        nom.add("PowerPoint");
        nom.add("Publisher");
        nom.add("Paint");
        nom.add("NeatBeans");
        nom.add("Buscaminas");
        nom.add("Opera");
        nom.add("Chrome");
        nom.add("Tetris");
        nom.add("Pacman");
        this.pname=nom.get(gv.aleatorio(0, nom.size()-1));
        this.psize=gv.aleatorio(50, 120);
        this.ptime=gv.aleatorio(50,80 );
        int r=gv.aleatorio(1, 250);
        int g=gv.aleatorio(1, 250);
        int b=gv.aleatorio(1, 250);
        this.color=new Color(r,g,b);
        String cad="";
        for (int i = 0; i < 8; i++) {
            cad=cad+gv.aleatorio(0, 9);
        }
        this.pid=cad;        
        this.pstate="Listo";
    }
    
}
