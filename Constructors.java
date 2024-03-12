public class Constructors {
    Constructors() {
        System.out.println("In default Constructor");
    }

    Constructors(int a) {
        System.out.println("in parameterized constructor " + a);
    }

    public static void main(String args[]) {
        Constructors constructors = new Constructors();
        Constructors constructors2 = new Constructors(2);
    }
}
