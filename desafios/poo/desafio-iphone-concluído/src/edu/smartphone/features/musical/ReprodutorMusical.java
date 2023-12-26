package edu.smartphone.features.musical;

import edu.NumeroInvalidoException;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica() throws NumeroInvalidoException;
}
