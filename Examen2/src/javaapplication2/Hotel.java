/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Hotel {
    int [][]Habitaciones = null;
    int [][]= new int [3][3];
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
              System.out.println(Habitaciones[i][j] + "\n");
            System.out.println();
        }
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de su Habitacion"));
                String tipo = JOptionPane.showInputDialog(null, "Escriba el tipo (simple o doble)");
                int precioNoche = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el precio por noche"));
                String estadoActual = JOptionPane.showInputDialog(null, "Escriba el estado actual (libre, ocupada, sucia)");
   
}