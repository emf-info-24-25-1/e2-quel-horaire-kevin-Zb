import models.Horaire;
import models.ModuleInfo;
import models.Professeur;
import services.ServiceFormationMaitres;

public class App {

    public static final String[] NOMS_MODULES = {"G300","187","162","123","293","117","164","216","106", "231","122","431"};

    public static void main(String[] args) {
        Horaire horaire = new Horaire();

        ModuleInfo[] modules1ere = new ModuleInfo[12];

        for (int i = 0; i < modules1ere.length; i++) {
            modules1ere[i] = new ModuleInfo(NOMS_MODULES[i]);
        }
        
        Professeur[] profs = new Professeur[5];

        do {
            services.ServiceFormationMaitres.attribuerModules(profs, modules1ere);
        } while (!services.ServiceFormationMaitres.tousModulesCouverts(profs, modules1ere));

        System.out.println("L'école a engagé les professeurs suivants");

        for (int i = 0; i < profs.length; i++) {
            System.out.print("-" + profs[i] + " peut enseigner les modules :");
            for (int j = 0; j < profs.length; j++) {
                System.out.print(profs[i].getModulesEnseignes());
            }
        }

        System.out.println("\nIl est temps de préparer l'horaire.\n");

        boolean succes = horaire.planifier(modules1ere,profs);

        if (succes) {
            System.out.println("Modules planifié avec succès!");
            horaire.afficherHoraire();
        }
        else {
            System.out.println("Probleme de planification!!");
        }
    }
    
}
