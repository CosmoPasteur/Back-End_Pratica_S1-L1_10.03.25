package it.epicode;

import java.util.Scanner;

public class Esercizio_n2 {
    //implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera e scrive in console la concatenzazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa(Nome): ");
        String string1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa(Cognome): ");
        String string2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa(età): ");
        String string3 = scanner.nextLine();
        System.out.println("Concatenazione in ordine di inserimento: " + string1 + " " + string2 + " " + string3);
        System.out.println("Concatenazione in ordine di inserimento inverso: " + string3 + " " + string2 + " " + string1);
    }

}
