package com.exemple.canard.comportement.cancanement;

public class CanardMuet implements ComportementCancanement {
    @Override
    public void cancaner() {
        System.out.println("🤐 <silence>");
    }
}
