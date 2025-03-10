package it.epicode;

import java.util.Scanner;

public class Esercizio_n3 {
    //Parte 1: "perimetroRettangolo" che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
    public static double perimetroRettangolo(double base, double altezza) {
        return 2 * (base + altezza);
    }

    //Parte 2: pariDispari che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari

    public static int pariDispari(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //Parte 3: perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area
    public static double perimetroTriangolo(double late1, double late2, double late3) {
        return (late1 + late2 + late3)/2;
    }

    //scrivere un main che utilizzi i tre metodi chiedendo l'input dei dati all'utente

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo: ");
        double base = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo: ");
        double altezza = scanner.nextDouble();
        System.out.println("Il perimetro del rettangolo e': " + perimetroRettangolo(base, altezza));

    //main per il metodo pariDispari
        System.out.println("Inserisci un numero intero: ");
        int num = scanner.nextInt();
        System.out.println("Il numero inserito e': " + pariDispari(num));


    //main per il metodo perimetroTriangolo
        System.out.println("Inserisci il primo lato del triangolo: ");
        double late1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo lato del triangolo: ");
        double late2 = scanner.nextDouble();
        System.out.println("Inserisci il terzo lato del triangolo: ");
        double late3 = scanner.nextDouble();
        System.out.println("L'area del triangolo e': " + perimetroTriangolo(late1, late2, late3));
    }
}
