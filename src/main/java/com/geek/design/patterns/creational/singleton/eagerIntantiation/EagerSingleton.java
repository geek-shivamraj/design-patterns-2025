package com.geek.design.patterns.creational.singleton.eagerIntantiation;

/**
 * Way 1: Eager Initialization
 *<p>
 * To make a class Singleton in Java, we ensure only one instance exists & provide a global access point.
 *<p><p>
 *  Eager/Early Instantiation:
 *      - This approach creates the instance at the time of class loading
 *<p><p>
 *  Pros:
 *      - Simple & thread-safe without synchronization<p><p>
 *  Cons:
 *      - Instance is created even if it's never used, potentially wasting resource
 */

public class EagerSingleton {

    // Create instance at class loading time
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        // private constructor - To prevent from direct instantiation.
    }

    // Returns the single instance of the class using class name.
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
