/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author FAMPAREDES DE PAZ
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        int a[]=new int[17];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*17);                    
        }
        System.out.print("a = [");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");       */        
        int number = 0;
        int Decision = 0;
        do {
            do {
                try{
                    number=Integer.parseInt(JOptionPane.showInputDialog("ELIJA UNA OPCION: \n"
                        +" _______________________________\n"
                        +"1.- 500              5.- 500000 \n"
                        +"2.- 10000         6.- 650000 \n"
                        +"3.- 15000         7.- 700000 \n"
                        +"4.- 250000       8.- 1000000 \n"
                        +" _______________________________\n"));                      
                    
                }catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "FUERA DE PARAMETROS-INGRESE DE NUEVO UNA OPCION");
                }
            } while (number>=10);      
        } while (number<=0 );
        switch(number){
            case 1:
                Decision=500;
                break;
            case 2:
                Decision=10000;
                break;
            case 3:
                Decision=15000;
                break;
            case 4:
                Decision=250000;
                break;
            case 5:
                Decision=500000;
                break;
            case 6:
                Decision=650000;
                break;
            case 7:
                Decision=700000;
                break;
            case 8:
                Decision=1000000;
                break;
        }      
        int nCantidadDatos=Decision;
        int nValorMinimo=0;
        int nValorMaximo=1000000;
        int a[]=new int [nCantidadDatos];
        TiposdeOrdenamiento o=new TiposdeOrdenamiento ();
        int[] oArreglo = o.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        //"Metodo Insercion"
        long nIniciotiempo1= System.currentTimeMillis();
        TiposdeOrdenamiento.Insercion(oArreglo);
        long nRetardoTiempo1 = System.currentTimeMillis() - nIniciotiempo1;
        //"Metodo burbuja"
        long nIniciotiempo2= System.currentTimeMillis();
        TiposdeOrdenamiento.Burbuja(oArreglo);
        long nRetardoTiempo2 = System.currentTimeMillis() - nIniciotiempo2;
        //"Metodo Quickshort"
        long nIniciotiempo3= System.currentTimeMillis();
        TiposdeOrdenamiento.Quickshort(oArreglo , 0 , oArreglo.length - 1);            
        long nRetardoTiempo3 = System.currentTimeMillis() - nIniciotiempo3;
        //"Metodo Shell"
        long nIniciotiempo4= System.currentTimeMillis();
        TiposdeOrdenamiento.Shell(oArreglo);
        long nRetardoTiempo4 = System.currentTimeMillis() - nIniciotiempo4;
        
        
        
        JOptionPane.showMessageDialog(null, "Cantidad de Registro:  " + nCantidadDatos  + " \n"
            + " \n"
            + "Metodo                  |"+"     Tiempo de ordenamiento \n" 
            + "_________________________________________________________\n"
            + "Inserccion            |                         "+nRetardoTiempo1+" \n"      
            + "Burbuja                  |                         "+ nRetardoTiempo2+" \n"
            + "Quickshort           |                         "+nRetardoTiempo3+ " \n"
            + "Shell                       |                         "+nRetardoTiempo4);    
    }   
    
    
}
