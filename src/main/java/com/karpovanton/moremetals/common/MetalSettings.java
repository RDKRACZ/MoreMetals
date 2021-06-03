package com.karpovanton.moremetals.common;

/**
 * Metal settings class
 */
public class MetalSettings {
    // Sharpness effect chance
    private Percentage _sharpness;

    // Sharpness damage
    private float _sharpnessDamage;

    // Radiation effect chance
    private Percentage _radiation;

    // Radiation duration
    private int _radiationDuration;

    // Electrical shock effect chance
    private Percentage _electricalShock;

    // Electrical shock damage
    private float _electricalShockDamage;

    // Electrical capacity
    private int _electricalCapacity;

    // Is stabilized (immune to radiation)
    private boolean _isStabilized;

    /**
     * Default constructor
     */
    public MetalSettings() {
        _sharpness = new Percentage(0);
        _sharpnessDamage = 0;
        _radiation = new Percentage(0);
        _radiationDuration = 0;
        _electricalShock = new Percentage(0);
        _electricalShockDamage = 0;
        _electricalCapacity = 0;
        _isStabilized = false;
    }

    public MetalSettings setSharpness(Percentage sharpness) {
        _sharpness = sharpness;
        return this;
    }

    public MetalSettings setSharpnessDamage(float sharpnessDamage) {
        _sharpnessDamage = sharpnessDamage;
        return this;
    }

    public MetalSettings setRadiation(Percentage reactivity) {
        _radiation = reactivity;
        return this;
    }

    public MetalSettings setRadiationDuration(int reactivityDuration) {
        _radiationDuration = reactivityDuration;
        return this;
    }

    public MetalSettings setElectricalShock(Percentage electricalShock) {
        _electricalShock = electricalShock;
        return this;
    }

    public MetalSettings setElectricalShockDamage(float electricalShockDamage) {
        _electricalShockDamage = electricalShockDamage;
        return this;
    }

    public MetalSettings setElectricalCapacity(int electricalCapacity) {
        _electricalCapacity = electricalCapacity;
        return this;
    }

    public MetalSettings stabilize() {
        _isStabilized = false;
        return this;
    }

    public Percentage getSharpness() {
        return _sharpness;
    }

    public float getSharpnessDamage() {
        return _sharpnessDamage;
    }

    public Percentage getRadiation() {
        return _radiation;
    }

    public int getRadiationDuration() {
        return _radiationDuration;
    }

    public Percentage getElectricalShock() {
        return _electricalShock;
    }

    public float getElectricalShockDamage() {
        return _electricalShockDamage;
    }

    public int getElectricalCapacity() {
        return _electricalCapacity;
    }

    public boolean isStabilized() {
        return _isStabilized;
    }
}
