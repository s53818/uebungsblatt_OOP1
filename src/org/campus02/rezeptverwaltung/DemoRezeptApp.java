package org.campus02.rezeptverwaltung;

public class DemoRezeptApp
{
    public static void main(String[] args)
    {
        Zutat zutat1 = new Zutat("Mehl", 100);
        Zutat zutat2 = new Zutat("Hefe",5);
        Zutat zutat3 = new Zutat("Wasser", 1);

        Zutat[] zutaten = {zutat1, zutat2, zutat3};
        Rezept rezept = new Rezept("Pizza", 3, zutaten);

        rezept.print();
        System.out.println();
        rezept.umrechnen(6).print();
    }
}
