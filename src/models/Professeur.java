package models;


public class Professeur {
    //MR Il manque le final pour les deux premiers attributs
    private String nom;
    private String prenom;
    ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.modulesEnseignes = new ModuleInfo[0] ;
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean resultat = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            //MR Tu ne peux pas comparer un module avec du String !!!
            if (modulesEnseignes[i].equals(nomDuModule)) {
                resultat = true;
                //MR Ici un petit break
            }
        }
        return resultat;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        //MR Regarde à nouveau l'insertion dans un tableau dynamique
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == null) {
                
            }
        }
    }

    public void viderModules() {
        //MR Il faut obenir un tableau de taille 0
        for (int i = 0; i < modulesEnseignes.length; i++) {
            modulesEnseignes[i] = null;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom.toUpperCase();
    }

}
