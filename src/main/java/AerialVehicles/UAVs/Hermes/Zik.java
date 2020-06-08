package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends Hermes implements AerialBdaVehicle, AerialIntelligenceVehicle {

    String CameraType;
    String SensorType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int numHoursSinceRepair, boolean isReady) {
        SetCameraType(cameraType);
        SetSensorType(sensorType);
        PilotName = pilotName;
        Mission = mission;
        NumberOfHoursSinceLastRepair = numHoursSinceRepair;
        IsFlightReady = isReady;
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
        String bdaDesc = PilotName + ": " + "Zik taking pictures of " + bdaMission.getObjective() +
                " with: " + GetCameraType();
        return bdaDesc;
    }

    @java.lang.Override
    public String collectIntelligence() {
        IntelligenceMission intelMission = (IntelligenceMission)Mission;
        String intel = PilotName + ": " + "Zik Collecting Data in " + intelMission.getRegion() + " with sensor type: " + GetSensorType();
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
