package pl.pierwszyprojektjava;

public class Guest {

    private String name;
    private String meal;
    private int phone;
    private boolean isVegan;


    public Guest(String name, String meal, int phone, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phone = phone;
        this.isVegan = isVegan;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getMeal() {
//        return meal;
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public boolean isVegan() {
//        return isVegan;
//    }

    public void displayGueastinformation () {
        System.out.println("Imię : " + name);
        System.out.println("Co je : " + meal);
        System.out.println("Tel : " + phone);
        String isVeganString = isVegan ? "Tak" : "Nie";
        System.out.println("Vegan : " + isVeganString);
        System.out.println();
    }




}
