/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Edison Salazar
 */
public class Operaciones {
    float numero1;
    float numero2;
    float resultado;
    String operacion;
    
    public Operaciones(float num1, float num2){
        this.numero1 = num1;
        this.numero2 = num2;
        //this.resultado = res;
        Scanner digitar = new Scanner(System.in);
        System.out.println("ingrese numero 1: ");
        this.numero1=digitar.nextInt();
        System.out.println("ingrese numero 2: ");
        this.numero2=digitar.nextInt();
        digitar.close();
    }
    
    public void MostrarResultado(){
        if(operacion!=" "){
        System.out.println("el resultado de la "+this.operacion+" es: "+this.resultado);
        }else System.out.println("NO se puede dividir entre cero");
    }
            
    
}
