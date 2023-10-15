package tp3V2;

import java.util.Scanner;

public class CalculMoyenne {
    public static void main(String[] args) {
//        **********************ex1**********************
        Scanner scan = new Scanner(System.in);
        int nb=0;
        System.out.println("donner le nombre des etudiants");
        nb=scan.nextInt();
        while (nb>Tab.NMAX ){
            System.out.println("donner le nombre des etudiants");
            nb=scan.nextInt();
        }
        float[]noteCtrl=new float[nb];
        float[]noteExam=new float[nb];
        System.out.println(" **** Remlissage de note de control ****");
        Tab.remplir(noteCtrl);
        Tab.lister(noteCtrl);
        System.out.println(" **** Remlissage de note de l'examen ****");
        Tab.remplir(noteExam);
        Tab.lister(noteExam);
        float[] notexam=Tab.produit(2,noteExam);
        float[] add=Tab.additionner(noteCtrl,notexam);
        float[] moyEtudiant=new float[nb];
        for (int i=0;i<add.length;i++){
            moyEtudiant[i]=add[i]/3;
            System.out.println("la moyenne de l'etudiant "+(i+1)+" = "+moyEtudiant[i]);
        }
        float c=Tab.somme_element(moyEtudiant);
        System.out.println("la moyenne de la classe  = "+c/nb);
        System.out.println(" **** la moyenne de la classe apres bonnus ****");
        Tab.additionner(1.5F,moyEtudiant);
        Tab.lister(moyEtudiant);
        // question4 : la methode additioner(t1,t2) devient =>
//        public static float[] additionner(float t1[], float t2[]) {
//            int min = Math.min(t1.length, t2.length);
//            float[] resultat = new float[min];
//            for (int i = 0; i < min; i++) {
//                resultat[i] = t1[i] + t2[i];
//            }
//            return resultat;
//        }


    }
}
