package AerialVehicles;

import Missions.Mission;


public abstract class AerialVehicle {

    protected String PilotName;
    protected Mission Mission;
    protected int NumberOfHoursSinceLastRepair;
    protected boolean IsFlightReady;

    final int maintenanceIntervalHours;

    protected AerialVehicle(int maintenanceIntervalHours) {
        this.maintenanceIntervalHours = maintenanceIntervalHours;
    }

    public void setMission(Mission mission) {

    }


    public void setHoursOfFlightSinceLastRepair(int hours)
    {

    }

    public int getHoursOfFlightSinceLastRepair()
    {
        return 0;
    }

    public void check()
    {
        if(getHoursOfFlightSinceLastRepair() > maintenanceIntervalHours)
        {
            repair();
        }
    }

    public void flyTo()
    {

        System.out.println("Flying to: " + Mission.getCoordinate().getLatitude() + Mission.getCoordinate().getLongitude());
    }

    public void land()
    {
        System.out.println("Landing");
    }

    public void repair()
    {
        IsFlightReady = false;
        setHoursOfFlightSinceLastRepair(0);
    }
}
g