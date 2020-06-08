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

    public int getHoursOfFlightSinceLastRepair()
    {
        return 0;
    }

    public void check()
    {

    }

    public void flyTo()
    {

    }

    public void land()
    {

    }

    public void repair()
    {

    }
}
