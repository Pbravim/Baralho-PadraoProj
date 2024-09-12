package builder;

import baralho.Baralho;

public class Director {
    private BaralhoBuilderInterface builder;

    public Director(BaralhoBuilderInterface builder) {
        this.builder = builder;
    }

    public void setBuilder(BaralhoBuilderInterface builder) {
        this.builder = builder;
    }

    public Baralho makeBaralho() {
        builder.reset();
        builder.addCartasPadrao();
        builder.addCartasEspeciais();
        return builder.getResult();
    }
}
