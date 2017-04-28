/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

public class Ficha {

    private int derecha;
    private int izquierda;
    private int elemento;
   
    public Ficha(int derecha, int izquierda) {
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    public Ficha() {
    }

    public int getDerecha() {
        return derecha;
    }

    public void setDerecha(int derecha) {
        this.derecha = derecha;
    }

    public int getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

    public int getElemento() {
        return elemento;
    }


    public void setElemento(int elem) {
        elemento = elem;
    }

    @Override
    public String toString() {
        return "|" + izquierda + "|" + derecha + "| ";
    }
}
