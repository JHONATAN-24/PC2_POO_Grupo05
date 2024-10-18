/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import Interfaces.IDibujar;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author LAB-USR-CHIMBOTE
 */
public class PuntoGrafrico implements IDibujar {
    private int puntoX;
    private int puntoY;

    public PuntoGrafrico() {
    }

    public PuntoGrafrico(int puntoX, int puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }
    
    //GETTERS AND SETTERS

    public int getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }
    
    //DEFINIR OVERRIVE(SOBREESCRITURA)

    @Override
    public String toString() {
        return "PuntoGrafrico{" + "puntoX=" + puntoX + ", puntoY=" + puntoY + '}';
    }
    
    //METODOS DE LA INTERFACES

    @Override
    public void Dibujar(Graphics g) {
        Font nuevoF=new Font("Arial",1,50);
        g.setColor(Color.green);
        g.setFont(nuevoF);
        g.drawString(".", this.puntoX, this.puntoY);
        
    }
    
    
    
}
