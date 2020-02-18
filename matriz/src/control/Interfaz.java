package control;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Interfaz extends JFrame implements ActionListener{
    int contador =0;
    boolean turno = true;
    JPanel panel;
    JButton matriz[][]= new JButton[8][8]; 
          
    public Interfaz(){
        //setLayer(null);
       
        //boton1.setBounds(300,250,100,30);
        //add(boton1);
        //boton1.addActionListener(this);
        panel=new JPanel();
        panel.setLayout(new GridLayout(8,8));

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++ ){
                matriz[i][j]= new JButton("boton"+contador);
                contador ++;
                panel.add(matriz[i][j]);
                matriz[i][j].addActionListener(this);
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/blank.png"));//ruta del programa
                matriz[i][j].setText("blanco");
                
            }
            
        }
        matriz[3][3].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
        matriz [3][3].setText("rojo");
        matriz[4][4].setIcon(new ImageIcon ("src/imagenes/imagen.png"));
        matriz [4][4].setText("rojo");
        matriz[3][4].setIcon(new ImageIcon ("src/imagenes/verde.png"));
        matriz [3][4].setText("verde");
        matriz[4][3].setIcon(new ImageIcon ("src/imagenes/verde.png"));
        matriz [4][3].setText("verde");
        add(panel);
        
        
        //while que verifica cambios de turno y casillas disponibles (booleano y contador inverso respectivamente
                    //verificar validas aqui
        
        
        
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==matriz[0][0]){
            
            // verifica turno
            //rellena
            //cuando rellena cambia de turno
            if (turno == true){
                
               //verificar si es valido
               //casilla en blanco
               if(matriz [0][0].getText()== "blanco"){
                      //buscar a los lados
                      //saber hacia donde puede
                      
               }
               
               
               //......
            matriz [0][0].setIcon(new ImageIcon("src/imagenes/imagen.png"));
            
        
            } else if (turno == false){
                
                if(matriz [0][0].getText()== "blanco"){
                
                }
                 matriz [0][0].setIcon(new ImageIcon("src/imagenes/verde.png"));
            
        }
           
        
    }
     
} 
}
