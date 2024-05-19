package org.johnwick182.decorator.example2;

public class MarioSuper {
    public static void main(String[] args) {
        Personagem mario = new Mario();
        mario.habilidades();
        mario = new CogumeloDecorator(mario);
        mario.habilidades();
    }
}
