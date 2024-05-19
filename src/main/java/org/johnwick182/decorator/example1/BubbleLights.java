package org.johnwick182.decorator.example1;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    public String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
