import java.util.ArrayList;
import java.util.List;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Dealer dealer;

    public Juego() {
        this.dealer = new Dealer(new Baraja());
        this.dealer.mezclarBaraja((byte) 15);
        this.jugadores = new ArrayList<Jugador>();
        System.out.println("Se mezcló el Deck.");
    }

    public void addJugador(Jugador jugador) {
        boolean add = this.jugadores.add(jugador);
    }

    public void repartirCartas(byte numeroCartas) {
        for (Jugador jugador: this.jugadores)
            for (byte i = 0; i < numeroCartas; i++) {
                jugador.adicionarCarta(this.dealer.entregarCarta());
            }
    }

    public String mostrarBaraja() {
        return this.dealer.mostrarBaraja();
    }

    public int getNumeroCartasDealer() {
        return this.dealer.getNumeroCartas();
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }


    public static void main(String[] args) {
        Juego juego = new Juego();
        //System.out.println("Se mezcló el Deck.");//
        System.out.println("Baraja Inicial de :" + juego.getNumeroCartasDealer() + " cartas.");

        juego.addJugador(new Jugador("Jugador-1"));
        juego.addJugador(new Jugador("Jugador-2"));
        juego.addJugador(new Jugador("Jugador-3"));
        juego.addJugador(new Jugador("Jugador-4"));
        juego.addJugador(new Jugador("Jugador-5"));
        juego.repartirCartas((byte) 6);
        System.out.println("\n----- Cartas por Jugador ------\n");
        for (Jugador j : juego.getJugadores()) {
            System.out.println(j.toString());
        }
        System.out.println("\n");
        System.out.println("Baraja Final de :" + juego.getNumeroCartasDealer() + " cartas.");
        System.out.println(juego.mostrarBaraja());
    }
}