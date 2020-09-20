import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Carta> baraja;
    public Baraja(){
        this.construir();
    }
    private void construir() {
        this.baraja = new ArrayList();
        for (Palo f : Palo.values()) {
            for (Numero n : Numero.values()) {
                //for (Color x : Color.values()) {
                    this.baraja.add(new Carta(f, n ));

            }
        }
    }
    public void mezclar(byte cantidad){
        int nVeces = cantidad * this.baraja.size();
        Random random = new Random();
        int index = 0;
        Carta carta;
        for(int i = 0; i < nVeces; i++){
            index = random.nextInt(this.baraja.size());
            carta = this.baraja.remove(index);
            index = random.nextInt(this.baraja.size());
            this.baraja.add(index, carta);
        }
    }
    public int getNumeroCartas(){
        return this.baraja.size();
    }
    public Carta getCarta(){
        return this.baraja.remove(0);
    }
    public boolean estaVacia(){
        return this.baraja.isEmpty();
    }
    @Override
    public String toString(){
        return this.baraja.toString();
    }
}