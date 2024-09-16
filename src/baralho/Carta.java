package baralho;// Classe Card representa uma carta de baralho.

public abstract class Carta
{
    private String face; // face da carta ("Ace", "Deuce", ...)
    private Cor[] cores;
    private int valor;

    
    // construtor de dois argumentos inicializa face e naipe da carta
    public Carta( String face, int valor, Cor cor )
    {
        this.face = face; // inicializa face da carta
        this.valor = valor;
        this.cores = new Cor[]{cor};
    } // fim do construtor Card de dois argumentos

    public Carta(String face, int valor, Cor[] cores) {
        this.face = face;
        this.valor = valor;
        this.cores = cores;
    }

    public String getFace() {
        return face;
    }

    public int getValor() {
        return valor;
    }

    public Cor[] getCor() {
        return cores;
    }

    public void setValue(int value) {
        this.valor = value;
    }

    // retorna representa��o String de Card
    public abstract String toString(); // fim do m�todo toString


} // fim da classe Card


