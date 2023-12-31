import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];
    static String[] szinek = {"P", "T", "Z", "M"};
    static String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};


    public static void main(String[] args) {
        feltolt();
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
            case 1:
                for (int i = 1; i < 8; i++) {
                    cserePakli[i] = pakli[20 - (i - 1) * 3];
                    cserePakli[i + 7] = pakli[19- (i - 1) * 3];
                    cserePakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i < 8; i++) {
                    cserePakli[i] = pakli[19 - (i - 1) * 3];
                    cserePakli[i + 7] = pakli[20 - (i - 1) * 3];
                    cserePakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i < 8 ; i++) {
                    cserePakli[i] = pakli[19 - (i - 1) * 3];
                    cserePakli[i + 7] = pakli[21 - (i - 1) * 3];
                    cserePakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }

        pakli = cserePakli;

    }
    public static void ezVolt(){

        System.out.println("A gondolt lap: " + pakli[11]);

    }


}