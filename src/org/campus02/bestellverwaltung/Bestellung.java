package org.campus02.bestellverwaltung;

public class Bestellung
{
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen)
    {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer()
    {
        return nummer;
    }

    public Bestellzeile[] getZeilen()
    {
        return zeilen;
    }

    public void printBestellung()
    {
        System.out.println("Bestellung: " + nummer);
        System.out.println("Bestellzeile: ");
        for (int i = 0; i < zeilen.length; i++)
        {
            //System.out.print(zeilen[i].toString());
            System.out.println("Name: " + zeilen[i].getName() + ", Menge: " + zeilen[i].getMenge() + ", Preis: " + zeilen[i].getPreis());
        }
    }

    public double getKosten()
    {
        double sum = 0;
        for (int i = 0; i < zeilen.length; i++)
        {
            sum = sum + zeilen[i].getKosten();
        }
        return sum;
    }
}
