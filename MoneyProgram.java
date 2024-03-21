import java.util.Scanner;

public class MoneyProgram {
    public static void main(String args[]) {
        int currencyNotesCount = 4;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number of available currency notes");
        // currencyNotesCount = scanner.nextInt();
        // int[] currency = new int[currencyNotesCount];

        // for (int i = 0; i < currencyNotesCount; i++) {
        // System.out.println("Enter the currency amount");
        // currency[i] = scanner.nextInt();
        // }
        int[] currency = { 20, 2, 50, 10 };
        for (int i = 0; i < currencyNotesCount; i++) {
            for (int j = 0; j < currencyNotesCount; j++) {
                System.out.println("currency[i] > currency[j] " + currency[i] + " " + currency[j]);
                if (currency[i] > currency[j]) {
                    int temp = currency[i];
                    currency[i] = currency[j];
                    currency[j] = temp;
                    System.out.println("currencyi " + currency[i] + " currency j" + currency[j] + " temp " + temp);
                }
            }

        }

        for (int items : currency) {
            System.out.println(items);
        }

        int amountToGive = 1246;
        for (int i = 0; i < currencyNotesCount; i++) {
            int notes = 0;
            if (amountToGive > currency[i]) {
                notes = amountToGive / currency[i];
                amountToGive = amountToGive % currency[i];

            }
            System.out.println("Notes of " + currency[i] + " = " + notes);
        }

    }
}
