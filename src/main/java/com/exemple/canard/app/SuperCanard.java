package com.exemple.canard.app;

import com.exemple.canard.comportement.cancanement.CanardMuet;
import com.exemple.canard.comportement.vol.NePasVoler;
import com.exemple.canard.model.Canard;
import com.exemple.canard.model.CanardClovert;

public class SuperCanard {
    public static void main(String[] args) {

        Canard colvert = new CanardClovert();
        colvert.afficher();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        System.out.println("==Echange de comportement==");

        colvert.setComportementCancanement(new CanardMuet());
        colvert.setComportementVol(new NePasVoler());
        colvert.effectuerCancan();
        colvert.effectuerVol();


    }
}
