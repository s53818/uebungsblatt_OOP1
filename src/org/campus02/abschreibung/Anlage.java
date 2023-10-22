package org.campus02.abschreibung;

public class Anlage
{
    private String bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private double restWert;
    private int alter;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer)
    {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        restWert = this.initialWert;
        alter = 0;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getInitialWert()
    {
        return initialWert;
    }

    public int getNutzungsdauer()
    {
        return nutzungsdauer;
    }

    public double getRestWert()
    {
        return restWert;
    }

    public int getAlter()
    {
        return alter;
    }

    @Override
    public String toString()
    {
        return "Anlage: Bezeichnung: " + bezeichnung + ", initialWert: " + initialWert + ", nutzungsdauer: " + nutzungsdauer +
                ", restWert: " + restWert +
                ", alter: " + alter;
    }

    public void abschreiben()
    {
        alter++;
        if (alter <= nutzungsdauer)
        {
            restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
        }
    }

    public void simulate(int maxJahre, int minWert)
    {
        //System.out.println("Restwert im " + alter + ". Jahr: " + restWert);
        for (int i = 0; i < maxJahre; i++)
        {
            System.out.println("Restwert im " + alter + ". Jahr: " + restWert);
            abschreiben();

            if (restWert < minWert )
            {
                break;
            }

            if(restWert==0 || (i+1) == maxJahre)
            {
                System.out.println("Restwert im " + alter + ". Jahr: " + restWert);
                break;
            }
        }
    }

    public Anlage renew(int zusatzWert, int zusatzJahre)
    {
        double initialWert=0;
        int nutzungsdauer=0;
        initialWert = restWert + zusatzWert;
        nutzungsdauer = (this.nutzungsdauer - alter) + zusatzJahre;
        return new Anlage(bezeichnung, initialWert, nutzungsdauer);
    }
}