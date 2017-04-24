/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import cola.Cola;
import cola.EnlazadaCola;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author dygyb
 */
public class Monton {

    //private int numFichas = 0;
    private ArrayList<Ficha> montonFichas;

    public Monton() {
        rellenarMonton();
        mezclar();
    }

    public ArrayList<Ficha> getMontonFichas() {
        return montonFichas;
    }

    public void rellenarMonton() {
        montonFichas = new ArrayList<Ficha>();
        int ficha = 0;
        int a = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                montonFichas.add(new Ficha(i, j));
                a++;
                //numFichas++;
            }
        }
    }

//    public int getNumFichas() {
//        return numFichas;
//    }
    public void mezclar() {
        Collections.shuffle(montonFichas);
    }

    public Ficha sacarFicha() {
        //mezclar();
        Ficha toret;
        do {
            int num = (int) (Math.random() * montonFichas.size() - 1);
            toret = montonFichas.get(num);
            eliminarFicha(toret);
        } while (toret == null);
        return toret;
    }

    public void eliminarFicha(Ficha f) {
        montonFichas.remove(f);
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (int i = 0; i < 28; i++) {
            toret.append(montonFichas.get(i));
        }
        return toret.toString();
    }
    
}
/*
    public void sacarFicha(int fichas) {
        Object fin = null;
        if (fin == null) {
            System.out.println("Estructura VacÃ­a");
        } else if (fin.get.Ficha() == Ficha) {
            fin.getAnt().setSig(fin.getSig());
            fin.getSig().setAnt(fin.getAnt());
            fin = fin.getAnt();
            numElem--;
        } else {
            Nodo actual = fin.getSig();
            while (actual != fin && actual.getElemento() != elemento) {
                actual = actual.getSig();
            }
            if (actual == fin) {
                System.out.println("Elemento no estÃ¡");
            } else {
                actual.getAnt().setSig(actual.getSig());
                actual.getSig().setAnt(actual.getAnt());
                numElem--;
            }
        }
    }
}
 */


 /*public static <E> Cola<E> mezclarFichas(Cola<E> q1, Cola<E> q2) {
        Cola<E> toRet = new EnlazadaCola<>();
        while (!q1.esVacio() && !q2.esVacio()) {
            toRet.insertar(q2.suprimir());
            toRet.insertar(q1.suprimir());
        }
        while (!q2.esVacio()) {
            toRet.insertar(q2.suprimir());
        }
        while (!q1.esVacio()) {
            toRet.insertar(q1.suprimir());
        }
        return toRet;
    }

    public static <E> Cola<E> sacarFicha(Cola<E> q1, Cola<E> q2) {
        Cola<E> toRet = new EnlazadaCola<>();

        return toRet;
    }

    public void sacarFicha(int fichas) {
        Cola<Integer> cola1 = new EnlazadaCola<>();
        Cola<Integer> cola2 = new EnlazadaCola<>();
        for (int i = 1; i <= 14; i++) {
            cola1.insertar(i);
        }
        for (int i = 15; i <= 28; i++) {
            cola2.insertar(i);
        }
        Cola<Integer> cola3 = mezclarFichas(cola1, cola2);
        while (!cola3.esVacio()) {
            System.out.print(cola3.suprimir() + ", ");
        }
        System.out.println();
    }*/
