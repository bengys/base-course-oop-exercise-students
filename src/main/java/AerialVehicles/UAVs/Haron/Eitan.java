package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Eitan extends Haron implements AerialAttackVehicle, AerialIntelligenceVehicle {

    String MissileType;
    String SensorType;
    int NumberOfMissiles;

    public Eitan(int numberMissiles, String missileName, String sensorName, String pilotName, Mission missionType, int hoursSinceLastRepair, boolean flightReadinessStatus) {
    }

    @java.lang.Override
    public String attack() {
        AttackMission attackMission = (AttackMission)Mission;
        String attackDesc = PilotName + ": " + "Eitan Attacking " + attackMission.getTarget() + " with: " +
                GetMissileType() + "X" + GetNumberOfMissiles();
        return attackDesc;
    }

    @java.lang.Override
    public int GetNumberOfMissiles() {
        return NumberOfMissiles;
    }

    @java.lang.Override
    public String GetMissileType() {
        return MissileType;
    }

    @java.lang.Override
    public void SetNumberOfMissiles(int numMissiles) {
        NumberOfMissiles = numMissiles;
    }

    @java.lang.Override
    public void SetMissileType(String missileType) { MissileType = missileType;}

    @java.lang.Override
    public String collectIntelligence() {

        IntelligenceMission intelMission = (IntelligenceMission)Mission;
        String intel = PilotName + ": " + "Eitan Collecting Data in " + intelMission.getRegion() + " with sensor type: " + GetSensorType();
        return intel;
    }

    @java.lang.Override
    public String GetSensorType() { return SensorType;}


    @java.lang.Override
    public void SetSensorType(String sensortype){SensorType = sensortype; }
}
