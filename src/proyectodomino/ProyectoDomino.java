package proyectodomino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Core.Jugador;
import Core.Mesa;
import Core.Monton;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dygyb
 */
public class ProyectoDomino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monton monton = new Monton();
        Mesa mesa = new Mesa();
        int numJugadores = 2;
        ArrayList<Jugador> jugadores = new ArrayList<>();

        Scanner scn = new Scanner(System.in);
        boolean error = false;

        do {
            error = false;
            try {
                System.out.println("Introduzca Numero de Jugadores");
                numJugadores = Integer.parseInt(scn.nextLine());
                if (numJugadores < 2) {
                    error = true;
                }
            } catch (NumberFormatException exc) {
                System.err.println("Error. Introduzca un número");
                error = true;
            }
        } while (error);

        for (int i = 0; i < numJugadores; i++) {
            Jugador aux;
            System.out.println("Nombre del jugador : " + (i + 1));
            if (i == 0) {
                aux = new Jugador(scn.nextLine(), true);
                aux.fichasPrincipio(monton);
                jugadores.add(aux);
            } else {
                aux = new Jugador(scn.nextLine(), false);
                aux.fichasPrincipio(monton);
                jugadores.add(aux);
            }
        }

        boolean fin = false;

        while (!fin) {
            for (Jugador jugador : jugadores) {
                boolean salirBucle = false;
                System.out.println("Ronda nº " + (jugador.getJugadas() + 1));
                System.out.println("Truno del jugador " + jugador.getNombre());
                System.out.println(mesa);
                try {
                    do {
                        System.out.println("Elige lo que quieres hacer :\n"
                                + "\t1.- Insertar Ficha por la Izquierda\n"
                                + "\t2.- Insertar Ficha por la Derecha\n"
                                + "\t3.- Sacar ficha del Montón\n"
                                + "\t4.- Ver todas tus fichas\n"
                                + "\t5.- Ver fichas en la mesa");
                        int op = scn.nextInt();
                        switch (op) {
                            case 1:
                                mesa.insertarFichaIzquierda(jugador.elegirFicha());
                                salirBucle = true;
                                break;
                            case 2:
                                mesa.insertarFichaDerecha(jugador.elegirFicha());
                                salirBucle = true;
                                break;
                            case 3:
                                jugador.cogerFichaMonton(monton);
                                System.out.println("En el montón hay " + monton.getMontonFichas() + " Fichas");
                                break;
                            case 4:
                                jugador.mostrarFichas();
                                break;
                            case 5:
                                System.out.println(mesa);
                                break;
                            default:
                                System.out.println("Introduzca una opción correcta");
                                break;
                        }
                    } while (!salirBucle);
                } catch (NumberFormatException e) {

                }
                jugador.setJugadas();//Sumamos una jugada al jugador
                if (jugador.getJugadas() == 7) {
                    fin = true;
                }
            }

        }

    }

    public static void introducirNumeroJugadores(Scanner scn) {

    }
}
