import java.util.Random;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args)
    {
        int[] array = {1, 2};
        System.out.println("array[0] = " + array[0] + "\narray[1] = " + array[1]);
        System.out.println("Długość tablicy = " + array.length);


        System.out.println();
        int[] arrayInt = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Array{" + i + "} = " + arrayInt[i]);
        }

        System.out.println();

        String word = " Mam dużo psów ";
        String[] symbol;                                     //Ustalanie wielkości tablicy
        symbol = new String[word.length()];                  //Wpisywanie symboli do tablicy
        symbol = word.split(" ");
        for (int i = 0; i < symbol.length; i++) {
            System.out.println("Symbol{" + i + "} = " + symbol[i]);
        }

        System.out.println();

        // Tablica Stringów Gotowa
        String[] words = {"one", "two", "house", "flamingo", "flower"};
        for (String element : words)
        {
            if(element.length() > 3)                         // Wypisuje słowa większe niż 3 symbole
            {
                System.out.println("Word = " + element);
            }
        }

        System.out.println();

        //Tablica intów + modulo
        int[] numbers = {223,-123,356,765,345,55,-56};
        for(int value: numbers)
        {
            if(value < 0 && value % 3 == 0)              // Wypisuje liczby mniejsze od 0 i podzielne przez 3
            {
                System.out.println(value);
            }
        }

        System.out.println();
        //Przyklad 5
        System.out.println("Przyklad 5");
        {
            double[] a = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
            double min = a[0];
            double max = a[0];
            int pmin = 0;
            int pmax = 0;
            for (int i = 0; i < 9; i++) {
                if (max < a[i]) {
                    max = a[i];
                    pmax = i;
                }
                if (min > a[i]) {
                    min = a[i];
                    pmin = i;
                }
                System.out.println("element [" + i + "] = " + a[i]);
            }
            a[pmax] = min;
            a[pmin] = max;

            System.out.println();

            for (int j = 0; j < 9; j++) {
                System.out.println("element [" + j + "] = " + a[j]);
            }
        }
        //przyklad 6
        System.out.println();
        System.out.println("Przyklad 6");
        {
            double[] a = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};

            for(int i = 0; i < 9; i++ )
            {
                System.out.println("element [" + i + "]" + a[i] );
            }

            System.out.println();

            for (int j = 0; j < 9; j++)
            {
                System.out.println("element [" + j + "]" + a[8 - j] );
            }
        }
        //Przykład 7 Losowanie liczb i porównywanie ich
        System.out.println();
        System.out.println("Przyklad 7");
        Random random = new Random();
        int wylosowanaLiczba = 0;
        for(int i =0; i < 10; i++)
        {
            wylosowanaLiczba = random.nextInt(3);  // Losuje liczby od 0 do 2
            System.out.println("Wylosowano[" + i + "] = " + wylosowanaLiczba);
        }

        System.out.println();
        //Przykład 8 Tworzenie klasy postaci oraz wypisanie jej
        Scanner scanner = new Scanner(System.in);
        String[] imie = new String[4];
        String[] wiek = new String[6];
        String[] klasa = new String[6];

        System.out.println("Podaj imię: ");
        imie[0] = scanner.next();
        System.out.println("Podaj wiek: ");
        wiek[0] = scanner.next();
        System.out.println("Podaj klase: ");
        klasa[0] = scanner.next();

        System.out.println(imie[0]);
        System.out.println(wiek[0]);
        System.out.println(klasa[0]);






    }
}

