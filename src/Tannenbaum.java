/* Schreibe eine Funktion, die einen Tannenbaum mit ASCII-Art „gezeichnet“ als Text zurückliefert.
Eingabe ist die Höhe des Tannenbaums. Als Beispiel ein Tannenbaum der Höhe 5:

    Tannenbaum.Zeichnen(5)

            X
           XXX
          XXXXX
         XXXXXXX
        XXXXXXXXX
            I

             Tannenbaum t = new Tannenbaum();
        t.zeichnen(5);
public void zeichnen(int hoehe) {
        for (int i = 0; i< hoehe; i++) {
            System.out.println();
            for (int j=1; j <= hoehe; j++ ) {
                    System.out.print("X");
                }

            }
        }

        System.out.print(abs(len/2, i) < ((j <= len/2+1) ? j : len-j+1) ? j : " ");
*/

public class Tannenbaum {

    public static void main(String[] args) {

            zeichnen(5);
            System.out.println();
    }

    public static int abs(int a, int b) {
        return a - b < 0 ? b - a : a - b;
    }

    public static void zeichnen(int hoehe){
        int len = hoehe * 2 - 1;
        for(int j = 1; j <= hoehe; j++) {
            for (int i = 0; i < len; i++)
                if(abs(len/2, i) < j)
                    System.out.print("X");
            else if(abs(len/2, i) >= j) {
                System.out.print(" ");
                }

            System.out.println();
        }
    }



    }

