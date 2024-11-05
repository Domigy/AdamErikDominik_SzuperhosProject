package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {

        if (szuperhos instanceof Bosszuallo) {
            return ((Bosszuallo) szuperhos).vanEGyengesege && szuperhos.mekkoraAzEreje() < this.szuperero;
        }

        if (szuperhos instanceof Batman) {
            return this.szuperero >= szuperhos.mekkoraAzEreje() * 2;
        }

        return false;
    }


    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0}; {1} gyengesége", this.szuperero,this.vanEGyengesege?"van":"nincs");
    }
}
