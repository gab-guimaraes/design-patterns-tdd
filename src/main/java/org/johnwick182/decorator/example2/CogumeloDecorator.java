package org.johnwick182.decorator.example2;

public class CogumeloDecorator extends PersonagemDedcorator {
    public CogumeloDecorator(Personagem personagemDecorado) {
        super(personagemDecorado);
    }

    @Override
    public void habilidades() {
        System.out.println("ganhou poder do cogumelo");
    }

}
