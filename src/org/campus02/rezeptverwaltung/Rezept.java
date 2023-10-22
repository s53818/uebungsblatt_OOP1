package org.campus02.rezeptverwaltung;

import java.util.Arrays;

public class Rezept
{
    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten)
    {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName()
    {
        return name;
    }

    public int getPersonen()
    {
        return personen;
    }

    public Zutat[] getZutaten()
    {
        return zutaten;
    }

    public void print()
    {
        System.out.println("Rezept: " + name);
        System.out.println("Personen: "+ personen);
        System.out.println("Zutat: ");
        for (int i = 0; i < zutaten.length; i++)
        {
            System.out.print(zutaten[i] + " ");
        }
    }

    public Rezept umrechnen(int personen)
    {
        double menge=0;
        String name="";
        Zutat[] newZutaten = new Zutat[zutaten.length];
        for (int i = 0; i < zutaten.length; i++)
        {
            menge = (double) zutaten[i].getMenge() / this.personen;
            name = zutaten[i].getName();
            menge = menge*personen;
            Zutat z = new Zutat(name, (int) menge);
            newZutaten[i] = z;
        }
        return new Rezept(this.name,personen,newZutaten);
    }
}
