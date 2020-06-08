package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.FighterJet;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class F16 extends FighterJet implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {

    int NumMissiles;
    String MissileType;
    String SensorType;
    String CameraType;

    public F16(String cameraType, int numMissiles, String missileType,
               String pilotName, Mission mission, int numHoursSinceRepair, boolean isReady) {
        SetCameraType(cameraType);
        SetNumberOfMissiles(numMissiles);
        SetMissileType(missileType);
        PilotName = pilotName;
        Mission = mission;
        NumberOfHoursSinceLastRepair = numHoursSinceRepair;
        IsFlightReady = isReady;



    }

    @java.lang.Override
    public String attack() {
        AttackMission attackMission = (AttackMission)Mission;
        String attackDesc = PilotName + ": " + "F16 Attacking " + attackMission.getTarget() + " with: " +
                GetMissileType() + "X" + GetNumberOfMissiles();
        return attackDesc;
    }

    @java.lang.Override
    public int GetNumberOfMissiles() {
        return NumMissiles;
    }

    @java.lang.Override
    public String GetMissileType() {
        return MissileType;
    }

    @java.lang.Override
    public void SetNumberOfMissiles(int numMissiles) {
        NumMissiles = numMissiles;
    }

    @java.lang.Override
    public void SetMissileType(String missileType) {
        MissileType = missileType;
    }

    @java.lang.Override
    public String GetCameraType() {
        return CameraType;
    }

    @java.lang.Override
    public void SetCameraType(String cameraType) {
        CameraType = cameraType;
    }

    @java.lang.Override
    public String preformBda() {
        BdaMission bdaMission = (BdaMission) Mission;
        String bdaDesc = PilotName + ": " + "F16 taking pictures of " + bdaMission.getObjective() +
                " with: " + GetCameraType();
        return bdaDesc;
    }

    @java.lang.Override
    public String collectIntelligence() {
        IntelligenceMission intelMission = (IntelligenceMission)Mission;
        String intel = PilotName + ": " + "F16 CEollecting Data in " + intelMission.getRegion() + " with sensor type: " + GetSensorType();
        return intel;
    }

    @java.lang.Override
    public String GetSensorType() {
        return SensorType;
    }

    @java.lang.Override
    public void SetSensorType(String sensortype) {
        SensorType = sensortype;
    }
}
