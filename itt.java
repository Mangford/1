import java.util.Scanner;

public class itt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("interp start");
        int start = sc.nextInt();
        System.out.println("interp end");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i < end; i++) {

          if (i % 3 == 0 && i % 5 == 0) {count++;

          }
        }
        System.out.println(count);
     
    }
}
