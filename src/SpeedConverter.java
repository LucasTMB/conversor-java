public class SpeedConverter {
    private double metersPerSecond;
    private double kilometersPerSecond;
    private double kilometersPerHour;
    private double millimetersPerSecond;
    private double micrometersPerSecond;
    private double milesPerSecond;
    private double milesPerHour;
    private double feetPerSecond;
    private double value;
    private String toSpeed;
    private double result;

    public double getResult() {
        return result;
    }

    public boolean metersPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("m/s")) {
            if(toSpeed.equals("km/s")) {
                result = value / 1000;
            } else if (toSpeed.equals("km/h")) {
                result = value * 3.6;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 1000;
            } else if (toSpeed.equals("µm/s")) {
                result = value * 1000000;
            } else if (toSpeed.equals("mps")) {
                result = value / 1609.344;
            } else if (toSpeed.equals("mph")) {
                result = (value / 1609.344) * 3600;
            } else if (toSpeed.equals("fps")) {
                result = value * 328084;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean kilometersPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("km/s")) {
            if(toSpeed.equals("m/s")) {
                result = value * 1000;
            } else if (toSpeed.equals("km/h")) {
                result = value * 3.600;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 1000000;
            } else if (toSpeed.equals("µm/s")) {
                result = value * 1000000000;
            } else if (toSpeed.equals("mps")) {
                result = value * 0.621371192;
            } else if (toSpeed.equals("mph")) {
                result = value * 2.23693629;
            } else if (toSpeed.equals("fps")) {
                result = value * 3280.839895;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

}
