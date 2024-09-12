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

    public Baralho makeBaralho(String tipo) {
        builder.reset();
        builder.addCartasPadrao();
        if (!tipo.equals("tradicional")){
            builder.addCartasEspeciais();
        }

        return builder.getResult();
    }
}
