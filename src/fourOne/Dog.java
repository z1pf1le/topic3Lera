package fourOne;

public class Dog implements Voice{
    @Override
    public Cat voice() {
        System.out.println("bark");
        return null;
    }
}