package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public class Eitan extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {
    public Eitan(int numberMissiles, String missileName, String sensorName, String pilotName, Mission missionType, int hoursSinceLastRepair, boolean flightReadinessStatus) {
    }

    @java.lang.Override
    public String attack() {
        return "To be implemented";
    }

    @java.lang.Override
    public String collectIntelligence() {
            return "TO BE IMPLEMENTED";
    }
}
