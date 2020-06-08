package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {

    String pilotName;
    Mission mission;
    int numberOfHoursSinceLastFlight;
    boolean isFlightReady;

    public void setMission(Mission mission) {

    }

    public void setHoursOfFlightSinceLastRepair(int hours)
    {

    }

    public void check()
    {

    }
}
