package Core;

import Core.Ficha;
import java.util.ArrayDeque;

public class Mesa {

    public ArrayDeque<Ficha> fichasMesa;
    private int numFichas;
    private Monton monton;

    public Mesa() {
        this.fichasMesa = new ArrayDeque<Ficha>();

    }

    public ArrayDeque<Ficha> getFichasMesa() {
        return fichasMesa;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public Monton getMonton() {
        return monton;
    }

    public void insertarFichaDerecha(Ficha f) {
        fichasMesa.addLast(f);

    }

    public void insertarFichaIzquierda(Ficha f) {
        fichasMesa.addFirst(f);

    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        if (getFichasMesa().size() <= 0) {
            toret.append("La Mesa está vacía");
        } else {
            toret.append(getFichasMesa());
        }
        return toret.toString();
    }

}
