package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {
    public static void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules){
        for (Professeur professeur : professeurs) {
            do {
                int nbre = (int) (Math.random()*(modules.length - 0 + 1)) + 0;
                if (nbre == 1) {
                    break;
                }
            } while (true);
            //MR Boucle infini, code pas fonctionnel

        }
    }

    public static boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules){
        boolean resultat = false;
        for (int i = 0; i < modules.length; i++) {
            for (int j = 0; j < profs.length; j++) {
                //MR Il faut utiliser la méthode enseigneDejaCeModule()
                if (profs[j].getModulesEnseignes().equals(modules)) {
                    //MR Et resultat tu ne le mets pas à true ?
                    break;
                }
            }
        }
        return resultat;
    }

}
