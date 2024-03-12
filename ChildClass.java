public class ChildClass extends BaseClass {

    public static void main(String args[]) {
        ChildClass childClass = new ChildClass();
        System.out.println("Parent Class a " + childClass.a);
        System.out.println("Parent Class b " + childClass.b);
        // System.out.println("Parent Class b " + childClass.privateVariable);
        System.out.println("Parent Class protected Variable " + childClass.protectedVariable);
    }

}
