package org.campus02.bestellverwaltung;

public class Bestellzeile
{
    private String name;
    private int menge;
    private int preis;

    public Bestellzeile(String name, int menge, int preis)
    {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    public String getName()
    {
        return name;
    }

    public int getMenge()
    {
        return menge;
    }

    public int getPreis()
    {
        return preis;
    }

    public double getKosten()
    {
        return menge*preis;
    }

    @Override
    public String toString()
    {
        return "name:" + name + ", menge:" + menge + ", preis:" + preis;
    }
}
