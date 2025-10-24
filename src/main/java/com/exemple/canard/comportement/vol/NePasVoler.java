package com.exemple.canard.comportement.vol;

public class NePasVoler implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("❌ Je ne peux pas voler");
    }
}
