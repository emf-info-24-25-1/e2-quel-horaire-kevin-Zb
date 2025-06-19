package models;

public class ModuleInfo {
    //MR Manque le final
    private String nom;
    private Professeur professeur;

    public ModuleInfo(String nom) {
        this.nom = nom;
        this.professeur = null;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        //MR Pourquoi 122 ?
        String total = null;
        if (professeur == null) {
            total = "122";
        }
        else {
            total = "122" + professeur;
        }
        return total;
    }
    
}
