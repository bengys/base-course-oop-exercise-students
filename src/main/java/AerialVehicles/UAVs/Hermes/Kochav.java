package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.*;

public class Kochav extends Hermes implements AerialAttackVehicle, AerialBdaVehicle, AerialIntelligenceVehicle {

    int numMissiles;
    String MissileType;

    public Kochav(int numMissiles, String missileType, String cameraType, String sensorType,
                  String pilotName, Mission mission, int numHoursSinceRepair, boolean isReady) {
        SetNumberOfMissiles(numMissiles);
        SetMissileType(missileType);
        SetCameraType(cameraType);
        SetSensorType(sensorType);
        PilotName = pilotName;
        Mission = mission;
        NumberOfHoursSinceLastRepair = numHoursSinceRepair;
        IsFlightReady = isReady;
    }

    @java.lang.Override
    public String attack() {
        AttackMission attackMission = (AttackMission)Mission;
        String attackDesc = PilotName + ": " + "Kochav Attacking " + attackMission.getTarget() + " with: " +
                GetMissileType() + "X" + GetNumberOfMissiles();
        return attackDesc;
    }

    @java.lang.Override
    public int GetNumberOfMissiles() {
        return 0;
    }

    @java.lang.Override
    public String GetMissileType() {
        return null;
    }

    @java.lang.Override
    public void SetNumberOfMissiles(int numMissiles) {

    }

    @java.lang.Override
    public void SetMissileType(String MissileType) {

    }

    @java.lang.Override
    public String GetCameraType() {
        return null;
    }

    @java.lang.Override
    public void SetCameraType(String CameraType) {

    }

    @java.lang.Override
    public String preformBda() {
        BdaMission bdaMission = (BdaMission) Mission;
        String bdaDesc = PilotName + ": " + "Kochav taking pictures of " + bdaMission.getObjective() +
                " with: " + GetCameraType();
        return bdaDesc;
    }

    @java.lang.Override
    public String collectIntelligence() {
        IntelligenceMission intelMission = (IntelligenceMission)Mission;
        String intel = PilotName + ": " + "Kochav Collecting Data in " + intelMission.getRegion() + " with sensor type: " + GetSensorType();
        return intel;
    }

    @java.lang.Override
    public String GetSensorType() {
        return null;
    }

    @java.lang.Override
    public void SetSensorType(String sensortype) {

    }
}
