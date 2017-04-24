package Core;

import Core.Ficha;
import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    private int jugadas = 0;//cuando los números de los extremos ya han sido jugados 7 veces
    private String nombre;
    private ArrayList<Ficha> arrayFichas;
    //private int numFichas = 7;
    private boolean soyMano;

    public Jugador(String nombre, boolean soyMano) {
        this.nombre = nombre;
        //this.numFichas = numFichas;
        this.soyMano = soyMano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas() {
        this.jugadas++;
    }

    public ArrayList<Ficha> getArrayFichas() {
        return arrayFichas;
    }

//    public int getNumFichas() {
//        return numFichas;
//    }
    public boolean getSoyMano() {
        return soyMano;
    }

    public Ficha elegirFicha() {
        Scanner entrada = new Scanner(System.in);
        Ficha toret = null;
        //if (numFichas == 0) {
        if (arrayFichas.isEmpty()) {
            System.out.println("No existen fichas en la mano");
        } else {
            mostrarFichas();
            System.out.println("Elige ficha:");
            int i = Integer.parseInt(entrada.nextLine()) - 1;
            toret = arrayFichas.get(i);
            eliminarFicha(toret);
            return toret;
        }
        return toret;
    }

    public void mostrarFichas() {
        for (int i = 0; i < arrayFichas.size(); i++) {
            System.out.println(i + 1 + "-. " + arrayFichas.get(i));
        }
    }

    public void fichasPrincipio(Monton m) {
        arrayFichas = new ArrayList<Ficha>();
        for (int i = 0; i < 7; i++) {
            arrayFichas.add(m.sacarFicha());
        }
    }

    public void cogerFichaMonton(Monton m) {
        arrayFichas.add(m.sacarFicha());
    }

    public void eliminarFicha(Ficha f) {
        arrayFichas.remove(f);
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        toret.append(getNombre());
        toret.append(getSoyMano());

        return toret.toString();
    }
}
