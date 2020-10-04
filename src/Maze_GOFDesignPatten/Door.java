package Maze_GOFDesignPatten;

public class Door extends MapSite {
    public boolean isOpen;
    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2) {

    }

    @Override
    public void enter() {

    }

    //Door(Room* = 0, Room* = 0);
    //Room* OtherSideFrom(Room*);
}
