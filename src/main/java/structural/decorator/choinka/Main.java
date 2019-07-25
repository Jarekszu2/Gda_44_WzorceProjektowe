package structural.decorator.choinka;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        SimpleChristmasTree simpleChristmasTree = new SimpleChristmasTree(12);
        simpleChristmasTree.printTree(simpleChristmasTree.buildStringTree());


        System.out.println();
        DecoratedChristmasTree decoratedChristmasTree = new DecoratedChristmasTree(simpleChristmasTree, 20);
        decoratedChristmasTree.printTree(decoratedChristmasTree.buildStringTree());

    }
}
