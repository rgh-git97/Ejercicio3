public class Carta {
    private final Palo figura;
    private final Numero numero;
    //private  final Color color;//
    public Carta(Palo f, Numero n){
        this.figura = f;
        this.numero = n;
       // this.color = x;//
    }
    public Palo getFigura() {
        return figura;
    }
    public Numero getNumero() {
        return numero;
    }

    //public Color getColor() {
      //  return color;//
    //

    @Override
    public String toString(){
        return this.numero.toString() + "-" + this.figura.toString();
    }
}