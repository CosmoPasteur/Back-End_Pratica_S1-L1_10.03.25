package it.epicode;

import java.util.Arrays;

public class Esercizio_n1 {
    //1 metodo 'prodotto': Accetta due interi e ritorna il loro prodotto

    public static int prodotto(int a, int b) {
        return a * b;
    }

    //2 metodo "concatena" : accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
    public static String concatena(String a, int b) {
        return a + b;
    }

    //3 metodo "inserisciInArray" : accetta un array di stringhe di cinque elementi ed una stringa che restituisca un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta posizione
        public static String[] inserisciInArray(String[] a, String b) {
            String[] arr = new String[6];
            arr[0] = b;
            arr[1] = a[0];
            arr[2] = a[1];
            arr[3] = a[2];
            arr[4] = a[3];
            arr[5] = a[4];
            return arr;
        }

        //scrivere un main che invochi in sequenza i tre metodi
        public static void main(String[] args) {
            System.out.println(prodotto(2, 3));
            System.out.println(concatena("ciao", 3));
            System.out.println(Arrays.toString(inserisciInArray(new String[]{"a", "b", "c", "d", "e"}, "f")));
        }
    }
