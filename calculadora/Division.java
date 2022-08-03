/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Edison Salazar
 */
public class Division extends Operaciones {
    public Division(float numero1, float numero2){
        super(numero1, numero2);
        
    }
    public void Dividir(){
       if(numero2 != 0){ 
        operacion="Divicion";
        resultado = numero1 / numero2;
       }else {
           operacion=" ";
             }
    }
    
}
