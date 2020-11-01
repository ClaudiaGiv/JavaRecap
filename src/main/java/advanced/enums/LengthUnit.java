package advanced.enums;

public enum LengthUnit {

    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);
    double value;

    LengthUnit(double value) {
        this.value = value;
    }

    // returns value length in meters
    double convertToMeters() {
        return value;
    }
}
