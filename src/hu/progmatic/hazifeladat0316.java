package hu.progmatic;

import java.util.Arrays;
import java.util.Scanner;

public class hazifeladat0316 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Gyakorló 1* 1. feladat

        /*int x = 10;
        int y = 0;

        if (y == 0){
            System.out.println("Nullával nem osztunk");
        }else{
            System.out.println(x/y);
        }*/

        /*//Gyakorló 1 2. feladat

        int x = -1;
        if (x <= 0){
            System.out.println(x);
        }else{
            System.out.println(x-1);
        }*/

        /*//Gyakorló 1 3. feladat

        int x = 5;

        if(x == 0){
            System.out.println("nulla");
        }else if(x > 0){
            System.out.println("pozitív");
        }else{
            System.out.println("negatív");
        }*/

        //Gyakorló 1 4. feladat

        /*String light = "SÁRGA";

        if (light.equalsIgnoreCase("zöld")){
            System.out.println("SZABAD");
        }else if (light.equalsIgnoreCase("sárga")){
            System.out.println("LASSÍTS");
        }else if (light.equalsIgnoreCase("piros")){
            System.out.println("MEGÁLLJ");
        }else{
            System.out.println("NEM TUDOM");
        }*/

        //Gyakorló 1 5. feladat

        /*System.out.println("Adj meg egy hónapot!");
        String nap = scanner.nextLine();

        String[] tel = {"December","Január", "Február"};
        String[] tavasz = { "Március","Áprisi","Május"};
        String[] nyar = {"Június","Július","Augusztus"};
        String[] ősz = {"Október","Szeptember","November"};


        for (int i = 0; i<3 ;i++){
           if (nap.equalsIgnoreCase(tel[i])){
               System.out.println("Tél");
           }else if (nap.equalsIgnoreCase(tavasz[i])){
               System.out.println("Tavasz");
           }else if (nap.equalsIgnoreCase(nyar[i])){
               System.out.println("Nyár");
           }else if (nap.equalsIgnoreCase(ősz[i])){
               System.out.println("Ősz");
           }
        }*/

        // Gyakorló 1. 6. feladat

        /*int x = 10;
        while (x >=0){
            System.out.print(x + ",");
            x--;
        }*/

        /*// Gyakorló 1. 7. feladat
        int fakt = 1;
        int number=3;//Ellenörző szám
        for(int i=1;i<=number;i++){
            fakt=fakt*i;
        }
        System.out.println("A(z) "+number+" faktoriálisa: "+fakt);

        // Gyakorló 1 8. feledat.
        char[]chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int num = 26;
        for (int i = 0; i <num ; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        //Gyakorló 1 9. feladat
        int[] ints = {1 , 2 , 3 , 4 , 5 , 6, 7 , 8 , 9 , 10};
        System.out.println(Arrays.toString(ints));*/



        /*// Gyakorló 2 1. feladat

        int hp1 = 100, ap1 = 10;
        int hp2 = 80, ap2 = 50;
        int kor = 1;
        boolean elso = true;

        while (hp1 > 0 && hp2 > 0 ){
            hp1 -= ap2;
            hp2 -= ap1;
            System.out.println("Az " + kor+". kör: első medve életpontja "+ hp1 +" -re, másodiké "+ hp2 +" -re csökken");
            kor++;
        }
        if (hp1 == hp2){
            System.out.println("Döntetlen");
        }else if (hp1 > hp2){
            System.out.println("győztes = első medve");
        }else{
            System.out.println("győztes = második medve");
        }*/
        // Gyakorló 2 2.feladat

        /*
        System.out.println("Hi!");
        System.out.println("Adj meg egy évet!");
        //n > 1582 ; n % 4 == 0 ; n % 100 == 0 && n % 400 == 0;
        int ev = scanner.nextInt();
        scanner.nextLine();
        /*boolean szokoev = ev > 1582 && ev % 4 == 0;
        if (szokoev && ev % 100 !=0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else if (ev % 100 == 0 && ev % 400 == 0){
            System.out.println("Az általad megadott év: " + ev + " szökőév.");
        }else{
            System.out.println("Az általad megadott év: " + ev + " nem szökőév.");
        }
        boolean isLeapYear = (ev >= 1582 && (ev % 4 == 0 && ev % 100 != 0 || ev % 400 ==0));*/

        //Gyakorló 2 3.feladat

        /*
        System.out.println("Add meg az ellenőrző számot:");
        int ellenorzo = scanner.nextInt();
        scanner.nextLine();
        boolean pozitiv = ellenorzo > 0;
        int i;
        int n =0;
        int[] osztok = new int[30];
        for(i = 1; i <= ellenorzo; i++){
            if(ellenorzo % i ==0){
                osztok[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(osztok));*/



        /*// Gyakorlo 2 4.feladat
        char ideiglenes = 'x';
        char[] chars = {'A','B','C'};
        if (chars.length != 0){
            ideiglenes = chars[0];
            chars[0] = chars[chars.length-1];
            chars[chars.length-1]=ideiglenes;
        }else {
            System.out.println("Üres tömb");
        }
        System.out.println(chars);*/

        //Gyakorlo 2 5. feladat

        /*int[] ints = { 2 , 1 , 3};
        int container;
         if (ints.length>1 && ints[0]>ints[1]){
            container = ints[0];
            ints[0] = ints[1];
            ints[1]=container;
            System.out.println("A csere megtörtént");
            System.out.println(Arrays.toString(ints));
        }else{
            System.out.println("Semmi nem történt");
            System.out.println(Arrays.toString(ints));
        }*/

        //Gyakorlo 2 6. feladat
        /*int[] numbers = { 1,2,3,4,5};
        int newelement=10;
        int[] newtomb = new int[numbers.length+1];

        for (int i = 0; i< numbers.length; i++){
            newtomb[i]=numbers[i];
        }
        newtomb[numbers.length]=newelement;
        System.out.println(Arrays.toString(newtomb));
        numbers = newtomb;
        System.out.println(Arrays.toString(numbers));*/

        //Gyakorlo 2 7. feladat

        /*
        /*int x = 3;
        int y = 0;

        for (int i = 1; i <= x ; i++){
            if(x % i ==0){
                y++;
            }
        }
        if (y == 2){
            System.out.println("Prím szám");
        }else{
            System.out.println("Nem prím szám");

         */

        //Gyakorló 2 8. feladat

        /*int x = 12;
        int y= 48;
        int z = 0;

        for (int i = 1; i <= x; i++){
                if (x % i == 0 && y % i ==0){
                    z = i;
            }
        }
        System.out.println("A legnagyobb közös osztó: "+ z);
     */

        //Gyakorló 3* 1. feladat

