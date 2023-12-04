package adresCheloveka;

public class Adress{
    int home;
    String city;
    String street;
    int flat;

    public Adress(int home, String city, String street, int flat) {
        this.home = home;
        this.city = city;
        this.street = street;
        this.flat = flat;
    }

    public int getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getFlat() {
        return flat;
    }
}
