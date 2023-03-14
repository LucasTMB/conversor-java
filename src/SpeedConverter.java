public class SpeedConverter {
    private double metersPerSecond;
    private double kilometersPerHour;
    private double milesPerHour;
    private double feetPerSecond;
    private double knots;
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
            if (toSpeed.equals("km/h")) {
                result = value * 3.6;
            } else if (toSpeed.equals("mph")) {
                result = (value / 1609.344) * 3600;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 3.281;
            } else if (toSpeed.equals("kn")) {
                result = value * 1.944;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean kilometersPerHourTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("km/h")) {
            if(toSpeed.equals("m/s")) {
                result = value / 3.6;
            } else if (toSpeed.equals("mph")) {
                result = value * 0.621371;
            } else if (toSpeed.equals("ft/s")) {
                result = (value / 3.6) * 3.28084;
            } else if (toSpeed.equals("kn")) {
                result = value / 1.852;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean milesPerHourTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("mph")) {
            if(toSpeed.equals("m/s")) {
                result = value * 0.44704;
            } else if (toSpeed.equals("km/h")) {
                result = value * 1.60934;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 1.46667;
            } else if (toSpeed.equals("kn")) {
                result = value / 1.151;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean feetPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("ft/s")) {
            if(toSpeed.equals("m/s")) {
                result = value * 0.3048;
            } else if (toSpeed.equals("km/h")) {
                result = value * 1.09728;
            } else if (toSpeed.equals("mph")) {
                result = value * 0.681818;
            } else if (toSpeed.equals("kn")) {
                result = value / 1.688;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean knotsTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("kn")) {
            if(toSpeed.equals("m/s")) {
                result = value / 1.944;
            } else if (toSpeed.equals("km/h")) {
                result = value * 1.852;
            } else if (toSpeed.equals("mph")) {
                result = value * 1.151;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 1.688;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

}
