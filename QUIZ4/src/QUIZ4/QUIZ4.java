/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QUIZ4;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class QUIZ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso Curso[] = new Curso[10];
        for (int i = 0; i < Curso.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitaran la lista de los estudiantes" + i);
            String nombreEstudiante = JOptionPane.showInputDialog(null, "Escriba el nombre del estudiante" +i);
            String curso = JOptionPane.showInputDialog(null, "Escriba el nombre del curso" +i);
            String profesor = JOptionPane.showInputDialog(null, "Escriba el nombre del profesor" +i);
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la calificacion") +i);
            Curso[i] = new Curso(nombreEstudiante, curso, profesor, calificacion);
    }
        /*Estudiante con la mayor nota*/
        int i = 0;
        int nombreEstudiante = 0;
        int calificacion =0;
        if (nombreEstudiante > calificacion) {
            JOptionPane.showMessageDialog(null, "El estudiante con la mayor nota es" );
        }else{ 
            JOptionPane.showMessageDialog(null, "El estudiante con la menor nota es" );
        }  
        
        /*Promedio de calificaciones*/
        double total =0;
        for (int i = 0; i < calificacion.length; i++) {
            total += calificacion;
        System.out.println("La suma de todas la calificaciones es" + total);
        System.out.println("El promedio es " + (total / calificacion.length ));
        }
        }
}
