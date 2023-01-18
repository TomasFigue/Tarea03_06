/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea3_06;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author tom59
 */
public class Tarea3_06 {

    public static void EstrellaA(Graphics g){
    //estrella
        g.setColor(Color.YELLOW);
        int[] est_x={300,250,150,230,200,300,400,370,450,350};
        int[] est_y={100,200,200,280,400,340,400,280,200,200};      
        g.fillPolygon(est_x, est_y, 10);
    }
    public static void CirculoA(Graphics g){
        //circulo
        g.setColor(Color.YELLOW);
        g.fillOval(150, 100, 300, 300);
    }
    public static void CuadradoA(Graphics g){
         //cuadrado
        g.setColor(Color.YELLOW);
        g.fillRect(150, 100, 300, 300);
    }
    public static void RectanguloA(Graphics g){
        //rectangulo
        g.setColor(Color.YELLOW);
        g.fillRect(150, 100, 100, 200);
    }
    public static void TrianguloA(Graphics g){
        //triangulo
        g.setColor(Color.YELLOW);
        int[] puntos_x={300,100,300};
        int[] puntos_y={200,600,600};
        g.fillPolygon(puntos_x, puntos_y, 3);
    }
    

    //AZUL
    public static void EstrellaAZ(Graphics g){
    //estrella
        g.setColor(Color.BLUE);
        int[] est_x={300,250,150,230,200,300,400,370,450,350};
        int[] est_y={100,200,200,280,400,340,400,280,200,200};      
        g.fillPolygon(est_x, est_y, 10);
    }
    public static void CirculoAZ(Graphics g){
        //circulo
        g.setColor(Color.BLUE);
        g.fillOval(150, 100, 300, 300);
    }
        public static void CuadradoAZ(Graphics g){
         //cuadrado
        g.setColor(Color.BLUE);
        g.fillRect(150, 100, 300, 300);
    }
    public static void RectanguloAZ(Graphics g){
        //rectangulo
        g.setColor(Color.BLUE);
        g.fillRect(150, 100, 100, 200);
    }
    public static void TrianguloAZ(Graphics g){
        //triangulo
        g.setColor(Color.BLUE);
        int[] puntos_x={300,100,300};
        int[] puntos_y={200,600,600};
        g.fillPolygon(puntos_x, puntos_y, 3);
    } 
    
    //ROJO
    public static void EstrellaR(Graphics g){
    //estrella
        g.setColor(Color.RED);
        int[] est_x={300,250,150,230,200,300,400,370,450,350};
        int[] est_y={100,200,200,280,400,340,400,280,200,200};      
        g.fillPolygon(est_x, est_y, 10);
    }
    public static void CirculoR(Graphics g){
        //circulo
        g.setColor(Color.RED);
        g.fillOval(150, 100, 300, 300);
    }
    public static void CuadradoR(Graphics g){
         //cuadrado
        g.setColor(Color.RED);
        g.fillRect(150, 100, 300, 300);
    }
    public static void RectanguloR(Graphics g){
        //rectangulo
        g.setColor(Color.RED);
        g.fillRect(150, 100, 100, 200);
    }
    public static void TrianguloR(Graphics g){
        //triangulo
        g.setColor(Color.RED);
        int[] puntos_x={300,100,300};
        int[] puntos_y={200,600,600};
        g.fillPolygon(puntos_x, puntos_y, 3);
    }

    //VERDE
    public static void EstrellaG(Graphics g){
    //estrella
        g.setColor(Color.GREEN);
        int[] est_x={300,250,150,230,200,300,400,370,450,350};
        int[] est_y={100,200,200,280,400,340,400,280,200,200};      
        g.fillPolygon(est_x, est_y, 10);
    }
    public static void CirculoG(Graphics g){
        //circulo
        g.setColor(Color.GREEN);
        g.fillOval(150, 100, 300, 300);
    }
        public static void CuadradoG(Graphics g){
         //cuadrado
        g.setColor(Color.GREEN);
        g.fillRect(150, 100, 300, 300);
    }
    public static void RectanguloG(Graphics g){
        //rectangulo
        g.setColor(Color.GREEN);
        g.fillRect(150, 100, 100, 200);
    }
    public static void TrianguloG(Graphics g){
        //triangulo
        g.setColor(Color.GREEN);
        int[] puntos_x={300,100,300};
        int[] puntos_y={200,600,600};
        g.fillPolygon(puntos_x, puntos_y, 3);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

