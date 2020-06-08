package AerialVehicles;

public interface AerialAttackVehicle {

    public String attack();
    public int GetNumberOfMissiles();
    public String GetMissileType();
    public void SetNumberOfMissiles(int numMissiles);
    public void SetMissileType(String MissileType);
}
