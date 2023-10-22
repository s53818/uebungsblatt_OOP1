package org.campus02.bestellverwaltung;

public class DemoBestellungApp
{
    public static void main(String[] args)
    {
        Bestellzeile bs1 = new Bestellzeile("Kaffee", 3, 2);
        Bestellzeile bs2 = new Bestellzeile("Kuchen",3, 4);
        Bestellzeile bs3 = new Bestellzeile("Wasser",2, 1);

        Bestellzeile[] bestellzeilen = {bs1, bs2, bs3};

        Bestellung b = new Bestellung("AB1083", bestellzeilen);

        b.printBestellung();
        System.out.println("Gesamtkosten: " + b.getKosten());
    }
}
