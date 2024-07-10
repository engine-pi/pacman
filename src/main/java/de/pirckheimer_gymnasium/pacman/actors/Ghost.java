package de.pirckheimer_gymnasium.pacman.actors;

import de.pirckheimer_gymnasium.engine_pi.actor.Animation;
import de.pirckheimer_gymnasium.engine_pi.actor.StatefulAnimation;

public class Ghost extends StatefulAnimation<GhostState> {
    private String name;

    public Ghost(
            String name) {
        // Alle Bilder haben die Amessung 64x64px und deshalb die gleiche Breite
        // und Höhe. Wir verwenden drei Meter.
        super(3, 3);
        this.name = name;

        setupPlayerStates();
        setupPhysics();
    }

    private void setupPlayerStates() {
        for (GhostState state : GhostState.values()) {
            Animation animationOfState = Animation
                    .createFromAnimatedGif(state.getImageLocation(name), 3, 3);
            addState(state, animationOfState);
        }
    }

    private void setupPhysics() {
        makeDynamic();
        setRotationLocked(true);
        setElasticity(0);
        setFriction(30);
        setLinearDamping(.3);
    }
}
