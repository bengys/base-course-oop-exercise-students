package Entities;

import Missions.IntelligenceMission;

public class Sensor {
    String CollectIntelligence(String vehicleName, String pilotName, IntelligenceMission mission, String sensorType)
    {
        String intel = pilotName + ": " + vehicleName + " Collecting Data in " + mission.getRegion() +
                " with sensor type: " + sensorType;
        return intel;
    }
}
