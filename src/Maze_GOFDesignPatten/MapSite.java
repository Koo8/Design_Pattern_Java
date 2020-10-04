package Maze_GOFDesignPatten;

public abstract class MapSite {
    // if enter into a Room, then your location change
    // if enter a door - 1. open? enter into a room 2. closed? bump your nose
    // if enter a wall, then bump your nose
    public abstract void enter();
}
