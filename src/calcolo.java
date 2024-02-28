/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author samue
 */
public class calcolo {
    calcolo(){}
    
    public String Subnet(int n){ 
    System.out.println("ci sono : " + n + "uni e "+(32-n)+"zeri ");
    String uni= "";
    String zeri= "";
    for(int i=0; i<n; i++){
         uni += "1";
    }
    for(int i=0; i<(32-n);i++){
         zeri += "0";   
    }
        String ip = uni + zeri;
        String ip1= ip.substring(0,8);
        String ip2= ip.substring(8,16);
        String ip3= ip.substring(16,24);
        String ip4= ip.substring(24,32);
    // divido la stringa da 32 cifre in 4 gruppi da 8 stringhe
     // Converti gli indirizzi IP binari in formato decimale
        int sub1 = BinarioToDecimale.binarioToDecimale(ip1);
        int sub2 = BinarioToDecimale.binarioToDecimale(ip2);
        int sub3 = BinarioToDecimale.binarioToDecimale(ip3);
        int sub4 = BinarioToDecimale.binarioToDecimale(ip4);
    //unisco tutto e lo trasformo nella stringa risultato
    String subnetmask = sub1 + "." + sub2 + "." + sub3 + "." + sub4;
    return subnetmask;
    }
    
   public class BinarioToDecimale {
    public static int binarioToDecimale(String stringaBinaria) {
        int decimale = 0;
        int lunghezza = stringaBinaria.length();
        for (int i = 0; i < lunghezza; i++) {
            int cifra = Character.getNumericValue(stringaBinaria.charAt(i));
            decimale += cifra * Math.pow(2, lunghezza - 1 - i);
        }
        return decimale;
   //trovo un metodo online per convertire i miei 4 gruppi in decimale e trovare la subnet 
    }}

public int numerohost(int n){
    int zeri = 32-n;
    double nhost = Math.pow(2, zeri)-2;
    return (int) nhost;    
}
//funzione per calcolare il numero di sottoreti possibili in base ad una slash 24
public int numerosottoreti(int slash){ 
    if(slash<24){
        return 0;
    }
    else {
        
        double nsottoreti = Math.pow(2,slash-25 ); 
        return (int) nsottoreti;
}
}}
    

