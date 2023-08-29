import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.printf("inserire primo numero: ");
        a= input.nextInt();
        System.out.printf("inserisci il secondo numero: ");
        b= input.nextInt();
        System.out.printf("inserire secondo numero: ");
        c = input.nextInt();

        int max= a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.printf("il numero più grande è: "+ max);
    }
}
