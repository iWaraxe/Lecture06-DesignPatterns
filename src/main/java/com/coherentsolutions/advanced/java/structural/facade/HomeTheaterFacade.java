package com.coherentsolutions.advanced.java.structural.facade;

import com.coherentsolutions.advanced.java.structural.facade.subsystems.DVDPlayer;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.Lights;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.Projector;
import com.coherentsolutions.advanced.java.structural.facade.subsystems.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
