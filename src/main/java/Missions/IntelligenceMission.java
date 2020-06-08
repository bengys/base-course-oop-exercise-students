package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{

    protected String Region;

    public IntelligenceMission(String region, Coordinates coordinates) {
        Coordinate = coordinates;
        Region = region;

    }

    public String getRegion()
    {
        return Region;
    }



}
