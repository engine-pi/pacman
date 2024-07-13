package de.pirckheimer_gymnasium.pacman.actors;

public enum GhostState
{
    UP("up"), LEFT("left"), RIGHT("right"), DOWN("down");

    private final String fileName;

    GhostState(String fileName)
    {
        this.fileName = fileName;
    }

    public String getImagePath(int no)
    {
        return "images/ghosts/Blinky_" + fileName + "-" + no + ".png";
    }
}
