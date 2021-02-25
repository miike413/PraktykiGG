package com.company;

public class Main {
    public static void main(String[] args)
    {
        //Zadanie 1 petle

        char PierwszaLitera = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(PierwszaLitera + "\t");
            PierwszaLitera++;
        }
    }
}