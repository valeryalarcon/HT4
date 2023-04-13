
package ht4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HT4 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        double r, h, acil, vcil, pcil, acir, vcir, pcir, a, l, apar, vpar, ppar, acon, vcon, pcon;
        
        while(!salir){
            
            System.out.println("Elige la figura con la que deseas trabajar:");
            
            System.out.println("1.Esfera");
            System.out.println("2.Paralelepípedo");
            System.out.println("3.Cono");
            System.out.println("4.Cilindro");
            System.out.println("5. Salir");
            opcion = sn.nextInt();
            try{
            
            switch (opcion) {
                case 1:
                    System.out.println("Esfera");
                    System.out.println("Ingrese el radio de la esfera en cm: ");
                    r = sn.nextDouble();
                    System.out.println("");
                    
                    acir = (4)*(Math.PI)*(r*r);
                    vcir = (1.333333333)*(Math.PI)*(r*r*r);
                    pcir = (2)*(Math.PI)*(r);
                    
                    System.out.println("");
                    System.out.println("El área de la esfera es: "+acir+"cm²");
                    System.out.println("El volúmen de la esfera es: "+vcir+"cm³");
                    System.out.println("El perímetro de la esfera es: "+pcir+"cm");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Paralelepípedo");
                    System.out.println("Ingrese la altura del paralelepípedo en cm: ");
                    h = sn.nextDouble();
                    System.out.println("");
                    System.out.println("Ingrese el ancho del paralelepípedo en cm: ");
                    a = sn.nextDouble();
                    System.out.println("");
                    System.out.println("Ingrese el largo del paralelepípedo en cm: ");
                    l = sn.nextDouble();
                    
                    apar = ((2)*(h)*(l))+((2)*(h)*(a))+((2)*(l)*(a));
                    vpar = (h)*(a)*(l);
                    ppar = ((4)*(h))+((4)*(a))+((4)*(l));
                    
                    System.out.println("");
                    System.out.println("El área del paralelepípedo es: "+apar+"cm²");
                    System.out.println("El volúmen del paralelepípedo es: "+vpar+"cm³");
                    System.out.println("El perímetro del paralelepípedo es: "+ppar+"cm");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Cono");
                    System.out.println("Ingrese la altura del cono en cm: ");
                    h = sn.nextDouble();
                    System.out.println("");
                    System.out.println("Ingrese el radio del cono en cm: ");
                    r = sn.nextDouble();
                    
                    acon = ((Math.PI)*(r*r))+((2)*(Math.PI)*(r)*(Math.sqrt((r*r)+(h*h))));
                    vcon = (0.3333333333)*(Math.PI)*(r*r)*(h);
                    pcon = ((2)*(Math.PI)*(r))+h;
                    
                    System.out.println("");
                    System.out.println("El área del cono es: "+acon+"cm²");
                    System.out.println("El volúmen del cono es: "+vcon+"cm³");
                    System.out.println("El perímetro del cono es: "+pcon+"cm");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Cilindro");
                    System.out.println("Ingrese el radio del cilindro en cm: ");
                    r = sn.nextDouble();
                    System.out.println("");
                    System.out.println("Ingrese la altura del cilindro en cm: ");
                    h = sn.nextDouble();
                    
                    acil = ((2)*(Math.PI)*(r*r))+((2)*(Math.PI)*(r)*(h));
                    vcil = (Math.PI)*(r*r)*(h);
                    pcil = ((2)*(Math.PI)*(r))+h;
                    
                    System.out.println("");
                    System.out.println("El área del cilindro es: "+acil+"cm²");
                    System.out.println("El volúmen del cilindro es: "+vcil+"cm³");
                    System.out.println("El perímetro del cilindro es: "+pcil+"cm");
                    System.out.println("");
                    break;
                case 5:
                    salir=true;
                    break;    
                default:
                    System.out.println("Las opciones son entre 1 y 5");
                         
            }
            }catch (InputMismatchException e){
                System.out.println("Debes ingresar una opción válida.");
                sn.next();
                
            }
                             
        }
        System.out.println("Gracias por utilizar este menú!");
    }
    
}
