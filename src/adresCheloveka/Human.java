package adresCheloveka;

public class Human{
    String firstName;
    String secondName;
    int birthDate;
    Adress adress;

    public Human(String firstName, String secondName, int birthDate, Adress adress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public Adress getAdress(){
        return adress;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}

