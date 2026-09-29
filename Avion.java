/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPoo;


public class Avion implements Volador {

    @Override
    public void despegar() {
        System.out.println("El avión acelera en la pista y se eleva.");
    }

    @Override
    public void volar() {
        System.out.println("El avión vuela a velocidad de crucero.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión despliega el tren de aterrizaje y frena.");
    }
}
