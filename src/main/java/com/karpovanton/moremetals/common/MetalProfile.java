package com.karpovanton.moremetals.common;

/**
 * A profile for transferring metal data
 */
public class MetalProfile {
    // Metal settings
    private MetalSettings _settings;
    // Ticks counter
    private int _ticks;
    // Electricity counter
    private int _electricity;

    /**
     * Constructor
     * @param settings Metal settings
     * @param ticks Ticks counter
     * @param electricity Electricity counter
     */
    public MetalProfile(MetalSettings settings, int ticks, int electricity) {
        _settings = settings;
        _ticks = ticks;
        _electricity = electricity;
    }


    public MetalSettings getSettings() {
        return _settings;
    }

    public void setSettings(MetalSettings settings) {
        _settings = settings;
    }

    public int getTicks() {
        return _ticks;
    }

    public void setTicks(int ticks) {
        _ticks = ticks;
    }

    public int getElectricity() {
        return _electricity;
    }

    public void setElectricity(int electricity) {
        _electricity = electricity;
    }
}
