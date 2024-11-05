package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;
import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        Random random= new Random();
        setSzuperero(getSzuperero()+random.nextDouble(10));
    }

    @Override
    public boolean megmentiAVilagot() {
        if(mekkoraAzEreje()>1000){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Vasember: {0}", String.valueOf(super.toString()));
    }
}
