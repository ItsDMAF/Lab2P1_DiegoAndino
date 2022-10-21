
package lab2p1_diegoandino;

import java.util.Scanner;

public class Lab2P1_DiegoAndino {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int opcion;
       do{
           System.out.println("-------MENU-------");
           System.out.println("1 <- MCD");
           System.out.println("2 <- Sumatoria");
           System.out.println("3 <- Supermercado");
           System.out.println("4 <- SALIDA");
           System.out.println("Ingrese su opcion: ");
           opcion = leer.nextInt();
//------------------------------------------------------------------------------
           if (opcion == 1){
              int numero1, numero2;
              System.out.println("Ingrese el primer numero:");
              numero1 = leer.nextInt();
              System.out.print("Ingrse el seguno numero:");
              numero2 = leer.nextInt();
              
              if (numero1 <= 0 || numero2 <= 0){
                  System.out.println("Los numeros ingresados deben ser positivos");
              }
              else{
              while (numero1 != numero2){
                  if (numero1 > numero2){
                    numero1 = numero1 - numero2;
                  }//Fin de if
                  else{
                    numero2 = numero2 - numero1;
                    
                  }//Fin de else

              }// Fin de while

             System.out.println("El MCD es: " + numero1);
             
              }// Fin de else
              
           }//Fin de opcion 1
//------------------------------------------------------------------------------
           if (opcion == 2){
               int  n = 1, k;
               double acumulador = 0, base, union;
               System.out.println("Ingrese el valor de k: ");
               k = leer.nextInt();
               
               while (n <= k){
                   base = (double)((double)n / (double)(n + 1));
                   
                   union = (double)Math.pow (base,n);
                   acumulador = (double)acumulador + union;
                   n++;
            
               }//Fin de while
               
               System.out.println("El acumulador da: " + acumulador);
               
           }//Fin opcion 2
//------------------------------------------------------------------------------
           if (opcion == 3){
           double cliente, cantpro, precio, compra;
           
           System.out.println("Ingrese el tipo de cliente que es: ");
           cliente = leer.nextDouble();
           System.out.println("Ingrese el precio de la unidad del producto");
            precio = leer.nextDouble();
           System.out.println("Ingrese la cantidad del producto que lleva");
           cantpro = leer.nextDouble();
           
           if (cliente == 0){
               if(cantpro >= 10 && cantpro <= 19){
                 cantpro = cantpro - 2;  
               }//Fin if
               else
                   if(cantpro > 20){
                     cantpro = cantpro - 5;
                   }// Fin else if

               compra = cantpro * precio;
               System.out.println("El total a pagar es: " + compra);
           }//Fin de if
           
           if (cliente == 1){
               if(cantpro >= 20 && cantpro <= 29){
                 cantpro = cantpro - 2;  
               }//Fin if
               else
                   if(cantpro > 30){
                     cantpro = cantpro - 5;
                   }// Fin else if 03

               compra = cantpro * (precio - (precio*0.1));
               System.out.println("El total a pagar es: " + compra);
           }//Fin de if 1
           
           if (cliente == 2){
               if(cantpro >= 30 && cantpro <= 39){
                 cantpro = cantpro - 2;  
               }//Fin if
               else
                   if(cantpro > 40){
                     cantpro = cantpro - 5;
                   }// Fin else if
                   
               compra = cantpro * (precio - (precio*0.3));
               System.out.println("El total a pagar es: " + compra);
           }//Fin de if 2
           }//Fin de opcion 3
           
            
       }while (opcion != 4);
       
    }// Fin de Programa
    
}//Fin de Clase
