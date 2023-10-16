package TD3EX2;
public class Main {
    public static void main(String[] args) {
        Dictionnaire dico=new Dictionnaire("Larousse");
        MotDico mot1=new MotDico("Chat","Un chat est un animal domestique à fourrure");
        MotDico mot2=new MotDico("Chat","Un chat est un animal domestique à fourrure");
        MotDico mot3=new MotDico("Bateau ","Un bateau est un véhicule conçu pour flotter sur l'eau");
        dico.ajouterMot(mot1);
        dico.ajouterMot(mot2);
        dico.ajouterMot(mot3);
        System.out.println("Contenu du dictionnaire Larousse :");
        dico.listerDico();
        int indic1 = dico.chercherMot("amour");
        if (indic1 == -1) {
            System.out.println("Le mot amour n'existe pas");
        }
        int indic2 =dico.chercherMot("Chat");
        if (indic2 != -1) {
            MotDico mot=dico.dico[indic2];
            System.out.println(mot.toString());
        }
        int nbsynon=dico.nbSynonymes(mot1);
        System.out.println("Nombre de synonymes de : "+mot1.getMot()+" = "+nbsynon);
        dico.supprimerMot(mot1.getMot());
        System.out.println("dictionnaire Larousse après suppression :");
        dico.listerDico();

    }
}
