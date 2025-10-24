package com.exemple.canard.model;

import com.exemple.canard.comportement.cancanement.CanardMuet;
import com.exemple.canard.comportement.vol.NePasVoler;

public class CanardPlastique extends Canard{

    public CanardPlastique(){
        comportementCancanement = new CanardMuet();
        comportementVol = new NePasVoler();
    }

    public void afficher(){
        System.out.println("Je suis canard en plastic");
    }
}