/*        int number = -5483229;
        int sum = 0;

        do {
            sum += number % 10;
            number /=10;
        } while(number != 0);

        System.out.println(sum);*/

        //Gyakorló 3* 2. feladat

        /*int base = 5, exponent = 3;
        int result = base;
        for (int i = 1; i < exponent ; i++){
            result *= base;
        }
        System.out.println(base);*/

        //Gyakorló 3* 3. feladat

        /*int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int minimum = numbers[0];
        for (int i = 0;i < numbers.length-1; i++){
            if (numbers[i]<minimum){
                minimum=numbers[i];
            }
        }
        System.out.println(minimum);*/

        //Gyakorló 3* 4. feladat

        /*int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int maximum = numbers[0];
        for (int i = 0;i < numbers.length-1; i++){
            if (numbers[i]>maximum){
                maximum=numbers[i];
            }
        }
        System.out.println(maximum);*/

        //Gyakorló 3* 5. feladat

        /*int[] numbers = {-2, 1, -6, 10};
        String[] szamok = new String[numbers.length];
        for (int i = 0; i < numbers.length;i++){
            szamok[i] = Integer.toString(numbers[i]);
        }
        System.out.println(Arrays.toString(szamok));*/

        //Gyakorló 3* 6. feladat.

        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};
        int tukor = 0;
        for (int i = 1; i <=numbers.length;i++){
            if (numbers[i-1] == numbers[numbers.length-i]){
                tukor++;
            }
        }
        if (tukor == numbers.length){
            System.out.println("Tükörtömb");
        }else{
            System.out.println("Nem tükör");
        }
    }

}
