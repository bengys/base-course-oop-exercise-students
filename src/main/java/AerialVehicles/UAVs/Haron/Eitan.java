package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public class Eitan extends Haron implements AerialAttackVehicle, AerialIntelligenceVehicle {

    String missileType;
    String sensorType;
    int numberOfMissiles;

    public Eitan(int numberMissiles, String missileName, String sensorName, String pilotName, Mission missionType, int hoursSinceLastRepair, boolean flightReadinessStatus) {
    }

    @java.lang.Override
    public String attack() {
        return "To be implemented";
    }

    @java.lang.Override
    public int GetNumberOfMissiles() {
        return  numberOfMissiles;
    }

    @java.lang.Override
    public String GetMissileType() {
        return missileType;
    }

    @java.lang.Override
    public void SetNumberOfMissiles(int numMissiles) {
        numberOfMissiles = numMissiles;
    }

    @java.lang.Override
    public void SetMissileType(String MissileType) { missileType = MissileType;}

    @java.lang.Override
    public String collectIntelligence() {
            return "TO BE IMPLEMENTED";
    }

    @java.lang.Override
    public String GetSensorType() { return sensorType;}


    @java.lang.Override
    public void SetSensorType(String sensortype){sensorType = sensortype; }
}
