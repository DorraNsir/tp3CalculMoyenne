package TD3EX2;

public class Dictionnaire {
    int nbMot ;
    MotDico[] dico ;
    String nom;

    public Dictionnaire(String nom) {
        this.dico= new MotDico[10];
        this.nom = nom;
    }
    public void ajouterMot(MotDico m) {
        if (nbMot < dico.length) {
            dico[nbMot] = m;
            nbMot++;
        } else
            System.out.println("tu ne peux pas ajouter de mots");

    }
    public void supprimerMot (String ch){
        for(int i=0;i< nbMot;i++){
            if(dico[i].getMot()==ch){
                dico[i] = null;
                nbMot--;
            }
            else
                System.out.println("le mots n'existe pas");
        }
    }
    public int chercherMot (String ch){
        for(int i=0;i< nbMot;i++){
            if(dico[i].getMot()==ch){
                return i;
            }
        }
        return -1;
    }
    public void listerDico (){
        for(int i=0;i< nbMot;i++){
            System.out.println(dico[i].toString());
        }
    }
    public int nbSynonymes (MotDico m){
        int nbSynon=0;
        for(int i=0;i<nbMot;i++){
            if(dico[i].synonyme(m))
                nbSynon++;
        }
        return nbSynon;
    }
}
