import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int firstCounter = 1; firstCounter <= 10; firstCounter++) {
            System.out.println(" ");
            for (int secondCounter = 1; secondCounter <= 10; secondCounter++) {
                System.out.println(firstCounter+ " * " +secondCounter+" = "+firstCounter*secondCounter);
            }
        }
      /*  int d = sc.nextInt();
        if (d == 1) {
            hello();
        } else if (d==0) {
            bye();
        } else {
            System.out.println("такого значения нету");
        }

    }

    public static void hello() {
        System.out.println("Salam");
    }

    public static void bye() {
        System.out.println("Bye");*/
    }
}
