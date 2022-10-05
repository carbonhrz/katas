public class Coins {

    static int twoEuro = 0;
    static int oneEuro = 0;
    static int fiftycent = 0;
    static int twentycent = 0;
    static int tencent = 0;
    static int fivecent = 0;
    static int twocent = 0;
    static int onecent = 0;
 
    public static void main (String[] args) {
        System.out.println("Wie viel Geld hast du?");
        double coins = new java.util.Scanner( System.in ).nextDouble(); 
        double coins_in_cent = coins * 100;
        while (coins_in_cent != 0) {
            if (coins_in_cent >= 200) {
                coins_in_cent -= 200;
                twoEuro++;
            }
            if (coins_in_cent < 200 && coins_in_cent >= 100) {
                coins_in_cent -= 100;
                oneEuro++;
            }
            if (coins_in_cent < 100 && coins_in_cent >= 50) {
                coins_in_cent -= 50;
                fiftycent++;
            } 
            if (coins_in_cent < 50 && coins_in_cent >= 20) {
                coins_in_cent -= 20;
                twentycent++;
            } 
            if (coins_in_cent < 20 && coins_in_cent >= 10) {
                coins_in_cent -= 10;
                tencent++;
            } 
            if (coins_in_cent < 10 && coins_in_cent >= 5) {
                coins_in_cent -= 5;
                fivecent++;
            } 
            if (coins_in_cent < 5 && coins_in_cent >= 2) {
                coins_in_cent -= 2;
                twocent++;
            } 
            if (coins_in_cent < 2 && coins_in_cent >= 1) {
                coins_in_cent -= 1;
                onecent++;
            } 
        }
        System.out.println("Du hast " + coins + " Euro");
        System.out.println("Das sind:");
        System.out.println(twoEuro +" x " + "2€");
        System.out.println(oneEuro +" x " + "1€");
        System.out.println(fiftycent +" x " + "50 Cent");
        System.out.println(twentycent +" x " + "20 Cent");
        System.out.println(tencent +" x " + "10 Cent");
        System.out.println(fivecent +" x " + "5 Cent");
        System.out.println(twocent +" x " + "2 Cent");
        System.out.println(onecent +" x " + "1 Cent");

    }
    
}
