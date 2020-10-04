package Maze_GOFDesignPatten;

/**
 * MazeGame creates the maze.One straightforward
 * way to create a maze is with a series of operationsthat add components to a maze
 * and then interconnect them.
 */
public class MazeGame {
    // below is  hard-codes the class names, making
    //it difficult to create mazes with different components.
//    public Maze createMaze(){
//        Maze aMaze = new Maze();
//        Room r1 = new Room(1);
//        Room r2 = new Room(2);
//        Door theDoor = new Door(r1, r2);
//
//        aMaze.addRoom(r1);
//        aMaze.addRoom(r2);
//        r1.setSide(Directioin.NORTH,new Wall());
//        r1.setSide(Directioin.EAST,theDoor);
//        r1.setSide(Directioin.SOUTH,new Wall());
//        r1.setSide(Directioin.WEST,new Wall());
//
//        r2.setSide(Directioin.NORTH, new Wall());
//        r2.setSide(Directioin.EAST, new Wall());
//        r2.setSide(Directioin.WEST, new Wall());
//        r2.setSide(Directioin.SOUTH, theDoor);
//
//        return aMaze;
//    };

    // A more flexible way of createMaze() by taking a MazeFactory as a parameter:
    public Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door aDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Directioin.NORTH,factory.makeWall());
        r1.setSide(Directioin.EAST,aDoor);
        r1.setSide(Directioin.SOUTH,factory.makeWall());
        r1.setSide(Directioin.WEST,factory.makeWall());

        r2.setSide(Directioin.NORTH,factory.makeWall());
        r2.setSide(Directioin.EAST,factory.makeWall());
        r2.setSide(Directioin.SOUTH,factory.makeWall());
        r2.setSide(Directioin.WEST,aDoor);

        return aMaze;
    }
}
