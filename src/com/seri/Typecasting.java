package com.seri;


import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float numero= input.nextInt(); //il numero preso come intero si converte in float
        System.out.println("ecco il numero: "+ numero);

        //type casting
        int n2= (int)1234.67F;
        System.out.println("type cast: "+n2);

        //automatic cast in expression
        int a = 257;
        byte b = (byte)a; // 257 % 256 = 1
        System.out.printf("ecco il byte: "+ b);

        //automatic promote
        byte q = 40;
        byte w = 50;
        byte e = 100;
        int r = q * w / e;
        System.out.println("ecco moltiplicazione😏: "+ r);
    }
}
