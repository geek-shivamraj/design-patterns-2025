package com.geek.design.patterns.solid.interfaces.segregation.solution;

public class Chef implements ChefInterface{

    @Override
    public void cookFood() {
        // Chef specific
    }

    @Override
    public void decideMenu() {
        // Chef specific
    }
}
