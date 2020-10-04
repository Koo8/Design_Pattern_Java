package Maze_GOFDesignPatten;

public class EnchantedMazeFactory extends MazeFactory {
   public EnchantedMazeFactory(){}

    @Override
    Room makeRoom(int roomNum) {
        return new EnchantedRoom(roomNum,castSpell());
    }

    private Spell castSpell() {
       return new Spell();
    }

    @Override
    Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1,r2);
    }
}
