package Homework1;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("Hello", 2);
        Tree tree1 = new Tree(3, 2, "Green");
        Tree tree2 = new Tree();
        Tree tree3 = new Tree("World");
        System.out.println(tree2.getHeight());

    }
}
