package com.coherentsolutions.advanced.java.structural.facade;

import com.coherentsolutions.advanced.java.structural.facade.subsystems.DVDPlayer;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.Lights;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.Projector;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.SoundSystem;

public class FacadePatternExample {
    public static void main(String[] args) {
        // Create subsystem components
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

        // Use the facade to watch a movie
        homeTheater.watchMovie("Inception");

        // Use the facade to end the movie
        homeTheater.endMovie();
    }
}
