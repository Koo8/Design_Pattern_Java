package Maze_GOFDesignPatten;

/**
 * Maze represents a collection of rooms.Maze can also find a particular room
 * given a room number using its RoomNo operation
 */
public class Maze {
    // a collection of rooms
    public Room RoomNo(int roomNumber) {
        //RoomNo could do a look-up using a linear search, a hash table,or even a simple
        //array.
        return new Room(roomNumber);
    }

    public void addRoom(Room room) {
        // add room to Maze room collection
    }
}