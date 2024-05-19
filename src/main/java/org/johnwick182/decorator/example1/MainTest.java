package org.johnwick182.decorator.example1;

public class MainTest {
    public static void main(String[] args) {
        ChristmasTree tree2 = new BubbleLights(new ChristmasTreeImpl());
        String message = tree2.decorate();
        System.out.println(message);
    }
}
