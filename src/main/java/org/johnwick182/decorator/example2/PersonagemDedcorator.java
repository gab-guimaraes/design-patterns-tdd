package org.johnwick182.decorator.example2;

public class PersonagemDedcorator implements Personagem {
    protected Personagem personagemDecorado;

    public PersonagemDedcorator(Personagem personagemDecorado) {
        this.personagemDecorado = personagemDecorado;
    }

    @Override
    public void habilidades() {
        personagemDecorado.habilidades();
    }
}
