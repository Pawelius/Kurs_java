package pl.pierwszyprojektjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
boolean shouldContinue=true;

        Party party = new Party();


        while (shouldContinue) {
            System.out.println("Wybierz");
            System.out.println("1. Wyświetl Gości");
            System.out.println("2. Dodaj Gościa");
            System.out.println("3. Pokaż Żarcie");
            System.out.println("4. Wyszukaj po telefonie");
            System.out.println("5. Wyszukaj po jedzeniu");
            System.out.println("6. Wyjdź");
    int choice = scanner.nextInt();

switch (choice){
    case 1 -> party.displayGuests();
    case 2 -> party.addGuest();
    case 3 -> party.displayMeals();
    case 4 -> party.displayPhonebyGuestNumber();
    case 5 -> party.displayGuestByMeal();
    case 6 -> shouldContinue=false;

}

}








    }}
