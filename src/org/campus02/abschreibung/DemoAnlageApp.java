package org.campus02.abschreibung;

public class DemoAnlageApp
{
    public static void main(String[] args)
    {
        Anlage anlage = new Anlage("Hochofen", 10000.00, 20);
        anlage.simulate(12,4500);

        System.out.println(anlage.renew(20000,15).toString());
        System.out.println();
    }
}
