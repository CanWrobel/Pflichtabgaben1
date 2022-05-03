public class TeilbarDurchSiebzehn {
    public static void main (String[]args){
        int h;
        h = 1037;
        System.out.println("Eingabezahl: " + h);
        int z4;
        z4 = h / 1000;
        // z4 ist die vierte Stelle
        System.out.println(z4 + " ist die Vierte Stelle");
        int viertepurge;
        viertepurge = h - (z4 * 1000);
        int z3 = viertepurge / 100;
        // z3 ist die dritte Stelle
        System.out.println(z3 + " ist die z3 Stelle");
        int drittepurge;
        drittepurge = viertepurge - (z3 * 100);
        int z2;
        // z2 ist die z2 Stelle
        z2 = drittepurge / 10;
        System.out.println(z2 + " ist die z2 Stelle");
        int z1;
        z1 = drittepurge - (z2 * 10);
        System.out.println(z1 + " ist die erste Stelle ");
        //z1 ist die erste Stelle

        System.out.println(h + " ist die Zahl vierstellig");
        System.out.println(viertepurge + " ist die Zahl dreistellig");
        System.out.println(drittepurge + " ist die Zahl zweistellig");
        System.out.println(z1 + " ist die Zahl einstellig");
        //multipliziere die letzte Ziffer der Zahl mit 5, subtrahiere die naechste Ziffer
        int z1x5mz2;
        z1x5mz2 = z1 * 5 - z2;
        System.out.println(z1x5mz2);
        // das ergebnis selbst mal 5 minus die naechste Zahl
        int z1z2x5mz3;
        z1z2x5mz3 = z1x5mz2 * 5 - z3;
        System.out.println(z1z2x5mz3);
        //das Ergebnis davon nochmal mal 5 minus die nächste Ziffer
        int n3x5mz4;
        n3x5mz4 = z1z2x5mz3 * 5 - z4;
        System.out.println(n3x5mz4);


    }
}
