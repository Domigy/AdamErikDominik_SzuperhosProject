package hu.petrik.szuperhosprojekt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<>();
    public static void szereplok(String fajl) {
        try (BufferedReader br = new BufferedReader(new FileReader(fajl))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] sor = line.split(" ");
                if ("Batman".equals(sor[0])) {
                    Batman batman = new Batman();
                    for (int i = 0; i < Integer.parseInt(sor[1]); i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                } else if ("Vasember".equals(sor[0])) {
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < Integer.parseInt(sor[1]); i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void szuperhosok() {
        for (int i = 0; i < szuperhosLista.size(); i++) {
            System.out.println(szuperhosLista.get(i).toString());
        }
    }
}
