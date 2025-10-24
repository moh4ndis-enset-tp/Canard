package com.exemple.canard.model;

import com.exemple.canard.comportement.cancanement.ComportementCancanement;
import com.exemple.canard.comportement.vol.ComportementVol;

public abstract class Canard{
    protected ComportementVol comportementVol;
    protected ComportementCancanement comportementCancanement;

    public void effectuerVol(){
        comportementVol.voler();
    }

    public void effectuerCancan(){
        comportementCancanement.cancaner();
    }

    public void setComportementVol(ComportementVol cmpV){
        this.comportementVol=cmpV;
    }

    public void setComportementCancanement(ComportementCancanement cmpC){
        this.comportementCancanement=cmpC;
    }

    public ComportementCancanement getComportementCancanement(){
        return comportementCancanement;
    }

    public ComportementVol getComportementVol(){
        return comportementVol;
    }

    public abstract void afficher();
}