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
            } else if (toSpeed.equals("mi/s")) {
                result = value / 1609.344;
            } else if (toSpeed.equals("mph")) {
                result = (value / 1609.344) * 3600;
            } else if (toSpeed.equals("ft/s")) {
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
                result = value * 3600;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 1000000;
            } else if (toSpeed.equals("µm/s")) {
                result = value * 1000000000;
            } else if (toSpeed.equals("mi/s")) {
                result = value * 0.621371192;
            } else if (toSpeed.equals("mph")) {
                result = value * 2.23693629;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 3280.839895;
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
            } else if (toSpeed.equals("km/s")) {
                result = value / 3600;
            } else if (toSpeed.equals("mm/s")) {
                result = (value / 3.6) * 1000;
            } else if (toSpeed.equals("µm/s")) {
                result = (value / 3.6) * 1000000;
            } else if (toSpeed.equals("mi/s")) {
                result = (value / 3.6) * 0.000621371;
            } else if (toSpeed.equals("mph")) {
                result = value * 0.621371;
            } else if (toSpeed.equals("ft/s")) {
                result = (value / 3.6) * 3.28084;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean millimetersPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("mm/s")) {
            if(toSpeed.equals("m/s")) {
                result = value / 1000;
            } else if (toSpeed.equals("km/s")) {
                result = (value / 1000) / 1000;
            } else if (toSpeed.equals("km/h")) {
                result = ((value / 1000) * 3.6) / 1000;
            } else if (toSpeed.equals("µm/s")) {
                result = value * 1000;
            } else if (toSpeed.equals("mi/s")) {
                result = (value / 1000) * 0.000621371;
            } else if (toSpeed.equals("mph")) {
                result = ((value / 1000) * 3.6) * 0.621371;
            } else if (toSpeed.equals("ft/s")) {
                result = value / 0.0032808;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean micrometersPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("µm/s")) {
            if(toSpeed.equals("m/s")) {
                result = value * 0.000001;
            } else if (toSpeed.equals("km/s")) {
                result = (value * 0.000000001) / 1000;
            } else if (toSpeed.equals("km/h")) {
                result = value * 0.0036;
            } else if (toSpeed.equals("mm/s")) {
                result = value / 1000;
            } else if (toSpeed.equals("mi/s")) {
                result = value * 0.000000000621371;
            } else if (toSpeed.equals("mph")) {
                result = value * 0.00223694;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 0.0000032808;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

    public boolean milesPerSecondTo(double value, String toSpeed) {
        this.value = value;
        this.toSpeed = toSpeed;

        if (!toSpeed.equals("mi/s")) {
            if(toSpeed.equals("m/s")) {
                result = value * 1609.344;
            } else if (toSpeed.equals("km/s")) {
                result = value * 1.609344;
            } else if (toSpeed.equals("km/h")) {
                result = value * 5793.638;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 1609344;
            } else if (toSpeed.equals("µm/s")) {
                result = (value * 1.609) * Math.pow(10, 9);
            } else if (toSpeed.equals("mph")) {
                result = value * 3600;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 5280;
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
            } else if (toSpeed.equals("km/s")) {
                result = value * 0.00044704;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 447040;
            } else if (toSpeed.equals("µm/s")) {
                result = (value * 0.44704) * Math.pow(10, 9);
            } else if (toSpeed.equals("mi/s")) {
                result = value / 3600;
            } else if (toSpeed.equals("ft/s")) {
                result = value * 1.46667;
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
            } else if (toSpeed.equals("km/s")) {
                result = value * 0.0003048;
            } else if (toSpeed.equals("mm/s")) {
                result = value * 304.8;
            } else if (toSpeed.equals("µm/s")) {
                result = value * 304800;
            } else if (toSpeed.equals("mi/s")) {
                result = value * 0.000189394;
            } else if (toSpeed.equals("mph")) {
                result = value * 0.681818;
            }
            return true;
        } else {
            System.out.println("Velocidade de destino inválida.");
            return false;
        }
    }

}
