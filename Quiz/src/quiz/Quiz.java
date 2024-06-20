/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantSalarios;
        int cantEmpleados = 0;
        int salario =0;
        int salarioindividual;
        int resultado;
        int SEM;
        int IVM;
        String cantidad1;
        cantidad1 = JOptionPane.showInputDialog("Ingresar la cantidad de enpleados");
        System.out.println("Digite la cantidad de empleados" + cantEmpleados);
        cantEmpleados = Integer.parseInt(cantidad1);
        for(int i =0; i < cantEmpleados; i++) {
            String cantidad2;
            cantidad2 = JoptionPane.showInputDialog("Ingresar el salario del empleado");
            double r = salarioindividual + Double.parseDouble(cantidad2);
            for (i > cantSalario; i++) { 
            SEM= cantSalarios * 0,0925;
            IVM= cantSalarios * 0.0508;
            resultado = (int) (SEM + IVM - 42990);
            System.out.println("la empresa debera donar" + resultado + "por concepto de SEM y IVM");
            }
            
            
        }
    }
