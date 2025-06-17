package models;


public class Professeur {
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
            if (modulesEnseignes[i].equals(nomDuModule)) {
                resultat = true;
            }
        }
        return resultat;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == null) {
                
            }
        }
    }

    public void viderModules() {
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
