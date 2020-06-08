package Missions;


import Entities.Coordinates;

public abstract class Mission{
    Coordinates Coordinate;

    void begin()
    {
        System.out.println("Beginning Mission!");
    }

    void cancel()
    {
        System.out.println("Abort Mission!");
    }

    void finish()
    {
        System.out.println("Finish Mission!");
    }

    public Coordinates getCoordinate()
    {
        return Coordinate;
    }



}
