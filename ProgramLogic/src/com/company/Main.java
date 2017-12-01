package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        desetdva();
    }

    static void prvi() {
        // write your code here
        int grade = -1;
        Scanner input = new Scanner(System.in);

        while (grade != 0) {
            do {
                System.out.println("Koja je ocijena (1-5)");
                grade = input.nextInt();
            } while ((grade < 0) || (grade > 5));

            switch (grade) {
                case 1:
                    System.out.println("Nedovoljan");
                    break;
                case 2:
                    System.out.println("Dovoljan");
                    break;
                case 3:
                    System.out.println("Dobar");
                    break;
                case 4:
                    System.out.println("Vrlo dobar");
                    break;
                case 5:
                    System.out.println("Odlican");
                    break;
                default:
                    System.out.println("Kriva ocjena");
                    break;
            }
        }
    }

    static void drugi() {
        int a = 0;
        int b = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Unesi dva broja");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println(a < b ? a + b :
                a > b ? a - b :
                        "Brojevi su jednaki"
        );
    }

    static void treci() {
        int a = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Unesi broj");
        a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Broj je paran");
        } else {
            System.out.println("Broj je neparan");
        }
    }

    static void cetvrti() {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Unesi tri broja\n");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            System.out.printf("Najveci broj %d\n", a);
        } else if ((b > a) && (b > c)) {
            System.out.printf("Najveci broj %d\n", b);
        } else {
            System.out.printf("Najveci broj %d\n", c);
        }
    }

    static void peti() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void sesti() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void sedmi() {
        int n = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Unesi broj\n");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("Suma je %d\n", sum);
    }

    static void osmi() {
        int[] a = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Unesi %d. broj arraya\n", i + 1);
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
        System.out.printf("Suma je %d\n", sum);
    }

    static void deveti() {
        int[] a = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Unesi %d. broj arraya\n", i + 1);
            a[i] = input.nextInt();
            if (a[i]%2 != 0)
            {
                System.out.printf("Broj %d je neparan\n", a[i]);
            }
        }
    }

    static void deseti() {
        int[] a = new int[6];
        int min = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
        {
            System.out.printf("Unesi %d. broj arraya\n", i + 1);
            a[i] = input.nextInt();
            if (i == 0)
            {
                min = a[0];
            }
            if (min > a[i])
            {
                min = a[i];
            }
        }
        System.out.printf("Najmanji broj je %d\n", min);
    }

    static void desetjedan() {
        int[] a;
        Scanner input = new Scanner(System.in);

        System.out.println("Unesi velicinu niza");
        int b = input.nextInt();
        a = new int[b];

        for (int i = 0; i < b; i++) {
            System.out.printf("Unesi %d. broj arraya\n", i);
            a[i] = input.nextInt();
            if (i % 2 != 0) {
                System.out.printf("Indeks %d broj na tom indeksu %d\n", i, a[i]);
            }
        }
    }

    static void desetdva() {
        int[] a;
        Scanner input = new Scanner(System.in);

        System.out.println("Unesi velicinu niza");
        int b = input.nextInt();
        a = new int[b];

        for (int i = 0; i < b; i++) {
            System.out.printf("Unesi %d. broj\n", i + 1);
            a[i] = input.nextInt();
            if (i != 0) {
                if (((a[i] + a[i - 1]) % 2) != 0) {
                    System.out.printf("Suma a[%d] i a[%d] je %d\n", i - 1, i, a[i] + a[i - 1]);
                }
            }
        }
    }
}
