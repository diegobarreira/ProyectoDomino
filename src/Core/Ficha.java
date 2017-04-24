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

    private Ficha siguiente;

    public Ficha(int derecha, int izquierda) {
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    public Ficha() {
    }

    Ficha(int MIN_VALUE, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Ficha getSig() {
        return siguiente;
    }

    public void setElemento(int elem) {
        elemento = elem;
    }

    public void setSig(Ficha sig) {
        siguiente = sig;
    }

    @Override
    public String toString() {
        return "|" + izquierda + "|" + derecha + "| ";
    }
}
