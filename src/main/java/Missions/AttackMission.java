package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends  Mission{

    String Target;

    public AttackMission(String target, Coordinates coordinates) {
        Target = target;
        Coordinate = coordinates;
    }

    public String getTarget()
    {
        return Target;
    }

}
