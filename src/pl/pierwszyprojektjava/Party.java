package pl.pierwszyprojektjava;

import java.util.*;

public class Party {

    private final List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();
    private Map<String, Guest> mealToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


    public void addGuest() {
        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Podaj żarło");
        String meal = scanner.nextLine();

        System.out.println("Podaj tel");
        int phone = Integer.parseInt(scanner.nextLine());

        System.out.println("Vegan? (y/n)");
        String czyVegan = scanner.nextLine();

        boolean isVegan = czyVegan.equals("y");


        Guest guest = new Guest(name, meal, phone, isVegan);

        meals.add(meal);
        phoneToGuest.put(phone, guest);
        mealToGuest.put(meal,guest);
        guests.add(guest);
    }

public void displayGuestByMeal(){
    System.out.println("Jakie jedzenie?");
    String whatMeal = scanner.nextLine();
    Guest guest = mealToGuest.get(whatMeal);
    guest.displayGueastinformation();
}

    public void displayMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }

    public void displayPhonebyGuestNumber(){
        System.out.println("Podaj numer tel gościa");
        Integer phoneNumber = Integer.parseInt(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);
        guest.displayGueastinformation();
    }

    public void displayGuests() {
        for (Guest guest : guests)
            guest.displayGueastinformation();
    }


}
