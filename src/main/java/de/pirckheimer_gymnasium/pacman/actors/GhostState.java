package de.pirckheimer_gymnasium.pacman.actors;

public enum GhostState {
    UP("up"), LEFT("left"), RIGHT("right"), DOWN("down");

    private final String filename;

    GhostState(String filename) {
        this.filename = filename;
    }

    public String getImageLocation(String ghostName, int no) {
        return "images/ghosts/" + ghostName + "_" + filename + "-" + no + ".png";
    }
}
