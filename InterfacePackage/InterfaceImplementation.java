package InterfacePackage;

public class InterfaceImplementation extends AbstractInterface implements Interface, NewInterface {
    @Override
    public void FirstMethod() {

    }

    void newCheckMethod() {
        int a = 10;
    }

    public static void main(String[] args) {
        InterfaceImplementation interfaceImplementation = new InterfaceImplementation();
        interfaceImplementation.FirstMethod();
        System.out.println("interfaceImplementation.a " + interfaceImplementation.a);

        // interfaceImplementation.a =10; //will give error as variables of interface
        // are final by nature
        int a = 20;
        System.out.println("value of a " + a);
    }

    @Override
    void AbstractMethod() {
        throw new UnsupportedOperationException("Unimplemented method 'AbstractMethod'");
    }

    @Override
    public void NewInterfaceMethod() {
        throw new UnsupportedOperationException("Unimplemented method 'NewInterfaceMethod'");
    }
}
