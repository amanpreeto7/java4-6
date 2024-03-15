package inheritance;

public class ChildClass extends ParentClass {
    public int classVariable;

    ChildClass() {
        System.out.println("in child Class constructor");
    }

    ChildClass(int a) {
        System.out.println("in child class parameterized constructor " + a);
        System.out.println("in child class Variable " + classVariable);

    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.a = 10;
        childClass.b = 20;
        childClass.c = 30;
    }
}
