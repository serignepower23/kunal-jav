import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;


        //metodo 1
        System.out.print("inserire primo numero: ");
        a= input.nextInt();
        System.out.print("inserisci il secondo numero: ");
        b= input.nextInt();
        System.out.printf("inserire secondo numero: ");
        c = input.nextInt();

        /*int max= a;

        if(b > max){
            max=b;
        }
        if(c>max){
            max=c;
        }*/

        int max = 0;

        if(a>b){
            max =a;
        }else{
            max=b;
        }

        if (c>max){
            max=c;
        }



        System.out.println("il numero più grande è: "+ max);

        //secondo metodo
        int massimo = Math.max(c,Math.max(a, b));
        System.out.print("il numero più grande, secondo metodo: "+ massimo);
    }
}
