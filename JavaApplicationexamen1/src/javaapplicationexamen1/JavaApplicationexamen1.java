/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationexamen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JavaApplicationexamen1 {

    private static String Cantdefacturas;

    /**
     * @param args the command line arguments
     */
    public static String main(String[] args) {
        // TODO code application logic here
        String nombredelCliente = null;
        int ceduladelCliente;
        int codigodeFactura;
        int MontodelaFactura;
        int numerodelMesIndicado;
        int productosElectricos = 0;
        int productosAutomotrices = 0;
        int productosConstruccion = 0;
        int Cantdefacturas;
        String facturas;
        facturas=JOptionPane.showInputDialog("Ingrese la cantidada de facturas");
        System.out.println("Digite la cantidad de facturas" + facturas);
        Cantdefacturas= Integer.parseInt(facturas);
        for(int i =0; i < Cantdefacturas; i++) {
            if (Cantdefacturas == productosElectricos + productosAutomotrices + productosConstruccion) {
                System.out.println("Recibe un bono del 10%");
            } else if (Cantdefacturas > 50000){
                System.out.println("Se le suma 3 puntos");
            } else if (productosElectricos >= 3) {
                System.out.println("Recibe un bono del 4%");
            }    else {
                System.out.println("Recibe un bono del 2%");
                System.out.println("Se le suma 1 punto");
            } if (productosAutomotrices > 4) {
                System.out.println("Recibe un bono del 4%");
            }    else{
                System.out.println("Se le suma 1 punto");
            }if (Cantdefacturas == productosConstruccion) {
                System.out.println("Recibe un bono del 8%");
                System.out.println("Se le suma 2 punto");
            }   else if (Cantdefacturas > 50000){
                System.out.println("Se le suma un punto");
            }  else if (Cantdefacturas > 10){
                System.out.println("BONO EXTRA (MONTO EXTRA DE 20000)");
            } else if (Cantdefacturas > 300000){
                System.out.println("BONO EXTRA (MONTO EXTRA DE 20000)");   
            }
            String getnombredelCliente;
                return nombredelCliente; 
            }
            int getceduladelCliente;
                return ceduladelCliente;
                
            int getcodigodeFactura;
                return codigodefactura;
                
            int getMontodelaFactura;
                return MontodelaFactura;
            
            int getnumerodelMesIndicado;
                retur numerodelMesIndicado;
        
            int getproductosElectricos;
                return productosElectricos;
        
            int getproductosAutomotrices;
                return productosAutomotrices;
           
            int getproductosConstruccion;
                return productosCostruccion;
          
    
}
