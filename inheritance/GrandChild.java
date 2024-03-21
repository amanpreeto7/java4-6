package inheritance;

public class GrandChild extends ChildClass {
    public int classVariable;

    GrandChild() {
        System.out.println("In grand child constructor");
    }

    GrandChild(int a) {
        super(a); // super keyword 1. to call the constructor of immediate parent class
        System.out.println("in grand child " + a);
        classVariable = a + 1000;
        super.classVariable = classVariable;
        System.out.println("in grand child class Variable " + classVariable);
    }

    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.a = 10;
        grandChild.b = 10;
        grandChild.c = 10;

        GrandChild grandChild2 = new GrandChild(123);
    }
}
