package Maze_GOFDesignPatten;

public class Room extends MapSite {
    private int roomNumber;
    private MapSite[] sides = new MapSite[4]; // 4 sides adjacent to 4 different MapSites


    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void enter() {
        //d say "Go East," thegame can simply determine which MapSite
        //is immediately to theeast and then call Enter on it.

        // figure out why it is a location change or a nose bump
        // take Player Object as a param and move about
    }

    public void setSide(Directioin directioin, MapSite mapSite){
        if(directioin == Directioin.EAST)
            mapSite = new Wall();
        else if(directioin == Directioin.NORTH)
            mapSite = new Room(1);
        //....


    }

    public MapSite getSide(Directioin directioin){
        // decide which MapSite to enter into, e.g. if East, then the Mapsite is a wall,
        return new Wall();
    }
}
