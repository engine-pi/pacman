package de.pirckheimer_gymnasium.pacman.actors;

public enum GhostState {
    UP("up"), LEFT("left"), RIGHT("right"), DOWN("down");

    private final String fileName;

    GhostState(String fileName) {
        this.fileName = fileName;
    }

    public String getImagePath(String ghostName, int no) {
        return "images/ghosts/" + ghostName + "_" + fileName + "-" + no + ".png";
    }
}
