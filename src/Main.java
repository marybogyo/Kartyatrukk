import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];
    static String[] szinek = {"P", "T", "Z", "M"};
    static String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            kever(oszlop);
        }
        ezVolt();
    }

    public static void feltolt(){
        int pakliIndex = 1;
        for (int j = 0; j < szinek.length; j++) {
            for (int k = 0;pakliIndex < 22 && k < ertekek.length; k++) {
                pakli[pakliIndex++] = szinek[j] + "_" + ertekek[k];
            }
        }
    }

    public static void kirak(){

        feltolt();

        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-9s", pakli[i] + " ");
            if (i % 3 == 0){
                System.out.println("");
            }
        }
    }
    public static int melyik(){

        System.out.println("Melyik oszlop? (1-3): ");
        int oszlop = Integer.parseInt(sc.nextLine());

        while(oszlop > 3 || oszlop < 1){
            System.out.println("Hibás adat!!! Melyik oszlop? (1-3): ");
            oszlop = Integer.parseInt(sc.nextLine());
        }

        return oszlop;

    }
    public static void kever(int oszlop){

        String[] cserePakli = new String[22];

        switch (oszlop) {
            case 1: break;
            case 2: break;
            case 3: break;
        }

        pakli = cserePakli;

    }
    public static void ezVolt(){

        System.out.println("A gondolt lap: " + pakli[11]);

    }


}