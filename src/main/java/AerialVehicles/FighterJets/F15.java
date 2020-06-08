package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.FighterJet;

public class F15 extends FighterJet implements AerialAttackVehicle, AerialIntelligenceVehicle {
    public F15(string sensorType, int numMissiles) {
    }

    @java.lang.Override
    public String attack() {
        return null;
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
    public String collectIntelligence() {
        return null;
    }

    @java.lang.Override
    public String GetSensorType() {
        return null;
    }

    @java.lang.Override
    public void SetSensorType(String sensortype) {

    }
}
