package Maze_GOFDesignPatten;

public class BombedMazeFactory extends MazeFactory {
    @Override
    Wall makeWall() {
        return new BombedWall();
    }

    @Override
    Room makeRoom(int roomNum) {
        return new RoomWithABomb(roomNum);
    }
}
