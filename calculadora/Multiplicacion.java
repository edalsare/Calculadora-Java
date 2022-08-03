/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Edison Salazar
 */
public class Multiplicacion extends Operaciones {
    public Multiplicacion(float numero1, float numero2){
        super(numero1, numero2);
        operacion="Multiplicacio";
    }
    public void multiplicar(){
    resultado = numero1 * numero2;
    }
    
}
