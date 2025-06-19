package models;

public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    //MR attribut en final
    private Bloc[] blocs;

    public Horaire() {
        this.blocs = new Bloc[NBRE_DE_BLOCS];
        blocs[0] = new Bloc("B1S1");
        blocs[1] = new Bloc("B2S1");
        blocs[2] = new Bloc("B3S1");
        blocs[3] = new Bloc("B4S2");
        blocs[4] = new Bloc("B5S2");
        blocs[5] = new Bloc("B6S2");
    }
    
    public boolean planifier(ModuleInfo[] modules, Professeur[] profs){
        boolean resultat = false;

        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                break;
            }
            for (int j = 0; j < profs.length; j++) {
                if (profs[i].modulesEnseignes.equals(modules)) {
                    modules[i].setProfesseur(profs[j]);
                    resultat = true;
                    break;
                }
            }
            if (!resultat) {
                break;
            }
            //MR Il manque la deuxième partie qui est de planifer dans le bloc
        }
        return resultat;
    }

    public void afficherHoraire(){
        for (int i = 0; i < blocs.length; i++) {
            blocs[i].afficherHoraire();
        }
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module){
        boolean resultat;
        Bloc bloco = new Bloc(null);
        for (int i = 0; i < blocs.length; i++) {
            resultat = blocs[i].ContientModule(module);
            if (resultat) {
                //MR Ici il faut directement donner la référence du bloc et pas en recréer un autre
                bloco = new Bloc(blocs[i].getNom());
                break;
            }
        }

        return bloco;
    }
}
