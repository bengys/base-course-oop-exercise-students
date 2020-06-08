package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {

    String Objective;

    public BdaMission(String objective, Coordinates coordinates) {
        Objective = objective;
        Coordinate = coordinates;
    }

    public String getObjective()
    {
        return Objective;
    }
}
