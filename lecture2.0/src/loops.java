

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.println("quanti numeri vuoi stampare: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();


      for(int i=1; i<=9; i++ ){
          System.out.println(i);
      }
    }
}
