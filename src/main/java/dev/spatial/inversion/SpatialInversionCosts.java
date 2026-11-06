package dev.spatial.inversion;

/**
 * Computation Points (CP) and Overheat cost constants for all 8 Spatial Inversion abilities.
 */
public final class SpatialInversionCosts {
    private SpatialInversionCosts() {}

    // Level 1
    public static final float LINK_CP = 60f;
    public static final float LINK_OVERLOAD = 18f;
    public static final float LINK_OVERHEAT = 18f;

    // Level 2
    public static final float REDIRECT_CP = 45f;
    public static final float REDIRECT_OVERLOAD = 14f;
    public static final float REDIRECT_OVERHEAT = 14f;

    public static final float FOLD_CP = 50f;
    public static final float FOLD_OVERLOAD = 15f;
    public static final float FOLD_OVERHEAT = 15f;

    // Level 3
    public static final float EXCHANGE_CP = 75f;
    public static final float EXCHANGE_OVERLOAD = 24f;
    public static final float EXCHANGE_OVERHEAT = 24f;

    public static final float DISTORTION_CP = 80f;
    public static final float DISTORTION_OVERLOAD = 25f;
    public static final float DISTORTION_OVERHEAT = 25f;

    // Level 4
    public static final float STRIKE_CP = 90f;
    public static final float STRIKE_OVERLOAD = 28f;
    public static final float STRIKE_OVERHEAT = 28f;

    public static final float CAGE_CP = 140f;
    public static final float CAGE_OVERLOAD = 45f;
    public static final float CAGE_OVERHEAT = 45f;

    // Level 5 (Ultimate)
    public static final float ABSOLUTE_CP = 260f;
    public static final float ABSOLUTE_OVERLOAD = 75f;
    public static final float ABSOLUTE_OVERHEAT = 75f;
}
