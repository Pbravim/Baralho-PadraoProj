package baralho;// Classe Card representa uma carta de baralho.

public abstract class Carta
{
    private String face; // face da carta ("Ace", "Deuce", ...)
    private Cor cor;
    private int valor;

    
    // construtor de dois argumentos inicializa face e naipe da carta
    public Carta( String face, int valor, Cor cor )
    {
        this.face = face; // inicializa face da carta
        this.valor = valor;
        this.cor = cor;
    } // fim do construtor Card de dois argumentos


    public String getFace() {
        return face;
    }

    public int getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }



    public void setValue(int value) {
        this.valor = value;
    }

    // retorna representa��o String de Card
    public abstract String toString(); // fim do m�todo toString


} // fim da classe Card


