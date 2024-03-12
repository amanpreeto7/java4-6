package firstpackage;

public class FirstPackageSecondClass {
    public static void name() {
        // FirstPackageSecondClass firstPackageSecondClass = new
        // FirstPackageSecondClass();
        // firstPackageSecondClass.publicVariable = 10;
        // firstPackageSecondClass.protectedVariable = 10;

        FirstPackageClass firstPackageClass = new FirstPackageClass();
        firstPackageClass.protectedVariable = 10;
        firstPackageClass.publicVariable = 20;
        // firstPackageClass.privateVariable = 30;

    }
}
