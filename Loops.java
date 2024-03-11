public class Loops {
    //
    /*
     * 
     */
    void FirstFunction() {
        System.out.println("in first Function");
    }

    int FunctionsWithReturn() {
        return 10;
    }

    /*
     * @param a
     */
    int withParameter(int a) {
        return a;
    }

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i " + i);
        }
        Loops loops = new Loops();
        loops.FirstFunction();
        System.out.println("loops.FunctionsWithReturn() " + loops.FunctionsWithReturn());
        String a = " Hello World ";
        if (a.isEmpty()) {
            System.out.println("A is empty");
        } else if (a.trim().isEmpty()) {
            System.out.println("A is empty after trimming");

        }

        if (a.indexOf("H") == -1) {
            System.out.println("Sorry H does not exists");
        } else {
        }
        int b = 30;

        Integer i = Integer.valueOf(b); // autoboxing
        int c = i.intValue(); // unboxing

    }
}
