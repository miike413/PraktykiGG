public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 13;
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau Hau");

    }

    @Override
    public void badzMilutki() {
        System.out.println("Jest przytulny");
    }

    @Override
    public void bawsie() {
        System.out.println("goni za swoim ogonem ");

    }
}