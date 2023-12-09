package fourThree;

// Реализация интерфейса Magic в классе MagicImpl
public class MagicImpl implements Magic {
    private int number;

    @Override
    public void setNumber(int x) {
        this.number = x;
    }

    @Override
    public void doMagic() {
        int reversedNumber = 0;
        int originalNumber = this.number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
//            reversedNumber = reversedNumber  10 + digit;
            originalNumber /= 10;
        }
        this.number = reversedNumber;
    }

    @Override
    public int getNumber() {
        return this.number;
    }
}
