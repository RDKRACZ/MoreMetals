package com.karpovanton.moremetals.common;

import com.karpovanton.moremetals.MoreMetals;

/**
 * A utility class for storing percentage values and randomizing them
 */
public class Percentage {
    // The integer representing the percentage
    private final int _percent;

    /**
     * Constructor
     * @param percent Integer percentage
     */
    public Percentage(int percent) {
        _percent = percent;
    }

    /**
     * Picks a random value and sees if percent is in range of it
     * @return Check result
     */
    public boolean randomize() {
        int randomPercent = MoreMetals.RANDOM.nextInt(100);

        // If percent is in range of random percent, then success
        return randomPercent <= _percent;
    }
}
