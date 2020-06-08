package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.FighterJet;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class F15 extends FighterJet implements AerialAttackVehicle, AerialIntelligenceVehicle {

    int NumMissiles;
    String MissileType;
    String SensorType;

    public F15(String sensorType, int numMissiles, String missileType, String pilotName,
               Mission mission, int numHoursSinceLastRepair, boolean isFlightReady) {
        SetSensorType(sensorType);
        SetNumberOfMissiles(numMissiles);
        SetMissileType(missileType);
        PilotName = pilotName;
        Mission = mission;
        NumberOfHoursSinceLastRepair = numHoursSinceLastRepair;
        IsFlightReady = isFlightReady;
    }

    @java.lang.Override
    public String attack() {
        AttackMission attackMission = (AttackMission)Mission;
        String attackDesc = PilotName + ": " + "F15 Attacking " + attackMission.getTarget() + " with: " +
            GetMissileType() + "X" + GetNumberOfMissiles();
        return attackDesc;

    }

    @java.lang.Override
    public int GetNumberOfMissiles(){
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
    public String collectIntelligence()
    {
        IntelligenceMission intelMission = (IntelligenceMission)Mission;
        String intel = PilotName + ": " + "F15 Collecting Data in " + intelMission.getRegion() + " with sensor type: " + GetSensorType();
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
