/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;


/**
 *
 * @author Edison Salazar
 */
public class Suma extends Operaciones{
    
    public Suma(float numero1, float numero2){
        super(numero1, numero2);
        operacion = "Suma:";
    }
    public void Sumar(){
    resultado = numero1 + numero2;
    }
    
}        

