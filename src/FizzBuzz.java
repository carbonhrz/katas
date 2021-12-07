
public class FizzBuzz {

    public static void main (String[] args) {
        FizzBuzz f = new FizzBuzz();
        f.analyze_digits(100);
}

    public void analyze_digits (int digit) {
        for (int i = 1; i <= digit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " -> FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " -> Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " -> Fizz");
            } else {
                if ((i + "").toString().contains("3")) {
                    System.out.println(i + "-> Fizz");
                } else if ((i + "").toString().contains("5")) {
                    System.out.println(i + "-> Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
    }
