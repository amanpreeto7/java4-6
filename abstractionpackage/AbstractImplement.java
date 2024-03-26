package abstractionpackage;

class AbstractImplement extends AbstractClass {
    @Override
    void fuelType() {
        System.out.println("in abstract method");
    }

    void newFunction() {
        super.newFunction();
        System.out.println("in new function child");
    }

    /*
     * void newFinalFunction() { //this will give error as newFinalFunction is final
     * in parent class
     * System.out.println("In new function");
     * }
     */

    public static void main(String[] args) {
        AbstractImplement abstractImplement = new AbstractImplement();
        abstractImplement.fuelType();
        abstractImplement.newFunction();
    }

}