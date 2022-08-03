/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Edison Salazar
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        System.out.println("Seleccione operación");
        System.out.println("1 Suma, 2 Resta, 3 multiplicar, 4 dividir");
        int operacion = digitar.nextInt();
        switch(operacion){
        case 1: 
        Suma sum = new Suma(0,0);
        sum.Sumar();
        sum.MostrarResultado();
        break;
        case 2: 
        Resta res = new Resta(0,0);
        res.Restar();
        res.MostrarResultado();
        break;
        case 3: 
        Multiplicacion mul = new Multiplicacion(0,0);
        mul.multiplicar();
        mul.MostrarResultado();
        break;
        case 4: 
        Division div = new Division(0,0);
        div.Dividir();
        div.MostrarResultado();
        break;
    }
        
       
        digitar.close();
        
    }
    
}

