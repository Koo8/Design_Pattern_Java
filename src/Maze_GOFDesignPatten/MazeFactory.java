package Maze_GOFDesignPatten;

/**
 * Class MazeFactory can create components of mazes. It builds rooms, walls, and
 * doors between rooms. It might be used by a program that reads plans for mazes
 * from a file and builds the corresponding maze. Or it might be used by a program
 * that builds mazes randomly. Programs that build mazes take a MazeFactory as an
 * argument so that the programmer can specify the classes of rooms, walls, and doors
 * to construct.
 *
 * . Because the MazeFactory is a concrete
 * class consisting entirely of factory methods, it's easy to make a new MazeFactory
 * by making a subclass and overriding the operations that need to change.
 */
public class MazeFactory {
    public MazeFactory() {}

    Maze makeMaze() {
        return new Maze();
    }
    Wall makeWall(){
        return new Wall();
    }
    Room makeRoom(int roomNum) {
        return new Room(roomNum);
    }
    Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

}

