package tp3V2;

import java.util.Scanner;

public class Tab {
    static final int NMAX = 40;
    public static void remplir(float t[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.println("donne une valeur");
            t[i] = scan.nextFloat();
        }
    }

    public static float somme_element(float t[]) {
        float somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return somme;
    }


    public static float[] additionner(float t1[], float t2[]) {
        float[] resultat = new float[t2.length];
        for (int i = 0; i <t2.length; i++) {
            resultat[i] = t1[i] + t2[i];
        }
        return resultat;
    }
    public static float[] produit (float x, float t[]){
        for (int i = 0; i < t.length; i++) {
            t[i]*=x;
        }
        return t;
    }
    public static float[] lister (float t[]){
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);}
        return t;
    }
    public static float[] additionner(float x, float t2[]) {
        for (int i = 0; i <t2.length; i++) {
            t2[i]+=x;
        }
        return t2;
    }

}
