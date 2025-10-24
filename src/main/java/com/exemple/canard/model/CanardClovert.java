package com.exemple.canard.model;

import com.exemple.canard.comportement.cancanement.CoinCoin;
import com.exemple.canard.comportement.vol.VolerAvecAiles;

public class CanardClovert extends Canard{
    public CanardClovert(){
        comportementVol= new VolerAvecAiles();
        comportementCancanement = new CoinCoin();
    }
    public void afficher(){
        System.out.println("Je suis Canard Clovert");
    }
}
