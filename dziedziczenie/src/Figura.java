public class Figura
{
    // Zdefiniujmy kilka pól
    // Co może się znaleźć w takiej klasie Pojazd?
    // Jakaś nazwa, można tam wpisać: Samochód, Traktor itp.
    private String nazwa;
    // Pojazd musi jeździć, więc musi posiadać koła, ale ile?
    private int boka;
    // Stwórzmy konstruktory do inicjalizacji naszych zmiennych przy tworzeniu obiektu.
    public Figura(String nazwa, int boka)
    {
        this.nazwa = nazwa;
        this.boka = boka;
    }
    public void wlaczSilnik()
    {
        System.out.println("Właczam silnik");
    }
    public void wylaczSilnik()
    {
        System.out.println("Wyłączony");
    }
    public String getNazwa()
    {
        return nazwa;
    }
    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }
    public int getboka()
    {
        return boka;
    }
    public void getboka(int boka)
    {
        this.boka =boka;
    }
}