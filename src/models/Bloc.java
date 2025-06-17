package models;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Bloc {
    public static final int NBRE_DEMI_JOUR_SEMAINE = 10;

    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        this.modules = new ModuleInfo[NBRE_DEMI_JOUR_SEMAINE];
        ModuleInfo matu = new ModuleInfo("MATU");
        for (int i = 0; i < modules.length - 6; i++) {
            modules[i] = matu;
        }
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean resultat = false;
        int nbreTrouve = 0;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                modules[i] = module;
                nbreTrouve++;
                if (nbreTrouve == 3) {
                    resultat = true;
                    break;
                }
            }
        }
        return resultat;
    }

    public void afficherHoraire() {
        String matin = null;
        for (int i = 0; i < modules.length; i++) {
            String jour = DayOfWeek.values()[i/2].getDisplayName(TextStyle.FULL, Locale.FRANCE);
            if (i % 2 == 1) {
                matin = "après-midi";
            }
            else{
                matin = "matin";
                System.out.println(jour);
            }
            System.out.println(" " + matin + " : " + modules[i]);
        }
    }

    public boolean estTotalementPlanifie() {
        boolean resultat = true;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                resultat = false;
                break;
            }
        }
        return resultat;
    }

    public boolean ContientModule(ModuleInfo module) {
        boolean resultat = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i].equals(module)) {
                resultat = true;
                break;
            }
        }
        return resultat;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
