package com.company;

public class Main
{
    public static void main(String[] args)
    {

        int x = 9;
        int pierwsza = 0;
        int druga = 1;
        int Fibonacci;

        for(int i = 1; i <= x; i++)
        {
            Fibonacci = pierwsza + druga;
            System.out.print(Fibonacci + "\t");
            pierwsza = druga;
            druga = Fibonacci;

        }
    }
}